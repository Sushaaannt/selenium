package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_AlertPopup1
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium tool\\chromedriver.exe");		
				
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	
		//enter customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		
		//click on submit btn
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(2000);
				
		//gettext from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
//		//click on cancel btn
//		driver.switchTo().alert().dismiss();
		
		
	//	click on ok btn
		driver.switchTo().alert().accept();
		
		//Thread.sleep(1000);
		
//		click on ok btn
		driver.switchTo().alert().accept();
		
	}

}
