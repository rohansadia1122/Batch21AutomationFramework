package com.batch21.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	FileInputStream fileInputStream;
	Properties properties= new Properties();
	
	
	public ReadConfig() {
		
		try {
			 fileInputStream= new FileInputStream(new File("/Users/rihad/eclipse-workspace/Batch21AutomationFramework/src/test/resources/properties/config.properties"));
			 try {
				properties.load(fileInputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			Log.info(e.getMessage());
		}
	}
	
	
	public String getTestSite() {
		String testSite=properties.getProperty("testSite");
		return testSite;
	}
	public String getuserName() {
		String useremail=properties.getProperty("useremail");
		return useremail;
	}
	
	public String getFirstName() {
		String firstname=properties.getProperty("firstname");
		return firstname;
	}
	
	public String getLastname() {
		String lastname=properties.getProperty("lastname");
		return lastname;
	}
	public String getPassword() {
		String password=properties.getProperty("password");
		return password;
	}
	
}
