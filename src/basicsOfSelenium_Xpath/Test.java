package basicsOfSelenium_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/register");
		driver.manage().window().maximize();
		//name
	/*	driver.findElement(By.name("name")).sendKeys("Amit");
		
		//id
		driver.findElement(By.id("userpassword")).sendKeys("@m1236");
		
		//Xpath
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ank@123");
		
		//CSSSelector
		//if we have id then we can write like as below
		//driver.findElement(By.cssSelector("#userpassword")).sendKeys("@m1236");
		driver.findElement(By.cssSelector("input[type='text'][placeholder='Company Name']")).sendKeys("SIK");		
		
		
		//className   
		String s=driver.findElement(By.className("orsignup")).getText();
		System.out.println(s);
		
		//tagName
		List<WebElement> sa=driver.findElements(By.tagName("a"));
		System.out.println(sa.size());*/
		
		//linkText
		
		//driver.findElement(By.linkText("Sign In")).click();
		

		//partialLinkText
		
		driver.findElement(By.partialLinkText("Terms of")).click();
		
	}

}
