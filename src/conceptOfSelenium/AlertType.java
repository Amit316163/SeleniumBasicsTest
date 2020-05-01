package conceptOfSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertType {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[@id='banner']/div[2]/a")).click();
	
	
	driver.findElement(By.id("Button2")).click();
	
	//alert handle
    
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		
		
}

}
