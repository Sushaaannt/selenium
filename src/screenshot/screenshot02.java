package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot02 {

		public static void main(String[] args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");	
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
					
					Thread.sleep(3000);
					
					String ss = RandomString.make(); //to name screenshot randomly
		
					File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
					
					
					File y = new File("D:\\s\\"+ss+".jpg"); //random string used here
					
					FileHandler.copy(x, y);
					
		}
	
}
