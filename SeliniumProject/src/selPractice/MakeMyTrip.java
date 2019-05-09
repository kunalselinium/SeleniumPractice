package selPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver cdriver=new ChromeDriver(options);
	cdriver.get("https://www.makemytrip.com/");
	cdriver.manage().window().maximize();
	WebElement from=cdriver.findElement(By.xpath("//label[@for='fromCity']"));
	from.click();
	Actions ac=new Actions(cdriver);
	for(int i=0;i<=5;i++)
	{
	ac.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(3000);
	}
	ac.sendKeys(Keys.ENTER).build().perform();
	}	
}
