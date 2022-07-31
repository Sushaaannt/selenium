package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_selectMultipleCheckboxes
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium tool\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/html/multiselectable%20checkbox.html");

		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for(WebElement s1: allCheckboxes) 
		{
			s1.click();
			Thread.sleep(1000);
		}
		
		
	}

}
