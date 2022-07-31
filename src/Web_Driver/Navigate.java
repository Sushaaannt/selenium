package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://google.com");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
