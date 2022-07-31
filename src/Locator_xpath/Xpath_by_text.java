package Locator_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on forgotten password link
				driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

}
