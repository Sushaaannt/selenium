package scrollUpDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Selenium tool\\chromedriver.exe");						
	WebDriver driver=new ChromeDriver();

	// Launch the application
	driver.get("http://demo.guru99.com/test/guru99home/");
	
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	// find Facebook webelement
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	
	//Thread.sleep(3000);
	
	// This will scroll the page till the element is found
	((JavascriptExecutor)driver).executeScript("arguments[].scrollIntoView();", facebook);

	
}
}
