package basicsOfSelenium_Xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingDynamicWebTable {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://testautomationpractice.blogspot.com/");
	d.manage().window().maximize(); 
	
	//d.switchTo().frame(d.findElement(By.id("iframeResult")));
	//d.switchTo().defaultContent();
	Thread.sleep(5000);
	
	//1st way 
	String s=d.findElement(By.xpath("(//td[contains(text(),'Mukesh')])[1]/following::td[text()='Java']")).getText();
	System.out.println(s);	
	
	
}

}
