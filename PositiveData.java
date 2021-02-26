package com.vaccine.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.vaccine.pages.ElementFinder;
import com.vaccine.utilities.Browsers;

public class PositiveData {
	
	WebDriver driver;
	
	@Test(priority = 1)
	public void FirstDose()
	{
		Browsers.startApplication(driver, "Firefox", "https://vax4nyc.nyc.gov/patient/s/");
		
		ElementFinder elementFinder=PageFactory.initElements(driver, ElementFinder.class);
		
		elementFinder.FirstDose("Jason Tompkins");
		
		Browsers.quitBrowser(driver);
        		
	}
	

}
