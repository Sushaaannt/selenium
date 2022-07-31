package pop_ups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_switch_to_child_win {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> y = new ArrayList<String> (all_id);
		 
		String z = y.get(1);
		
		driver.switchTo().window(z);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
	}

}
