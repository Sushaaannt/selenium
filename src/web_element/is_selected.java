package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected {
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		
		x1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		x1.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(1000);
		WebElement button=x1.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		
		boolean button1=button.isSelected();
		
		if(button1==true) 
		{
			System.out.println("button is selected");
		}
		else 
		{
			button.click();
			boolean s1 = button.isSelected();
			
			if (s1==true) 
			{
				System.out.println("is selected");
			}
			else 
			{
				System.out.println("not selected");
			}
		}
		}

}
