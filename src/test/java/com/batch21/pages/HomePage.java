package com.batch21.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.batch21.BaseTest;
import com.batch21.util.Log;

public class HomePage extends BaseTest{

	
	
	public HomePage(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	@FindBy(xpath = "//*[text()='Sign in']")
	WebElement signInFromHomePage;
	
	@FindBy(xpath = "//*[@id=\"listaccountNav-signIn\"]/a/span")
	WebElement signInFromNavigation;
	
	@FindBy(xpath = "//*[text()='Create Account']")
	WebElement createAccFromHomePage;
	
	
	public CreateAccountPage goToCreateAccPage() {
		signInFromHomePage.click();
		createAccFromHomePage.click();
		Log.info("go to create acc page");
		return new CreateAccountPage(driver);
	}
	
	
	public LoginPage signin() {
		signInFromHomePage.click();
		signInFromNavigation.click();
		Log.info("signing in");
		return new LoginPage(driver);
		
		
	}
	
	
}
