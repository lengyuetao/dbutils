package com.tao.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtils {
	
	private Connection conn;
	
	public JdbcUtils(){
		conn=C3p0Utils.getConnection();
	}
	
	public Connection getConnection(){
		return conn;
	}
	
	public void close(ResultSet set,PreparedStatement pst,
			Connection conn) {
		try {
			if (set != null) {
				set.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
