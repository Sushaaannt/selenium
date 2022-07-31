package Web_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_sleep {
	
	public static void main(String[] args) throws InterruptedException { //throws is automatically printbby thread syntax
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://in.tradingview.com/chart/?symbol=NSE%3ABANKNIFTY");
		
		Thread.sleep(4000);
		
		Driver.quit();
	}

}
