package selPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacbookSignup {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.facebook.com");
		cdriver.manage().window().maximize();
	    WebElement firstname=cdriver.findElement(By.id("u_0_j"));
	    firstname.sendKeys("Kunal");
		WebElement surname=cdriver.findElement(By.cssSelector("input[name=lastname]"));
		surname.sendKeys("Sharma");
		WebElement mobile=cdriver.findElement(By.cssSelector("input#u_0_o"));
		mobile.sendKeys("9999999999");
		WebElement npassword=cdriver.findElement(By.cssSelector("input[name=reg_passwd__"));
		npassword.sendKeys("abc@12345");
		WebElement gender=cdriver.findElement(By.cssSelector("input#u_0_a"));
		gender.click();
		WebElement button=cdriver.findElement(By.name("websubmit"));
		//button.click();
	}

}
