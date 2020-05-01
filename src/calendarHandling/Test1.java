package calendarHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='icon-ic dealform-button__icon']")).click();
		
		String month="September 2020";
		
		
		WebElement mon=driver.findElement(By.xpath("//th[@class='cal-heading-month']/span"));
		
		while(true) {		
		if(mon.getText().equals(month)) {
			driver.findElement(By.xpath("//th[@class='cal-heading-month']/span"));
			break;
			
		} else {
			driver.findElement(By.xpath("//span[@class='icon-ic cal-btn-ic icon-rtl']")).click();
			Thread.sleep(3000);
			
		}
		}
		Thread.sleep(3000);
		selectDay();
	}
		
		public static void selectDay() {
			String day="30";
			//table[@class='cal-month']/tbody/tr[5]/td[6]
			String beforeXpath="//table[@class='cal-month']/tbody/tr[";
			String afterXpath="]/td[";
			
			final int weekDay=7;
			boolean flag=false;
			for(int rowNum=1;rowNum<=5;rowNum++) {
				for(int colNum=1;colNum<=weekDay;colNum++) {
					
					WebElement days=driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]"));
					if(days.getText().equals(day)) {
						driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
						flag=true;
						break;

						
					}
				}
				if(flag) {
					break;
				}
				
		
			
		}
		
		
	
		
		
	}
	
}
