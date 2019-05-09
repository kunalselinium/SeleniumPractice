package selPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 {

	ChromeDriver cdriver4;

	@BeforeMethod
	public void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		cdriver4 = new ChromeDriver(options);
		cdriver4.get("https://www.youtube.com/");
		cdriver4.manage().window().maximize();
	}

	@Test
	public void SignInVideoSubscribe() throws InterruptedException {
		Thread.sleep(8000);
		WebElement signinlnk2 = cdriver4.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		signinlnk2.click();
		WebElement uname1 = cdriver4.findElement(By.xpath("//input[@aria-label='Email or phone']"));
		uname1.sendKeys("kunalselinium");
		WebElement next21 = cdriver4.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next21.click();
		Thread.sleep(3000);
		WebElement pass1 = cdriver4.findElement(By.xpath("//input[@type='password']"));
		pass1.sendKeys("Kunal98765");
		WebElement next22 = cdriver4.findElement(By.xpath("//span[text()='Next']"));
		next22.click();
		Thread.sleep(10000);
		/*
		 * WebElement videoplay=cdriver4.findElement(By.
		 * xpath("//a[@id='video-title' and contains(@title,'Luka Chuppi')]"));
		 */
		WebElement videoplay = cdriver4.findElement(By.xpath("//a[@id='video-title']"));
		videoplay.click();
		Thread.sleep(50000);

		/*
		 * WebElement subscribe=cdriver4.findElement(By.xpath(
		 * "//yt-formatted-string[contains(text(),'Subsc')]")); subscribe.click();
		 */

		
		  WebElement subscribeButton = cdriver4.findElement(By.xpath(
		  "//div[@id=\"subscribe-button\"]/ytd-subscribe-button-renderer/paper-button/yt-formatted-string"
		  )); subscribeButton.click();
		 

		// WebElement
		// subscribe=cdriver4.findElement(By.xpath("//*[contains(text(),'Subscribe')]"));
		// WebElement
		// subscribe=cdriver4.findElement(By.xpath("(//div[@id='subscribe-button'])[7]"));

		/*
		 * List<WebElement>
		 * //subscribe1=cdriver4.findElements(By.xpath("//div[@id='subscribe-button']"))
		 * ; subscribe1=cdriver4.findElements(By.tagName("yt-formatted-string"));
		 * System.out.println(subscribe1.size()); //subscribe1.get(6).click();
		 * 
		 * 
		 * for (WebElement e:subscribe1) { if(e.getText().equals("Subscribe ") ) {
		 * e.click(); break; }
		 * 
		 * }
		 */
	}

	
	  @AfterMethod public void CloseMethod() throws InterruptedException {
	  Thread.sleep(10000); 
	  cdriver4.close();
	  }
	 

}
