package com.cwg.entrust.tests;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class testjdbc {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/entrustdb";
		String username = "root";
		String password = "";
		try {
			System.out.println("Connecting to database :" + url);
			java.sql.Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to the database succesfully");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
