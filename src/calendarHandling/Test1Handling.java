package calendarHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1Handling {
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
			driver.findElement(By.xpath("//th[@class='cal-heading-month']/span")).click();
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
			String day="32";
			//table[@class='cal-month']/tbody/tr[5]/td[6]
			String beforeXpath="//table[@class='cal-month']/tbody/tr[";
			String afterXpath="]/td[";
			
			final int weekDay=7;
			boolean flag=false;
			String days=null;
			for(int rowNum=1;rowNum<=5;rowNum++) {
				for(int colNum=1;colNum<=weekDay;colNum++) {
					try {
					days=driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
					}catch(NoSuchElementException e) {
						System.out.println("Enter the correct date");
					}
					if(days.equals(day)) {
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
