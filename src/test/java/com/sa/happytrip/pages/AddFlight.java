package com.sa.happytrip.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class AddFlight {
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	}
	
	 private static Logger Log = LogManager.getLogger(AddFlight.class.getName());
	excel ex=new excel();
	@Test
	public void scheduleFlight() throws Exception {
		// Admin sign in
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		// getting into schedule flight page
		Log.info("Selecting the flight from dropdown");
		WebElement chooseflight = ex.driver.findElement(By.xpath("//*[@id=\"flight\"]"));
		chooseflight.click();
		//Selecting the flight
		Select flight = new Select(ex.driver.findElement(By.xpath("//*[@id=\"flight\"]")));
		//By index
		flight.selectByIndex(2);
		//choosing the route
		Log.info("selecting the route");
		WebElement route = ex.driver.findElement(By.xpath("//*[@id=\"route\"]"));
		route.click();
		route.sendKeys("bangaluru(Karnataka) - Mysore(Karnataka)");
		
		//adding the distance
		Log.info("adding the distance ");
		ex.driver.findElement(By.id("distance")).sendKeys("245");
		
		//departure date
		Log.info("selecting the departure date");
		WebElement calendar = ex.driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[6]/img"));
		calendar.click();
		WebElement date=ex.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a"));
		date.click();
		
		//departure time
		Log.info("selecting the departure time");
		WebElement dptTime=ex.driver.findElement(By.id("departureTime"));
		dptTime.click();
		
		ex.driver.findElement(By.xpath("//*[@id=\"departureTime\"]/option[7]")).click();
		
		//Arrival date
		Log.info("selecting the arrival date");
		WebElement calendar_ = ex.driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[8]/img"));
		calendar_.click();
		
		ex.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")).click();
		
		//Arrival Time
		Log.info("selecting the arrival time");
		WebElement dptTime_=ex.driver.findElement(By.id("arrivalTime"));
		dptTime_.click();
		
		ex.driver.findElement(By.xpath("//*[@id=\"arrivalTime\"]/option[3]")).click();
		
		//Cost of economy 
		Log.info("adding the cost of economy");
		ex.driver.findElement(By.id("classEconomy")).sendKeys("8454");
		
		Log.info("finally adding the flight");
		ex.driver.findElement(By.xpath("//*[@id=\"signInButton\"]")).click();
		
//		boolean test=ex.driver.findElement(By.partialLinkText("Schedule added successfuly")).isDisplayed();
//		System.out.println("Schedule added successfuly "+test);
//		Thread.sleep(3000);
		ex.driver.close();
	}
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
}
