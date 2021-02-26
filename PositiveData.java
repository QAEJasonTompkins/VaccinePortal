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
		driver=Browsers.startApplication(driver, "Firefox", "https://vax4nyc.nyc.gov/patient/s/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement fDose=driver.findElement(By.xpath("//button[text()='Schedule First Dose']"));
		fDose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Schedule First Dose']")));
		fDose.click();
		
		WebElement teachersAndEducation = driver.findElement(By.xpath("//label[@for='checkbox-10']"));
		teachersAndEducation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='checkbox-10']")));
		teachersAndEducation.click();
			
		WebElement nyRes = driver.findElement(By.xpath("//span[text()='Yes']"));
		nyRes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Yes']")));
		nyRes.click();
		
		WebElement next = driver.findElement(By.xpath("//button[@id='skipToNext-0']"));
		next.click();
		
		WebElement no = driver.findElement(By.xpath("//span[text()='No']"));
		no = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='No']")));
		no.click();
		
		WebElement fullName = driver.findElement(By.xpath("//input[@type='text']"));
		fullName.sendKeys("Jason Tompkins");
		//this will fail because captchas can not not be automated
		WebElement captcha = driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
        captcha = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='recaptcha-anchor']")));
        captcha.click();
        		
	}
	

}
