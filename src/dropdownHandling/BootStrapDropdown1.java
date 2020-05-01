package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BootStrapDropdown1 {
	
	public static void main(String[] args) throws InterruptedException {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");	
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement elm=d.findElement(By.xpath("//button[@id='dropdownMenuButton']"));		
		elm.click();
		
		List<WebElement> allDropdown=d.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
		
		for(int i=0;i<allDropdown.size();i++) {
			
			System.out.println(allDropdown.get(i).getText());
			if(allDropdown.get(i).getText().equals("Action")) {
				allDropdown.get(i).click();
			}
		}

	}

}
