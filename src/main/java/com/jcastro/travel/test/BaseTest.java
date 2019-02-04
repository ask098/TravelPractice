package com.jcastro.travel.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.jcastro.travel.myDriver;
import com.jcastro.travel.pages.HomePage;

public class BaseTest {

	myDriver myDriver;
	
	public HomePage home;
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser","url"})
	public void beforeSuite(String driver, String url) {
		myDriver = new myDriver(driver);
		home = new HomePage(myDriver.getDriver(), url);
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		home.dispose();
	}
	
	public HomePage getHomePage() {
		return home;
	}

}