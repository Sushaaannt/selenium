package Action_class;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_dropdown {
	public static void main(String[] args) {
		
	
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(login).perform();
	    
	    driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
	    
	    
		
	}

}
