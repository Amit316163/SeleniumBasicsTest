package basicsOfSelenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCSS {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/register");
		driver.manage().window().maximize();
		
	/*	id-->#id
		className-->.className
		attribute-->tagName[attribute='value']
	    multiple attribute-->tagName[attribute1='value1'][attribute2='value2']	
		contains=*symbol
		start-with=^ symbol
		start-end=$ symbol*/
		
		driver.findElement(By.cssSelector("#userpassword")).sendKeys("123456");
		
		String s=driver.findElement(By.cssSelector(".orsignup")).getText();
		System.out.println(s);
		
		driver.findElement(By.cssSelector("input[placeHolder='Full Name*']")).sendKeys("Amit");
		
		driver.findElement(By.cssSelector("input[class='form-control '][placeholder='Email*']")).sendKeys("Ammi@123");
		
		//contains --> * symbol
		//input[placeholde*='Company']
		driver.findElement(By.cssSelector("input[name*='organization']")).sendKeys("SIK");
		
	}

}
