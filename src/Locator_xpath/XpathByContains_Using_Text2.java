package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains_Using_Text2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				
				//click on Create new Acc links		
				driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();
	}

}
