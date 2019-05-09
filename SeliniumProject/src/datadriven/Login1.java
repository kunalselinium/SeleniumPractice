package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login1 {
	
	ChromeOptions options;	
	ChromeDriver cdriver;
	Properties pr;
	
	@BeforeMethod
	public void BrowserLaunch() throws IOException {
		File f =new File("../SeliniumProject/or.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		cdriver=new ChromeDriver(options);
		cdriver.get("https://www.youtube.com/");
		cdriver.manage().window().maximize();
	}
	
	@Test(dataProvider="Authentication")
	public void LoggedIn(String userid,String pass) throws InterruptedException{
		WebElement signinlnk1=cdriver.findElement(By.xpath(pr.getProperty("loginbutton")));
		signinlnk1.click();
		WebElement uname1=cdriver.findElement(By.xpath(pr.getProperty("username")));
		uname1.sendKeys(userid);
		WebElement next1=cdriver.findElement(By.xpath(pr.getProperty("nextbttnuser")));
		next1.click();
		Thread.sleep(3000);
		WebElement pass1=cdriver.findElement(By.xpath(pr.getProperty("password")));
		pass1.sendKeys(pass);
		WebElement next2=cdriver.findElement(By.xpath(pr.getProperty("nextbttnpass")));
		next2.click();
		Thread.sleep(5000);
		
	}
	
	@DataProvider(name = "Authentication")
	public Object[][] credentials(){
		return new Object[][] { { "kunalselinium", "Kunal98765" }, { "testuser_1", "Test@123" }};


	}
	
	@AfterMethod 
	public void CloseMethod() throws InterruptedException {
	  //.sleep(10000); 
	  cdriver.close(); }
	 
}

