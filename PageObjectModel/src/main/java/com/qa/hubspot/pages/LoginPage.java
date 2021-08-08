package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubsport.base.BasePage;

public class LoginPage extends BasePage {

	private WebDriver driver;

	private By emailId = By.id("username");
	private By loginBtn = By.xpath("//p[normalize-space()='Login or Create Account']");
	private By contiuneBtn = By.xpath("//button[@class='capText font16']");
	private By passwordInput = By.xpath("//input[@id='password']");

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public String getLoginPaggeTitile() {
		
		return driver.getTitle();
	}

}
