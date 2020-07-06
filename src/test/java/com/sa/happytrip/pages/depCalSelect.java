package com.sa.happytrip.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class depCalSelect {
	 private static Logger Log = LogManager.getLogger(depCalSelect.class.getName());
	excel ex=new excel();
	
	public void depatureCalendarClick_() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Clicking on departure calendar");
		WebElement calendar = ex.driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[6]/img"));
		calendar.click();
		WebElement date=ex.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a"));
		date.click();
		
		boolean test=ex.driver.findElement(By.id("departureDate")).isDisplayed();
		System.out.println("depature date is selected: "+ test);
		ex.driver.close();
		
	} 
}
