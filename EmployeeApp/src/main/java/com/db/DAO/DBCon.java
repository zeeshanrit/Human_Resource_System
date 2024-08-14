package com.db.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {

	private static Connection conn;

	public static Connection getConnection() {
		try {

			if (conn==null) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
