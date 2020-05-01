package calendarHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.goair.in/bookflights");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='StartDate'])[9]")).click();
		Thread.sleep(3000);
		selectMonth();
		Thread.sleep(3000);
		selectYear();
		Thread.sleep(3000);
		selectDay();
		
		
		
		
		
		
	}
	public static void selectMonth()
	{
		String month="September";
		WebElement mon=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
		while(true) {
		if(mon.getText().equals(month)) {
			driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
			break;
			
		}else {
			driver.findElement(By.xpath("//a[@title='Next']/span")).click();
		}
		
	
		
	}
}
	
	public static void selectYear()
	{
		String year="2020";
		WebElement mon=driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]"));
		while(true) {
		if(mon.getText().equals(year)) {
			driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]"));
			break;
			
		}else {
			driver.findElement(By.xpath("//a[@title='Next']/span")).click();
		}
		
	
		
	}
}
	
	public static void selectDay()
	{
		String day="30";
		//(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr[3]/td[5]
		String beforeXpath="(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr[";
		String afterXpath="]/td[";
		
		final int weekDay=7;
		
		for(int rowNum=1;rowNum<=7;rowNum++) {
			for(int colNum=1; colNum<=weekDay;colNum++) {
				WebElement dayValue=driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]"));
				if(dayValue.equals(day)) {
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					break;
					
				}
			}
		}
		
}
}
