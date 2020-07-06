package com.sa.happytrip.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class arrCalClick {
	
	 private static Logger Log = LogManager.getLogger(arrCalClick.class.getName());

	excel ex=new excel();
	@Test
	public void arrivalCalendarClick_() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Checking for clicking on arrival calendar");
		WebElement calendar = ex.driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[8]/img"));
		calendar.click();
		
		String expected = "1";
		WebElement element= ex.driver.findElement(By.className(("ui-state-default")));
		String actual= element.getText();
		Assert.assertEquals(actual, expected);
		ex.driver.navigate().refresh();
		
		ex.driver.close();
}
}