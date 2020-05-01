package JavaScriptClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://testautomationpractice.blogspot.com/");	
		d.manage().window().maximize();	
		
		//scrollTillEnd(d);
		//scrollDownThePageByPixel(d);
		
		WebElement elm=d.findElement(By.xpath("//a[@class='home-link']"));
		scrollIntoView(d,elm);
		System.out.println(elm.getText());
		
	}
	
	//This will scroll the web page till end.
	public static void scrollTillEnd(WebDriver driver) {		
		JavascriptExecutor js=  ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	 // This  will scroll down the page by  1000 pixel vertical
		public static void scrollDownThePageByPixel(WebDriver driver) {		
			JavascriptExecutor js=  ((JavascriptExecutor)driver);
			js.executeScript("window.scrollBy(0,1000)");
		}
		
		//This will scroll the page till the element is found
				public static void scrollIntoView(WebDriver driver,WebElement elm) {		
					JavascriptExecutor js=  (JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView();", elm);
				}

}
