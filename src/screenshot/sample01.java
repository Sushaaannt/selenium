package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample01 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://meet.google.com/?hs=197&pli=1&authuser=0");
		
		
		String ab = RandomString.make();
		
		File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File y = new File ("D:\\s\\xyz"+ab+".jpg");
		
		FileHandler.copy(x, y);
	}

}
