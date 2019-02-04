package com.jcastro.travel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myDriver {
	
	private WebDriver driver;
	
	public myDriver(String browser) {
		switch (browser) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}

}