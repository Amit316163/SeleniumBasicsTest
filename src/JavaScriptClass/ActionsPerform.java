package JavaScriptClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsPerform {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.trivago.in/");	
		d.manage().window().maximize();	
		
		WebElement elm=d.findElement(By.xpath("//span[contains(.,'Log in')]"));
		
		
		performClickWithJS(d,elm);
		refershThePage(d);
		
		
	}
	//To perform click option through JS
	public static void performClickWithJS(WebDriver d,WebElement elm) {
		JavascriptExecutor js= ((JavascriptExecutor)d);
		js.executeScript("arguments[0].click()", elm);
		
	}
	
	//To perform click option through JS
		public static void refershThePage(WebDriver d) {
			JavascriptExecutor js= ((JavascriptExecutor)d);
			js.executeScript("history.go(0)");
			
		}

}
