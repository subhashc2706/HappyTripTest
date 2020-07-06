package com.sa.happytrip.extentreport;



import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.mail.EmailException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sa.happytrip.email.Email;
import com.sa.happytrip.pages.AddFlight;
import com.sa.happytrip.pages.ArrCalSelect;
import com.sa.happytrip.pages.ArrivalTimeClick;
import com.sa.happytrip.pages.CostOfClassEconomy;
import com.sa.happytrip.pages.DepartureTimeClick;
import com.sa.happytrip.pages.arrCalClick;
import com.sa.happytrip.pages.depCalSelect;
import com.sa.happytrip.pages.depCalClick;
import com.sa.happytrip.pages.route;
import com.sa.happytrip.pages.choose_flight;

 
public class BasicExtentReport {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	static ExtentTest test;
	
	@BeforeSuite
	public void setUp() {
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	} 
	
	@Test
	public void test1() throws IOException {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("RouteTest", "Sample description");
        
        route rt=new route();
        
        rt.route_();
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test2() throws IOException {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("ScheduleFlight", "Sample description");
        
        choose_flight sc=new choose_flight();
        
        sc.scheduleFlight();
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test3() throws IOException {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Clicking of departure calendar", "Sample description");
        
        depCalClick dc= new depCalClick();
     
        dc.depatureCalendarClick_();
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test4() throws IOException {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Departure time", "Sample description");
        
        DepartureTimeClick dt=new DepartureTimeClick();
        
        dt.DepartureTimeClick_();
       
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test5() throws IOException {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("departureCalendardateSelect", "Sample description");
        
        depCalSelect dp=new depCalSelect();
        dp.depatureCalendarClick_();
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test6() throws Exception {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Arrival time Click", "Sample description");
        
       ArrivalTimeClick at= new ArrivalTimeClick();
        
       at.ArrivalTimeClick_();
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test7() throws IOException {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Arrival calendar date select", "Sample description");
        
        ArrCalSelect ar=new ArrCalSelect();
        
        ar.ArrivalCalendarSelect_();
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test8() throws IOException {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Arrival calendar click", "Sample description");
        
       arrCalClick ar=new arrCalClick();
       
       ar.arrivalCalendarClick_();
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test9() throws Exception {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("check for block of cost of class", "Sample description");
        
        CostOfClassEconomy co=new CostOfClassEconomy();
        
        co.scheduleFlight();
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test10() throws Exception {
	     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Adding the complete flight details", "Sample description");
        
        AddFlight ad=new AddFlight();

        ad.scheduleFlight();
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterSuite
	public void tearDown() throws MalformedURLException, EmailException {
		extent.flush();
		Email.sendEmail();
	}
	
	

}