package com.jcastro.travel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver, String url) {
		super(driver);
		driver.get(url);
	}
	@FindBy(id="tab-flight-tab-hp")
	private WebElement flightsButton;
	
	@FindBy(id="flight-type-roundtrip-label-hp-flight")
	private WebElement roundtripOption;
	
	@FindBy(id="flight-origin-hp-flight")
	private WebElement flightOrigin;
	
	@FindBy(id="flight-destination-hp-flight")
	private WebElement flightDestination;
	
	@FindBy(id="flight-departing-hp-flight")
	private WebElement DepartingCalendar;
	
	@FindBy(id="flight-returning-hp-flight")
	private WebElement ReturningCalendar;

	@FindBy (id="flight-adults-hp-flight")
	private WebElement AdultsField;
	
	@FindBy (id="flight-children-hp-flight")
	private WebElement ChildrenField;
	
	public void SearchFlight() {
		
		flightsButton.click();
		
		roundtripOption.click();
		
		flightOrigin.click(); flightOrigin.sendKeys("LAS");
		flightDestination.click(); flightDestination.sendKeys("LAX");
		DepartingCalendar.click(); DepartingCalendar.sendKeys("02/07/2019");
		ReturningCalendar.click(); ReturningCalendar.sendKeys("02/16/2019");
		
		Select dropDownAdults = new Select(getDriver().findElement(By.id("flight-adults-hp-flight")));
		dropDownAdults.selectByValue("4");
		
		Select dropDownChilds = new Select(getDriver().findElement(By.id("flight-children-hp-flight")));
		dropDownChilds.selectByValue("5");
		
		
	}
	
}

/*
Flying from LAS
Fliying to LAX
Departing 4 dias despues de hoy
Returning 10 día despues de hoy
Adults 4
Children 5

*/