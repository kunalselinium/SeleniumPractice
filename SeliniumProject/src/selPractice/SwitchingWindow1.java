package selPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchingWindow1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cdriver1=new ChromeDriver();
		cdriver1.get("https://www.facebook.com/");
		cdriver1.manage().window().maximize();
		String cw=cdriver1.getWindowHandle();
		WebElement signin=cdriver1.findElement(By.xpath("//input[@value='Log In']"));
		Actions ac=new Actions(cdriver1);
		ac.keyDown(Keys.CONTROL).click(signin).keyUp(Keys.CONTROL).build().perform();
		System.out.println("Before switching URL is: "+cdriver1.getCurrentUrl() );
        Set<String> all=cdriver1.getWindowHandles();
        for(String e:all) {
       	cdriver1.switchTo().window(e);
       }
        System.out.println("After tab switching URL is: "+cdriver1.getCurrentUrl());
        //Thread.sleep(5000);
        cdriver1.switchTo().window(cw);
        Thread.sleep(5000);
        WebElement fpass=cdriver1.findElement(By.xpath("//a[text()='Forgotten account?']"));
        //Actions ac1=new Actions(cdriver1);
		ac.keyDown(Keys.SHIFT).click(fpass).keyUp(Keys.SHIFT).build().perform();
		Set<String> all1=cdriver1.getWindowHandles();
		for(String f:all1)
		{
			cdriver1.switchTo().window(f);
		}
	
		System.out.println("After window switching URL is: "+cdriver1.getCurrentUrl());
	}

}
