package Autosuggetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample04 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirt");
		
		List<WebElement> x = driver.findElements(By.xpath("//ul[@class='desktop-group']/li"));
		
		String exp = "shirt casual";
		
		for(WebElement y:x) {
			
			String act = y.getText();
			
			if(exp.equalsIgnoreCase(act)) {
				y.click();
				break;
			}
		}
}
}