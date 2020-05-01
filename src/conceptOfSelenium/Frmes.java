package conceptOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frmes {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='iframecontainer']"));
		Thread.sleep(5000);
		
		List<WebElement> elm=driver.findElements(By.tagName("iFrame"));
		System.out.println(elm.size());
		
		driver.switchTo().frame("iframeResult");
		
	String f1=	driver.findElement(By.xpath("//h2[text()='Iframe - Target for a Link']")).getText();
	System.out.println(f1);
	
	
	driver.switchTo().frame("iframe_a");
	String f2=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
	System.out.println(f2);
	
	driver.switchTo().defaultContent();
		
		/*driver.switchTo().frame("iframe_a");
		String f2=driver.findElement(By.xpath("//a[@target='iframe_a']")).getText();
		System.out.println(f2);*/
	}
	

}
