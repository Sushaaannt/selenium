package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		
		x1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//x1.findElement(By.xpath("//input[@type='text']")).sendKeys("ABC");
		
		WebElement username=x1.findElement(By.xpath("//input[@type='text']")); 
		//we take return type of last method but "send keys"(line no17) do not have return type.so we take return type of find element
		//return type of find element is webElement so we take it as variable
		username.sendKeys("ABC");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("xyz");
		
		
	}

}
