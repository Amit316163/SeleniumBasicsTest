package JavaScriptClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarHori {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.guru99.com/test/guru99home/");	
		d.manage().window().maximize();	
		
		
		//This will scroll the page Horizontally till the element is found
		WebElement elm=d.findElement(By.linkText("VBScript"));
		JavascriptExecutor js=   (JavascriptExecutor) d;
		
		js.executeScript("arguments[0].scrollIntoView();", elm);
		
		
		
	}

}
