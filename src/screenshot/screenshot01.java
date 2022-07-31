package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot01 {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");	
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
					
					Thread.sleep(3000);
					
					File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //downcasting
					
					File y = new File("D:\\s\\xyz.jpg");//xyz is the name of ss
					
					FileHandler.copy(x, y);
		}

}
