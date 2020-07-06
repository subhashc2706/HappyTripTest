package com.sa.happytrip.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class DepartureTimeClick {
	
	 private static Logger Log = LogManager.getLogger(DepartureTimeClick.class.getName());
	excel ex=new excel();

	public void DepartureTimeClick_() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Clicking on the departure time");
		
		WebElement dptTime=ex.driver.findElement(By.id("departureTime"));
		dptTime.click();
		
		Log.info("Checking the status");
		boolean test=ex.driver.findElement(By.xpath("//*[@id=\"departureTime\"]/option[7]")).isDisplayed();
		System.out.println("depature time is selected: "+ test);
		ex.driver.close();
		
	}
}
