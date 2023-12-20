package seleliumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSiteLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/affan/Desktop/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        WebElement ema = browserObject.findElement(By.name("Email"));
	        
	       ema.clear();
	        ema.sendKeys("admin@yourstore.com");
	        browserObject.findElement(By.name("Password")).clear();
	        browserObject.findElement(By.name("Password")).sendKeys("admin");
	        browserObject.findElement(By.className("button-1")).click();
	}

}
