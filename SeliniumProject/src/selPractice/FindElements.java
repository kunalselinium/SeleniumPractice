package selPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	WebDriver cdriver=new ChromeDriver();
	cdriver.get("https://www.facebook.com");
	cdriver.manage().window().maximize();
	List<WebElement> wl=cdriver.findElements(By.className("inputtext"));
	System.out.println("Total elements are "+wl.size());
	for(WebElement e:wl)
	{
	e.sendKeys("Kunal");	
	}
		
}
}
