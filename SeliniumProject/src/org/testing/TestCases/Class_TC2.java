package org.testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_TC2 {
	
	ChromeDriver cdriver2;
	
	@BeforeMethod
	public void BrowserLaunch() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	cdriver2=new ChromeDriver(options);
	cdriver2.get("https://www.youtube.com/");
	cdriver2.manage().window().maximize();
	}
@Test	
 public void SignInSubscription() throws InterruptedException {
		Thread.sleep(8000);
	WebElement signinlnk2=cdriver2.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
	signinlnk2.click();
	WebElement uname1=cdriver2.findElement(By.xpath("//input[@aria-label='Email or phone']"));
	uname1.sendKeys("kunalselinium");
	WebElement next21=cdriver2.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	next21.click();
	Thread.sleep(3000);
	WebElement pass1=cdriver2.findElement(By.xpath("//input[@type='password']"));
	pass1.sendKeys("Kunal98765");
	WebElement next22=cdriver2.findElement(By.xpath("//span[text()='Next']"));
	next22.click();
	Thread.sleep(5000);
	WebElement menu2=cdriver2.findElement(By.xpath("//yt-icon-button[@toggleable='true']"));
	menu2.click();
	Thread.sleep(8000);
	WebElement subscription=cdriver2.findElement(By.xpath("//span[text()='Subscriptions']"));
	subscription.click();
 }

@AfterMethod
public void CloseMethod() throws InterruptedException {
	Thread.sleep(10000); 
	cdriver2.close();
}

}
