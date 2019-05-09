package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramePrac1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.toolsqa.com/iframe-practice-page/");
		cdriver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement iframe1=cdriver.findElement(By.id("IF1"));
		cdriver.switchTo().frame(iframe1);
		System.out.println("Hello");
		/*
		 * WebElement link=cdriver.findElement(By.linkText("Partial Link Test"));
		 * link.click();
		 */
		WebElement fname=cdriver.findElement(By.name("firstname"));
		fname.sendKeys("Kunal");
		System.out.println("Hello1");
		cdriver.switchTo().parentFrame();
		//cdriver.switchTo().defaultContent();
		WebElement menu=cdriver.findElement(By.xpath("//span[text()='Tutorial']"));
		menu.click();
	}

}
