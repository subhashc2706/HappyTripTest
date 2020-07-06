package com.sa.happytrip.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sa.happytrip.pages.excel;

public class route {
	
	 private static Logger Log = LogManager.getLogger(route.class.getName());
	excel ex=new excel();
	
	public void route_() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Choosing the route");
		WebElement route = ex.driver.findElement(By.xpath("//*[@id=\"route\"]"));
		route.click();
		Log.info("selecting the route");
		route.sendKeys("Surat(Gujarat) - bangaluru(Karnataka)");
		ex.driver.navigate().refresh();
		
		Log.info("closing the webpage");
		ex.driver.close();
		
}
}