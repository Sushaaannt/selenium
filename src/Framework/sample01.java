package Framework;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample01 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//input[@label='User ID']")).sendKeys("VS6640");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7066650010");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@label='PIN']")).sendKeys("706665");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
	}

}

