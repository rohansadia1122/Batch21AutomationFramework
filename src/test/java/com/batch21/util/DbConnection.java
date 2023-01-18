package com.batch21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.batch21.BaseTest;

public class DbConnection extends BaseTest{

	@Test
	public void getConnection() throws SQLException {
		Connection connection= DriverManager.getConnection(readConfig.getDbURL(),readConfig.getUserDB(),readConfig.getPasswordDb());
		Log.info("Connection Eshtablished");
		Statement statement = connection.createStatement();
		String queryString="select * from Customers";
		ResultSet rs = statement.executeQuery(queryString);
		
		while (rs.next()) {
			Log.info(rs.getString("CustomerName"));
			Log.info(rs.getString(2));
			
		}
		
		
		connection.close();
	}
	
	
	
}
