package basicConceptOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
				
				//we want to maximize our window
				d.manage().window().maximize();
				
				//delete all the cookies 
				d.manage().deleteAllCookies();
				
				//page load timeouts
				d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				
				//launch and navigation operations 
				d.get("https://www.google.com");
				d.navigate().to("https://www.facebook.com");
				d.navigate().back();
				d.navigate().forward();
				//refresh the page
				d.navigate().refresh();
				
		
		
		
		
		
		
		
		
		
	}

	
}
