package conceptOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {
	
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_checked");
		d.manage().window().maximize(); 
		d.switchTo().frame(d.findElement(By.name("iframeResult")));
		
		boolean elm=d.findElement(By.name("vehicle3")).isSelected();
		System.out.println(elm);
	}

}
