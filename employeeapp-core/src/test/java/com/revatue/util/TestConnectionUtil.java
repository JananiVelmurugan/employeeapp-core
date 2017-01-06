package com.revatue.util;

import java.sql.SQLException;

public class TestConnectionUtil {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println(ConnectionUtil.getConnection());
	}

}
