package com.sa.happytrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class excel {
	WebDriver driver;
	String baseUrl="http://43.254.161.195:8085/happytripcrclean1";
	
	public void signin(String Username,String Password)
	{
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32 (1)//chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"global\"]/li[2]/a")).click();

		
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		
		driver.findElement(By.id("signInButton")).click();
		
		driver.findElement(By.partialLinkText("Schedule Flight")).click();
		
	}
	
	

}
