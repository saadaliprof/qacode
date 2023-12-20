package seleliumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/affan/Desktop/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://google.com");
	        
	        
	}

}
