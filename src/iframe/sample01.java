package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample01 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame("howto_iframe");
		
		driver.findElement(By.xpath("//a[@onclick='plusSlides(1)']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@onclick='plusSlides(1)']")).click();
		
	}

}
