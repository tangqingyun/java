package com.data;

import java.sql.*;

public class Database implements IDatabase {

	String driver;
	String url;
	String user;
	String password;
	int isRegDriver; // 是否注册数据库连接驱动类

	public Database(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}

	/*
	 * 获取连接
	 */
	public Connection getConnection() {
		Connection conn;
		try {
			if (isRegDriver == 0) {
				Class.forName(driver);
				isRegDriver = 1;
			}
			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			conn = null;
			e.printStackTrace();
		}
		return conn;
	}

	public boolean executeSQL(String sql, Object... args) {
		boolean bol = false;
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			conn = getConnection();
			stat = conn.prepareStatement(sql);

			for (int i = 0; i < args.length; i++) {
				stat.setObject(i + 1, args[i]);
			}
			stat.executeUpdate();
			bol = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stat, conn);
		}
		return bol;
	}

	public ResultSet executeAsResultSet(String sql, Object... args) {

		Connection conn = getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;

		try {
			stat = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				stat.setObject(i + 1, args[i]);
			}
			rs = stat.executeQuery();

		} catch (SQLException e) {
			close(rs, stat, conn);
			e.printStackTrace();
		} finally {
			// close(rs, stat, conn);
		}
		return rs;

	}

	
	/**
	 * * 释放连接 * @param stat * @param conn
	 */
	public void close(PreparedStatement stat, Connection conn) {
		close(null, stat, conn);
	}

	/**
	 * 释放连接 * @param rs * @param stat * @param conn
	 */
	public void close(ResultSet rs, PreparedStatement stat, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stat != null) {
					stat.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
