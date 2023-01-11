package com.batch21.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.batch21.BaseTest;

public class UserPage extends BaseTest {

	public UserPage(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	
}
