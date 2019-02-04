package com.jcastro.travel.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jcastro.travel.pages.HomePage;

public class TravelTest extends BaseTest{
	
	private HomePage home;

	@BeforeMethod(alwaysRun = true)
	@Parameters({"url"})
	private void loadPage(String url){
		myDriver.getDriver().get(url);
	}
	
	@Test
	public void Search() {
		this.home = getHomePage();
		home.SearchFlight();
	}
	
	

}
