package pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_AlertPopup2
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
				
		Alert alt = driver.switchTo().alert();
		
		//getText from alert popup
		String text = alt.getText();
		System.out.println(text);
		
		
//		//click on cancel btn
//		alt.dismiss();
		
		//click on OK btn from 1st alert popup
		alt.accept();
		
		
		//click on OK btn from 2nd alert popup
		alt.accept();
	}

}
