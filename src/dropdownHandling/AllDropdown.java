package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDropdown {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");	
		d.manage().window().maximize();
		
		WebElement month_Dropdown=d.findElement(By.id("month"));
		
		Select sel=new Select(month_Dropdown);
		List<WebElement> allDropdown=sel.getOptions();
		System.out.println(allDropdown.size());
		
		for(int i=0;i<allDropdown.size();i++) {
			System.out.println(allDropdown.get(i).getText());
			
			//allDropdown.get(3).click();  select by index if you know
			if(allDropdown.get(i).getText().contains("May")) {
				allDropdown.get(i).click();
				break;
				
			}
			
		}
		
		
		
	}

}
