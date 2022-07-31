package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample02 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		x1.get("https://www.facebook.com/");
		
		x1.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Sushaaannt");
		
		x1.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("Not this time");
		
		x1.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
