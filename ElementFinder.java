package com.vaccine.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementFinder {
	
	WebDriver driver;
	
	public void AppointmentScheduler(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath= "//button[text()='Schedule First Dose']") WebElement fDose;
	@FindBy(xpath= "//label[@for='checkbox-10'") WebElement teachersAndEducation;
	@FindBy(xpath= "//span[text()='Yes']") WebElement nyRes;
	@FindBy(xpath= "//button[@id='skipToNext-0']") WebElement next;
	@FindBy(xpath= "//span[text()='No']") WebElement no;
	@FindBy(xpath= "//input[@type='text']") WebElement fullName;
	
	public void FirstDose(String fullname)
	{

		WebDriverWait wait = new WebDriverWait(driver, 20);
		fDose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Schedule First Dose']")));
		fDose.click();
		
		teachersAndEducation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='checkbox-10']")));
		teachersAndEducation.click();
		
		nyRes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		nyRes.click();
		
		next.click();

		no = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='No']")));
		no.click();
		
		
		fullName.sendKeys(fullname);
		
		
	}
}
