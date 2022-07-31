package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex02_selected {
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
				
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);		
		
		
		boolean result = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		System.out.println(result);
		
		
		if(result==true)
		{
			System.out.println("radio button selected");
		}
		else
		{
			System.out.println("radio button de-selected");
		}
		
		
	}


}
