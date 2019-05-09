package selPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Y1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cdriver1=new ChromeDriver();
		cdriver1.get("https://www.youtube.com/");
		cdriver1.manage().window().maximize();
		WebElement signinlnk1=cdriver1.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		signinlnk1.click();
		
	}

}
