package conceptOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.softwaretestinghelp.com/");
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
		
		driver.manage().window().maximize();
		
		List<WebElement> elm=driver.findElements(By.tagName("iFrame"));
		System.out.println(elm.size());
		
		/*driver.switchTo().frame(driver.findElement(By.xpath("//frame[@cd_frame_id_='4d9ab15fc6da990f9bca2502c54f109a']")));
		System.out.println("Amit");*/
		
		driver.switchTo().frame(1);
		System.out.println("Amit");
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		System.out.println("Singh");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		System.out.println("SIK");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println("I AM ");
		
		
		
		
}

}
