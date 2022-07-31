package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample01 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		
		x1.get("https://www.facebook.com/");
		
		//x1.findElement(By.xpath(xpathExpression))
		
		//enter username
		x1.findElement(By.xpath("//input[@name='email']")).sendKeys("Sushaaannt");
		
		//enter pass
		x1.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hey babe");
		
		//click on login button
		x1.findElement(By.xpath("//button[@name='login']")).click();
	}

}
