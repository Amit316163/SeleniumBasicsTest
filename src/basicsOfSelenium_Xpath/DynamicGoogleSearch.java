package basicsOfSelenium_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
		d.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(2000);
		
		List<WebElement> elm=d.findElements(By.xpath("//ul[@class='erkvQe']/li/descendant::div[@class='sbl1']"));
		
		for(int i=0;i<elm.size();i++) {
			System.out.println(elm.get(i).getText());
			
			if(elm.get(i).getText().equalsIgnoreCase("testing in India")) {
			elm.get(i).click();
			break;
			
		}
			
	}}

}
