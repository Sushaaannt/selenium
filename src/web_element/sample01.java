package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample01 {
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		
		x1.get("https://paytm.com/recharge");
		Thread.sleep(2000);
		
		WebElement button=x1.findElement(By.xpath("//label[text()='Postpaid']"));
		
		boolean result = button.isSelected();
		
		if (result==true) 
		{
			System.out.println("btn is selected");
		}else 
		{
			Thread.sleep(2000);
			button.click();
			
			boolean result2 = button.isSelected();
			if (result2==true) 
			{
				System.out.println("btn is selected");
			}
			else 
			{
				System.out.println("not selected");
			}
		}
		
		}

}
