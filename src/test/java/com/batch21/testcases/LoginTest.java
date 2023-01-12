package com.batch21.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.batch21.BaseTest;
import com.batch21.pages.HomePage;
import com.batch21.pages.LoginPage;
import com.batch21.pages.UserPage;
import com.batch21.util.ExcelReader;
import com.batch21.util.Log;

public class LoginTest extends BaseTest {

	
	@Test(dataProvider = "logindata")
	public void loginTest(String user, String pass) throws InterruptedException {
		
		//  HomePage hPage= new HomePage(driver); 
		  LoginPage lp=new LoginPage(driver);
		  UserPage up=lp.doLoginToFb(user, pass);
		  Log.info(user+" "+pass);
	}
	
	
	
	@DataProvider(name="logindata")
	public String[][] getData() throws Exception {
		
		/*
		 * String [][] logindata= {
		 * 
		 * {"rihad23@gmail.com", "56354ere"}, {"expertautoyahoo.com","tyutyu7u6u"},
		 * {"abcd@hotmail.com","dfgdfg65"} }; return logindata;
		 */
		
		
	String pathString="/Users/rihad/eclipse-workspace/Batch21AutomationFramework/src/test/resources/excel/loginDDT.xlsx";
	int	rownum=ExcelReader.getRowCount(pathString, "Sheet1");
	int colcount=ExcelReader.getCellCount(pathString, "Sheet1", 1);
	
	String [][] logindata= new String[rownum][colcount];
	
	for (int i = 1; i <= rownum; i++) {
		for (int j = 0; j < colcount; j++) {
			logindata [i-1][j]=ExcelReader.getCelldata(pathString, "Sheet1", i, j);
		}
	}
		
		return logindata;
		
	}
	
	
	
	
	
	
	
	
	
	// Data driven test
	
	// apache poi jars
	// test data (XLSX file)
	// ExcelReader class
	
}
