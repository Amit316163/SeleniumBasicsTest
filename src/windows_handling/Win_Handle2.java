package windows_handling;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Win_Handle2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.naukri.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		
		Set<String> allWind=d.getWindowHandles();
		System.out.println(allWind.size());
		
		ArrayList<String> tabs=new ArrayList<>(allWind);
		
		d.switchTo().window(tabs.get(0));
		System.out.println(d.getTitle());
		
		d.switchTo().window(tabs.get(1));
		System.out.println(d.getTitle());
		
		d.switchTo().window(tabs.get(0));
		System.out.println(d.getTitle());
		
		
	
		
		
		
		
	}

}
