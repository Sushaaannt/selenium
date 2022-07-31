package Autosuggetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample01 {
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("redmi");
		
		String exptext= "redmi note 10";
		
		 List<WebElement> all = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(  WebElement y: all) 
		{
			
		String acttext = y.getText();
		
		if(acttext.equals(exptext)) 
		{
			y.click();
			break;
		}
			
		}
	}
	

}
