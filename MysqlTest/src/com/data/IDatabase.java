package com.data;

import java.sql.ResultSet;

public interface IDatabase {

	public boolean executeSQL(String sql, Object... args);
	public ResultSet executeAsResultSet(String sql, Object... args);
}
