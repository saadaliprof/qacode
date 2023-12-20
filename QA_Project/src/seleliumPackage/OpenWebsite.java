package seleliumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "/Users/affan/Desktop/chromedriver" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        ChromeDriver browserObject = new ChromeDriver();
			// 3. Open the http://www.google.com/ link using get method.
		        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		        browserObject.findElement(By.name("name")).sendKeys("saad");
		        browserObject.findElement(By.id("eml")).sendKeys("Saadali@yahoo.com");
		        browserObject.findElement(By.name("website")).sendKeys("www.youtube.com");
		        browserObject.findElement(By.name("comment")).sendKeys("hello");
		       
		        
		       
		        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
		        Thread.sleep(5000);
		        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
		        browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
		        
		        browserObject.findElement(By.xpath("//input[@value='Bike']")).click();		        
		        Select a = new Select (browserObject.findElement(By.name("country")));
		        a.selectByVisibleText("Ethiopia");
		        
		        browserObject.findElement(By.name("submit")).click();
		        browserObject.close();
	}

}
