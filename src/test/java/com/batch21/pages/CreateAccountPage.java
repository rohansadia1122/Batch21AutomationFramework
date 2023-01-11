package com.batch21.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.batch21.BaseTest;

public class CreateAccountPage extends BaseTest {

	public CreateAccountPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(id = "username")
	WebElement useremail;

	@FindBy(id = "firstname")
	WebElement userFirstName;

	@FindBy(id = "lastname")
	WebElement lastName;

	@FindBy(id = "phone")
	WebElement phoneNo;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "createAccount")
	WebElement createAccount;

	public LoginPage createAccnt(String email, String fname, String lname, String pass) {
		useremail.sendKeys(email);
		userFirstName.sendKeys(fname);
		lastName.sendKeys(lname);
		password.sendKeys(pass);
		//createAccount.click();
		return new LoginPage(driver);
	}

	// Loggers
	
	
	//Appenders or Handlers
	
	
	//Layout or formatters
	
	// fatal, error, warn, info, debug
	
	
	
	
	
	
	
	
}
