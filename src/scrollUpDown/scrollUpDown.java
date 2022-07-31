package scrollUpDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUpDown
{
public static void main(String[] args) throws InterruptedException
{	
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Selenium tool\\chromedriver.exe");		
			
	WebDriver driver=new ChromeDriver();

	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// down --> 2nd parameter +ve pixel value
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2500)");
	
				
	Thread.sleep(3000);
	
	// up --> 2nd parameter -ve value
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");

		
	
	//		Thread.sleep(3000);
//	//right  --> 1st parameter +ve value
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
//	

	
//	Thread.sleep(3000);
//	//left  --> 1st parameter -ve value
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");
//	

		
	
}
}