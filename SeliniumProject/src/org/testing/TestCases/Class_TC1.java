package org.testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_TC1 {
	
	ChromeDriver cdriver1;
	
	@BeforeMethod
	public void BrowserLaunch() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	cdriver1=new ChromeDriver(options);
	cdriver1.get("https://www.youtube.com/");
	cdriver1.manage().window().maximize();
	}
	
@Test	
 public
 void SignInTrending() throws InterruptedException {
	WebElement signinlnk1=cdriver1.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
	signinlnk1.click();
	WebElement uname1=cdriver1.findElement(By.xpath("//input[@aria-label='Email or phone']"));
	uname1.sendKeys("kunalselinium");
	WebElement next1=cdriver1.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	next1.click();
	Thread.sleep(3000);
	WebElement pass1=cdriver1.findElement(By.xpath("//input[@type='password']"));
	pass1.sendKeys("Kunal98765");
	WebElement next2=cdriver1.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	next2.click();
	Thread.sleep(5000);
	WebElement menu1=cdriver1.findElement(By.xpath("//yt-icon-button[@id='guide-button']"));
	menu1.click();
	Thread.sleep(8000);
	WebElement trending=cdriver1.findElement(By.xpath("//span[text()='Trending']"));
	trending.click();
 }
	@AfterMethod 
	public void CloseMethod() throws InterruptedException {
	  Thread.sleep(10000); 
	  cdriver1.close(); }
	 
}
