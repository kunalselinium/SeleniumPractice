package selPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookSignupMethod {
	
	static ChromeDriver cdriver;
	
	public void Browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		cdriver=new ChromeDriver();
		cdriver.get("https://www.facebook.com");
		cdriver.manage().window().maximize();
	}
	
	public void Textfields() {
		WebElement firstname=cdriver.findElement(By.id("u_0_j"));
	    firstname.sendKeys("Kunal");
		WebElement surname=cdriver.findElement(By.cssSelector("input[name=lastname]"));
		surname.sendKeys("Sharma");
		WebElement mobile=cdriver.findElement(By.cssSelector("input#u_0_o"));
		mobile.sendKeys("9999999999");
		WebElement npassword=cdriver.findElement(By.cssSelector("input[name=reg_passwd__"));
		npassword.sendKeys("abc@12345");
	}
	
	public void DropdownSelect(WebElement element,int indexno)
	{
		Select s=new Select(element);
		s.selectByIndex(indexno);
	}
	
	public void Buttons()
	{
		WebElement gender=cdriver.findElement(By.cssSelector("input#u_0_a"));
		gender.click();
		WebElement button=cdriver.findElement(By.name("websubmit"));
		button.click();
	}
	
	public static void main(String[] args) {
		FacebookSignupMethod fsm=new FacebookSignupMethod();
		fsm.Browser();
		fsm.Textfields();
		WebElement drop1=cdriver.findElement(By.cssSelector("select[title='Day']"));
		fsm.DropdownSelect(drop1, 10);
		WebElement drop2=cdriver.findElement(By.cssSelector("select[title='Month']"));
		fsm.DropdownSelect(drop2, 3);
		WebElement drop3=cdriver.findElement(By.cssSelector("select[title='Year']"));
		fsm.DropdownSelect(drop3, 2);
		fsm.Buttons();
	}

}















