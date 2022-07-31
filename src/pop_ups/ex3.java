package pop_ups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> x = driver.getWindowHandles();
		ArrayList<String> y = new ArrayList<String>(x);
		
		
		
		driver.switchTo().window(y.get(1));
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Training Topics']")).click();
		
		driver.navigate().refresh();
		
		driver.switchTo().window(y.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
//		driver.switchTo().window(y.get(2));
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//span[text()='Home']")).click();
		
		
}
		
		
		

}
