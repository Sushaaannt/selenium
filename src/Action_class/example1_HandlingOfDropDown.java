package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_HandlingOfDropDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
	
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();		
		
		Thread.sleep(2000);
		
		//step1:
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//step2:
		Actions act=new Actions(driver);
		
		//step3:
		act.moveToElement(login).perform();
		
		
		Thread.sleep(2000);
		
		
		//click on gift card from dropdown element
		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
	}

}