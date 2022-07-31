package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_getDataFromParticularIndex
{
	public static void main(String[] args)
	{		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/html/webtable.html");

		//for header
		String data = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[3]")).getText();		
		System.out.println(data);
		
		
//		String data = driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[2]")).getText();		
//		System.out.println(data);
	}

}
