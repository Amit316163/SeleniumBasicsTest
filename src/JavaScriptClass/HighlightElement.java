package JavaScriptClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");	
	d.manage().window().maximize();
	
	WebElement elm=d.findElement(By.xpath("//button[@type='button']"));
	highlightBackgroundOfTheElement(d,elm);
	Thread.sleep(1000);
	highlightBorderOfTheElement(d,elm);
	Thread.sleep(1000);
	highlightBackgroundAndBorderOfTheElement(d,elm);
	Thread.sleep(2000);

}
	
	//To focus on background color for the element 
	
	public static void highlightBackgroundOfTheElement(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow;');", element);
	}
	
	//To focus on border color for the element 
	public static void highlightBorderOfTheElement(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('style', 'border: 5px solid green;');", element);
	}
	//To focus on background and border color for the element 
	public static void highlightBackgroundAndBorderOfTheElement(WebDriver driver,WebElement element) {
	
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	
	js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red;');", element);
}



}