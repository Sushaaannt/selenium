package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver s1= new ChromeDriver();
		s1.get("https://www.facebook.com/");
		
		
	}

}
