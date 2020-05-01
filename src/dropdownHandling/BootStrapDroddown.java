package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BootStrapDroddown {
	public static void main(String[] args) {		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");	
	d.manage().window().maximize();
	
	d.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
	
	List<WebElement>allDropdown=d.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a"));
	/*//select the Angular checkbox
	for(int i=0;i<allDropdown.size();i++) {
		System.out.println(allDropdown.get(i).getText());
		if(allDropdown.get(i).getText().contains("Angular")) {
			allDropdown.get(i).click();
		}
	}*/
	
	//select all checkboxs
		for(int i=0;i<allDropdown.size();i++) {
			System.out.println(allDropdown.get(i).getText());
			allDropdown.get(i).click();
		}


}
}