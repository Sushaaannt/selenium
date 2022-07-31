package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enabled {
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		
		x1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		 boolean button =x1.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
		 System.out.println(button);
		 
		 if(button==true) {
			 System.out.println("Button is enabled");
		 }
		 else {
			 System.out.println("button is disabled");
		 }
		
	}

}
