package Autosuggetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_getReviewsFromFlipkartApp 
{
	
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
	
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//search mob
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
		
		
		//click on search icon
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		//get reviews
		String review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
		System.out.println(review);
		
	}

}
