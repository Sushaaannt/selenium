package HandlingOfCustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2_SelectOptionUsing_HomeKey
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
			
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);		
		
		//step1: 
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));		
	
		//step2: 
		Actions act=new Actions(driver);
		
		//step3:
		act.click(month).perform();
		
		Thread.sleep(2000);
		
		//navigate to 1st option using "HOME" key
		act.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		
		//4A: Navigate to Aug option 		
		for(int i=1; i<=7; i++) 
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
				
		Thread.sleep(2000);		
		
		//4C: select Aug option using "Enter" key
		act.sendKeys(Keys.ENTER).perform();
			
	}

}