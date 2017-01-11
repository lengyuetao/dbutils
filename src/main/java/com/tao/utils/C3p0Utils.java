package com.tao.utils;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {
	
	private static ComboPooledDataSource dataSource=new ComboPooledDataSource();
	
	/**
	 * 使用连接池返回一个链接对象
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection(){
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 返回连接池对象
	 * @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
}
