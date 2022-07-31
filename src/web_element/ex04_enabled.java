package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex04_enabled {
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		
		boolean result = driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
		
		System.out.println(result);
		
		if(result==true) 
		{
			System.out.println("Element is enabled");
		}
		else 
		{
			System.out.println("Element is disabled");
		}
	}


}
