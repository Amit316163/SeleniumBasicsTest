package excelReading;

import javax.swing.plaf.synth.SynthStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	static String path="C:\\Users\\SONY\\Desktop\\ZohoCRMData.xlsx";
	
	
	public static void main(String[] args) throws Exception {
		
		//excel=new ExcelDataRead3();
		ExcelDataRead3 excel=new ExcelDataRead3(path);
		System.out.println( excel.getData(0, 3, 0));
		System.out.println(excel.getData(0, 2, 2));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		d.findElement(By.id("email")).sendKeys(excel.getData(0, 2, 1));
		d.findElement(By.id("pass")).sendKeys(excel.getData(0, 2, 2));
		
		
		
		
		
		
	}

}
