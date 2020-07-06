package com.sa.happytrip.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ArrCalSelect {
	 private static Logger Log = LogManager.getLogger(ArrCalSelect.class.getName());
	excel ex=new excel();

	public void ArrivalCalendarSelect_() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		WebElement calendar = ex.driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[8]/img"));
		calendar.click();
		Log.info("Checking for selecting the Arrival date");
		WebElement date=ex.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a"));
		date.click();
		
		boolean test=ex.driver.findElement(By.id("arrivalDate")).isDisplayed();
		System.out.println("Arrival date is selected: "+ test);
		ex.driver.close();
}
}