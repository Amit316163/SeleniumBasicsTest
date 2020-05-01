package javaFeaturesUseInSelenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HashMapWithTestNG {
	static WebDriver d;
	
	public static Map<String,String> roleBasedLogin() {
		Map<String,String> hm=new HashMap<String,String>();
		
		hm.put("Customer", "amit3161:singh123");
		hm.put("Admin", "Deepak:indore0333");
		hm.put("Seller", "Ambuj:agra222");
		hm.put("Delivery", "Rohit:sanam0777");
		hm.put("Manager", "Shirish:pune0111");
		return hm;
		
	}

	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://www.facebook.com/");	
		d.manage().window().maximize();	
	}
	
	@Test
	public void loginWithCustomer() {
		
		String creditsl_login=roleBasedLogin().get("Customer");
		
		d.findElement(By.name("email")).sendKeys(creditsl_login.split(":")[0]);
		d.findElement(By.name("pass")).sendKeys(creditsl_login.split(":")[1]);
	}
	
	@Test
	public void loginWithAdmin() {
		
		String creditsl_login=roleBasedLogin().get("Admin");
		
		d.findElement(By.name("email")).sendKeys(creditsl_login.split(":")[0]);
		d.findElement(By.name("pass")).sendKeys(creditsl_login.split(":")[1]);
	}
	@Test
	public void loginWithManager() {
	
	String creditsl_login=roleBasedLogin().get("Manager");
	
	d.findElement(By.name("email")).sendKeys(creditsl_login.split(":")[0]);
	d.findElement(By.name("pass")).sendKeys(creditsl_login.split(":")[1]);
}

}
