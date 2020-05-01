package conceptOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_OffSet {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		Actions act = new Actions(d);
		
	
		
//act.moveToElement(d.findElement(By.xpath("//img[@alt='jQuery UI Themes by Adam Boduch']")), 0, 100).click().perform();

WebElement elm=d.findElement(By.xpath("//img[@alt='jQuery UI Themes by Adam Boduch']"));
act.moveToElement(elm, 0, 80);
elm.click();
		


		
        
		
	}

}
