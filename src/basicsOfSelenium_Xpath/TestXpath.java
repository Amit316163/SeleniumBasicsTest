package basicsOfSelenium_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/register");
		driver.manage().window().maximize();
		
		/*Types of X-path
		Absolute XPath //*[@id="app"]/div/div/div[2]/div/form/div[2]/input
		Relative XPath //input[@name='name']
		Basic XPath  //input[@type='email']
		Contains()    //button[contains(text(),'Free Sign Up')]
		
		Using OR   //input[@type='password' or @placeHolder='Desired Password*'] 
		& AND     //input[@class='form-control ' and @type='password']
		--Starts-with function--
		Id=" message12" ,Id=" message345",Id=" message8769"
		Xpath=//label[starts-with(@id,'message')]
		
		Text()  //button[text()='Free Sign Up']  text is btr then contains also if you find 2 match using contains then u can text may be u will get 1 match
		
		XPath axes methods
		Following  //*[contains(text(),'Your age')]//following::input
		Ancestor   //*[text()='Marry']//ancestor::empinfo  this GP or u can select P also
		Child
		Preceding   //label[contains(text(),' Remember Me')]//preceding::input[@id='rememberme']
		preceding-sibling  //input[@type='password']/ancestor::p/preceding-sibling::p/label/input[@name='log']
		Following-sibling   //input[@type='password']/ancestor::p/following-sibling::p/label/input
		Parent
		Self
		Descendant*/
		
		
		// part-1
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Amit");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Amit3161@hf.com");
		
		driver.findElement(By.xpath("//button[contains(text(),'Free Sign Up')]")).click();
	}

}
