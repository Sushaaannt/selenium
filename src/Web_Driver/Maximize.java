package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;



public class Maximize {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		//driver.manage().window().maximize();
		Options s1 = driver.manage();
		Window s2 = s1.window();
		s2.maximize();
		
		// Dimension d = new Dimension(400,600);

		// driver.manage().window().setSize(d);
	}

}
