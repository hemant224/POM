package com.qa.hubsport.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * @author hemantkumar
 *
 */


public class BasePage {

	public WebDriver driver;
	public Properties prop;
	
	/**
	 * this method is used to initialize browser from given browser
	 * @param browser
	 * @return this returns webdriver driver 
	 */

	public WebDriver init_driver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("browser value is " + browser);

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();
		}

		else {

			System.out.println("Enter correct browser " + bbrowser);
		}
       
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;

	}
	
	
	/**
	 * 
	 * read properties file like url  and browser
	 * 
	 * return prop for properties file
	 */
	
	
	public Properties init_prop() {
		
		try {
			FileInputStream ip = new FileInputStream("src/main/java/com/qa/hubspot/config/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prop;
		
		
	}
	

}
