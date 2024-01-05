package seleliumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/affan/Desktop/chromedriver" );
		
	        ChromeDriver browserObject = new ChromeDriver();
	        browserObject.get("http://demo.itlearn360.com/");
	        browserObject.findElement(By.id("loginlabel")).click();
	        browserObject.findElement(By.name("log")).sendKeys("Demo12");
	        browserObject.findElement(By.name("pwd")).sendKeys("Test123456$");
	        browserObject.findElement(By.id("wp-submit")).click();
	        //browserObject.findElement(By.name("search_course")).click();
	        browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).click();
	        browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a")).click();
	        browserObject.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button")).click();
	        browserObject.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li/label")).click();
	        browserObject.findElement(By.xpath("//*[@id=\"learn-press-checkout-place-order\"]")).click();
	        
	       WebElement cn= browserObject.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe"));
	       browserObject.switchTo().frame(cn);
	        browserObject.findElement(By.name("cardNumber")).sendKeys("1234 1234 1234 1234");
	        browserObject.findElement(By.name("exp-date")).sendKeys("1227");
	        browserObject.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[2]")).sendKeys("123");
	        browserObject.findElement(By.id("payment-button")).click();



	}
}
