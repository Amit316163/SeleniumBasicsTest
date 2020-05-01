package javaFeaturesUseInSelenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOFHashMap {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");	
		d.manage().window().maximize();	
		
//		d.findElement(By.name("email")).sendKeys("amitsinf@3144");
//		d.findElement(By.name("pass")).sendKeys("151848451");
		
		//System.out.println(roleBasedLogin());

		//1st approach 
		
//	String customer=	roleBasedLogin().get("Admin");
//	String [] arr=customer.split(":");
//	String user=arr[0];
//	String pass=arr[1];
//	
//		d.findElement(By.name("email")).sendKeys(user);
//		d.findElement(By.name("pass")).sendKeys(pass);
		
		
		//2nd Approach is
//		d.findElement(By.name("email")).sendKeys(roleBasedLogin().get("Admin").split(":")[0]);
//		d.findElement(By.name("pass")).sendKeys(roleBasedLogin().get("Admin").split(":")[1]);
		
		//3rd approach 
		//If we want to execute with all users then u can use @Test method
		//next class created for this
		
		
		
		
	}
	
//	CustomerLogin
//	AdminLogin
//	SellerLogin
//	DeliveryLogin
//	ManagerLogin
	
	public static Map<String,String> roleBasedLogin() {
		Map<String,String> hm=new HashMap<String,String>();
		
		hm.put("Customer", "amit3161:singh123");
		hm.put("Admin", "Deepak:indore0333");
		hm.put("Seller", "Ambuj:agra222");
		hm.put("Delivery", "Rohit:sanam0777");
		hm.put("Manager", "Shirish:pune0111");
		return hm;
		
	}

}
