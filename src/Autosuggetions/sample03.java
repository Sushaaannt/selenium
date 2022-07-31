package Autosuggetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample03 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("redmi");
		
		List<WebElement> x = driver.findElements(By.xpath("(//ul[@role='listbox'])[2]/li"));
		
		String exp = "redmi note 11";
		
		for(WebElement y:x) {
			
			String act = y.getText();
			
			if(exp.equals(act)) {
				y.click();
				break;
			}
			
		}
		
	}

}
