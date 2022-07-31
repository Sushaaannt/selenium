package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains_Using_Attribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				//enter UN
				driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc");
				
				
				//enter pwd
				driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");
				
				
				//click on login btn
				driver.findElement(By.xpath("//button[contains(@class,'4jy1 selected _51sy')]")).click();
			
	}
}


