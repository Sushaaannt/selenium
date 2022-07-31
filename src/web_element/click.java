package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		
		x1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		x1.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);
		//x1.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		x1.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		}
}
