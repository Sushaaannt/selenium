package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium tool\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			String title = driver.getTitle();
			System.out.println(title);
			//System.out.println(driver.getTitle());
			
			String url =driver.getCurrentUrl();
			System.out.println(url);
			//System.out.println(driver.getCurrentUrl());
			
		}

}
