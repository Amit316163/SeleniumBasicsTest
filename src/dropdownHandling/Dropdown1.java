package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");	
		d.manage().window().maximize();
		
		//Using select class
		
		Select sel=new Select(d.findElement(By.name("birthday_day")));
		
		//sel.selectByIndex(0);
		//sel.selectByValue("0");
		sel.selectByVisibleText("Day");
		System.out.println(sel.isMultiple());
		
		//We can create a function and call these element with value
		/*public static void selectValueFromDropDownByText(WebElement element, String value)
		{
			Select select = new Select(element);
			select.selectByVisibleText(value);
		}*/
		
	}

}
