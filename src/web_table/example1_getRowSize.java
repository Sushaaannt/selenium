package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_getRowSize
{
	public static void main(String[] args)
	{		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/html/webtable.html");
	
		
//		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
//		int rowSize = allRows.size();
//		System.out.println(rowSize);
		
		
		int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(rowsize);
		
		
	//	System.out.println(driver.findElements(By.xpath("//table[@id='1234']//tr")).size());
	}

}
