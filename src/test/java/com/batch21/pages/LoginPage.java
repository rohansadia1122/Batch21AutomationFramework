package com.batch21.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.batch21.BaseTest;
import com.batch21.util.Log;

public class LoginPage extends BaseTest {

	public LoginPage(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="email")
	WebElement emailfb;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="pass")
	WebElement passfb;
	
	@FindBy(id="login")
	WebElement login;
	
	
	
	public UserPage doLogin(String uname, String pass) throws InterruptedException {
		username.sendKeys(uname);
		password.sendKeys(pass);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//login.click();
		Log.info("do login");
		return new UserPage(driver);
	}
	
	public UserPage doLoginToFb(String uname, String pass) throws InterruptedException {
		emailfb.sendKeys(uname);
		passfb.sendKeys(pass);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//login.click();
		Log.info("do login to FB");
		return new UserPage(driver);
	}
	
}
