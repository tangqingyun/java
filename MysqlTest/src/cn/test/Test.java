package cn.test;

import java.sql.*;

import com.data.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String driver = "com.mysql.jdbc.Driver";// ����������
			String url = "jdbc:mysql://192.168.7.87:3306/blogs";// URLָ��Ҫ���ʵ����ݿ���mysql
			String user = "admin";
			String password = "123456";

			IDatabase db = new Database(driver, url, user, password);
     
			String sql="INSERT INTO users(name,password) values(?,?)";
			db.executeSQL(sql,"test01","000000");
			
			ResultSet rs = db.executeAsResultSet("select * from users");

			// ���������
			while (rs.next()) {
				String id = rs.getString("id");
				System.out.println(id);
			}
			rs.close();// �ر����ݿ�

		} catch (Exception ex) {

			System.out.println("Error : " + ex.toString());
		}

	}

}