package calendarHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
public static void main(String[] args) throws InterruptedException {
	
	//this is only going to work if it has attribute value as 
		//20/04/2000 or 20-05-1399
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		String dateValue="2020-06-11";
		WebElement elm=driver.findElement(By.xpath("(//time[@class='dealform-button__label'])[1]"));
		selectDateByJS(driver, elm, dateValue);

}

public static void selectDateByJS(WebDriver driver,WebElement elm ,String value) {
	
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('type','"+value+"')", elm);
	
}
}