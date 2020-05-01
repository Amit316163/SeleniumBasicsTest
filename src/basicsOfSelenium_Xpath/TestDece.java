package basicsOfSelenium_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDece {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Testing");
	
		/*Thread.sleep(3000);
		List<WebElement> s=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		Thread.sleep(3000);
		System.out.println(s.size());
		Thread.sleep(3000);*/
		
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//ul[@class='erkvQe']/li[1]/descendant::span")).getText();
		Thread.sleep(3000);
		System.out.println(s);
		Thread.sleep(3000);
		}
}
