package dynamic_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample01 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi in mobile");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//div[@class='_2kHMtA']")).click();
		
		String y = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		
		System.out.println(y);
	}

}
