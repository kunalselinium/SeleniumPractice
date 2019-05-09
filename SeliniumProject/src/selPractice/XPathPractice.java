package selPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class XPathPractice {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://accounts.google.com/signup");
		cdriver.manage().window().maximize();
		
		/*
		 * WebElement fname=cdriver.findElement(By.xpath("//[@type='text']"));
		 * fname.sendKeys("Kunal");
		 */
		/*
		 * List<WebElement>
		 * fsname=cdriver.findElements(By.xpath("//input[@class='whsOnd zHQkBf']")); for
		 * (WebElement e:fsname) { e.sendKeys("Kunal"); }
		 */
	}

}
