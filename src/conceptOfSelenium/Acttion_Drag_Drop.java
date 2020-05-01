package conceptOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acttion_Drag_Drop {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://jqueryui.com/droppable/");
	d.manage().window().maximize();
	
	d.switchTo().frame(0);
	
	Actions act=new Actions(d);
	
	//two way drag and drop operation
	
	/*act.clickAndHold(d.findElement(By.id("draggable"))).
	moveToElement(d.findElement(By.id("droppable"))).release().build().perform();*/
	
	act.dragAndDrop(d.findElement(By.id("draggable")), d.findElement(By.id("droppable"))).build().perform();
act.sendKeys("");
	

}
}