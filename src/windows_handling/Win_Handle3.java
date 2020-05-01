package windows_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Win_Handle3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		//base window handle
				String basehandle=d.getWindowHandle();
				d.findElement(By.xpath("//em[@class='icon fb']")).click();
						
				//get all win handles
				Set<String>allWinID=d.getWindowHandles();
			
				
					
				for(String child:allWinID) {
					if (!child.equals(basehandle)) {
						d.switchTo().window(child);
						System.out.println(d.getTitle());
						d.findElement(By.name("email")).sendKeys("ajitmc@hf.com");
						d.findElement(By.xpath("//a[@role='button']")).click();
						
					
					}
				}
		//swtich tomain window again in order
			Iterator<String>it=	allWinID.iterator();
			String s=it.next();
			String s2=it.next();
			d.switchTo().window(s2);
				d.switchTo().window(basehandle);
		
		/*	d.switchTo().window(c);		
		System.out.println(d.getTitle());
		d.findElement(By.name("email")).sendKeys("ajitmc@hf.com");
		d.findElement(By.xpath("//a[@role='button']")).click();*/

		
	
		
		
		
		
	}

}
