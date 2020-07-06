package com.sa.happytrip.pages;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.sa.happytrip.data.ExcelData;

public class scheduleflight extends ExcelData {
	WebDriver driver;
	String baseUrl="http://43.254.161.195:8085/happytripcrclean1";
	Map<String, Object[]> testresultdata;
	
	 private static Logger Log = LogManager.getLogger(ExcelData.class.getName());
	@Test(dataProvider="TestData")
	public void signin(String Username,String Password)
	{
		Log.debug("Execution Started");
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		
		Log.info("Maximizing the window");
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"global\"]/li[2]/a")).click();

		Log.info("adding the credentials");
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		
		driver.findElement(By.id("signInButton")).click();
		
		Log.info("Clicking on schedule flight");
		driver.findElement(By.partialLinkText("Schedule Flight")).click();
		
	}
	
	

}
