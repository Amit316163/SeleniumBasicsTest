package conceptOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.vistra.com/");
		d.manage().window().maximize();
	
	   Actions act=new Actions(d);
	   Thread.sleep(3000);
        //to perform mouse hover 
	  
//         act.moveToElement(d.findElement(By.xpath("(//span[@class='has-menu'])[1]"))).
//	     moveToElement(d.findElement(By.xpath("//a[text()='Establishment']"))).build().perform();
	   
	   //two way to perform click operation in Actions class 
	
//	   	act.moveToElement(d.findElement(By.xpath("//a[text()='Client portal']"))).click().build().perform();
//	     act.click(d.findElement(By.xpath("//a[text()='Client portal']"))).build().perform();
	   	
	   // two way to perform right click to the element
//	   	act.moveToElement(d.findElement(By.xpath("//a[text()='Client portal']"))).contextClick().build().perform();
//	   	act.contextClick(d.findElement(By.xpath("//a[text()='Client portal']"))).build().perform();
	   
	   //Two way perform double click operations
	   	act.moveToElement(d.findElement(By.xpath("//img[@alt='Vistra']"))).doubleClick().build().perform();
	   	act.doubleClick(d.findElement(By.xpath("//img[@alt='Vistra']"))).build().perform();
	   
	    
	   
	}

}
