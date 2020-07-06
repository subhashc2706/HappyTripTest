package com.sa.happytrip.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sa.happytrip.pages.excel;

public class choose_flight {
	
	 private static Logger Log = LogManager.getLogger(choose_flight.class.getName());
	excel ex=new excel();

	public void scheduleFlight() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Choosing the flight");
		WebElement chooseflight = ex.driver.findElement(By.xpath("//*[@id=\"flight\"]"));
		chooseflight.click();
		Select flight = new Select(ex.driver.findElement(By.xpath("//*[@id=\"flight\"]")));
		Log.info("Selecting by index of flight");
		flight.selectByIndex(2);
		
		ex.driver.navigate().refresh();
		
		ex.driver.close();
	} 
}
