package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getColSize
{
	public static void main(String[] args)
	{		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/html/webtable.html");
		
		//for header
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(colSize);
		
		
//		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
//		System.out.println(colSize);
		
	}

}