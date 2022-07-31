package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToMainPage_From_Frame
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium tool\\chromedriver.exe");		
				
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
		
		//switch to frame
		driver.switchTo().frame("iframeResult");   // String FrameID
		
		
		//click on click me btn
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		Thread.sleep(2000);
		
		
		//switch to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		//click on home icon
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
				
	}

}
