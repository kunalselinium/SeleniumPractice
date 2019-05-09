package org.testing.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_TC3 {

ChromeDriver cdriver3;
	
	@BeforeMethod
	public void BrowserLaunch() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	cdriver3=new ChromeDriver(options);
	cdriver3.get("https://www.youtube.com/");
	cdriver3.manage().window().maximize();
	}
@Test	
 public void SignInVideoLike() throws InterruptedException {
		Thread.sleep(8000);
	WebElement signinlnk2=cdriver3.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
	signinlnk2.click();
	WebElement uname1=cdriver3.findElement(By.xpath("//input[@aria-label='Email or phone']"));
	uname1.sendKeys("kunalselinium");
	WebElement next21=cdriver3.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	next21.click();
	Thread.sleep(3000);
	WebElement pass1=cdriver3.findElement(By.xpath("//input[@type='password']"));
	pass1.sendKeys("Kunal98765");
	WebElement next22=cdriver3.findElement(By.xpath("//span[text()='Next']"));
	next22.click();
	Thread.sleep(10000);
	//WebElement videoplay=cdriver3.findElement(By.xpath("//a[@id='video-title' and contains(@title,'Teri Mitti - Kesari')]"));
	WebElement videoplay=cdriver3.findElement(By.xpath("//a[@id='video-title']"));
	videoplay.click();
	Thread.sleep(10000);
	 WebElement like=cdriver3.findElement(By.xpath("//*[contains(@aria-label,'like this video')]"));
	 like.click();
 }

@AfterMethod
public void CloseMethod() throws InterruptedException {
	Thread.sleep(10000); 
	cdriver3.close();
}

}
