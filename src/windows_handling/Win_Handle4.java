package windows_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Win_Handle4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		String homePage = d.getWindowHandle();
		
		d.findElement(By.xpath("//em[@class='icon fb']")).click();
		
		switchWindow(d,homePage,homePage);
		
		d.findElement(By.id("email")).sendKeys("ajdg");
		d.findElement(By.xpath("//a[@role='button']")).click();
		
		String facePage=d.getWindowHandle();
		switchWindow(d,homePage,facePage);
		
		System.out.println("Last Page"+d.getTitle());
		
	}
	
	public static void switchWindow(WebDriver driver, String firstWindow, String secondWindow)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windows : windowHandles)
		{
			if(!windows.equals(firstWindow) && !windows.equals(secondWindow))
			{
				driver.switchTo().window(windows);
			}
		}
	}

}
