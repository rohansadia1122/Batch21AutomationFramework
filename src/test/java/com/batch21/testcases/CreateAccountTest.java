package com.batch21.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.batch21.BaseTest;
import com.batch21.pages.CreateAccountPage;
import com.batch21.pages.HomePage;
import com.batch21.pages.LoginPage;
import com.batch21.pages.UserPage;

public class CreateAccountTest extends BaseTest{

	
	@Test
	public void createAccountTest() {
		
		HomePage hPage= new HomePage(driver);
		CreateAccountPage cap=hPage.goToCreateAccPage();
	//	CreateAccountPage cap= new CreateAccountPage(driver);
		LoginPage up=cap.createAccnt(readConfig.getuserName(), readConfig.getFirstName(), readConfig.getLastname(), readConfig.getPassword());
		
	}
	
	
}
