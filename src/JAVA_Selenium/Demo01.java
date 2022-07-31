package JAVA_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//import org.openqa.selenium.chrome.ChromeDriver;

public class Demo01 {
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver();
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://google.com");
				
				driver.getPageSource();
				
				driver.close();
		
	}

}