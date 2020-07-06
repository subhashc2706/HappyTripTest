package com.sa.happytrip.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;




public class depCalClick {
	
	 private static Logger Log = LogManager.getLogger(depCalClick.class.getName());
	excel ex=new excel();
	
	public void depatureCalendarClick_() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Clicking on Departure Calendar");
		WebElement calendar = ex.driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[6]/img"));
		calendar.click();
		
		Log.info("Testing the input case");
		String expected = "1";
		WebElement element= ex.driver.findElement(By.className(("ui-state-default")));
		String actual= element.getText();
		Assert.assertEquals(actual, expected);
		ex.driver.navigate().refresh();
		
		ex.driver.close();
	} 
}
