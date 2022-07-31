package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class example5_mouseDoubleClick
{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
       WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
	   Actions act=new Actions(driver);
	   
//	   act.moveToElement(element).perform();
//	   act.doubleClick().perform();
	   
	//   act.moveToElement(element).doubleClick().build().perform();
	   
	   act.doubleClick(element).perform();
	   
	   driver.switchTo().alert().accept();
	   
	}

}