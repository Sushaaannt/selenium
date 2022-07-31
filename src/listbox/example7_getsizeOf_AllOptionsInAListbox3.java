package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example7_getsizeOf_AllOptionsInAListbox3
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
		Select s=new Select(month);		
		
		
//		List<WebElement> multipleOptions = s.getOptions();		
//		int size = multipleOptions.size();
//		System.out.println(size);
		
		int size1 = s.getOptions().size();
		System.out.println(size1);
				
		//System.out.println(s.getOptions().size());
		
	}

}