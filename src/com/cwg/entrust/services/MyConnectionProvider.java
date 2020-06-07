package com.cwg.entrust.services;

import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {

	static java.sql.Connection conn = null;
	
	public static java.sql.Connection getConn() {
		try {
            Class.forName("com.mysql.jdbc.Driver");
        	conn = DriverManager.getConnection(conn_url, username, password);

            System.out.println("Opened database successfully");
         
        
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
		return conn;
	}
	

}
