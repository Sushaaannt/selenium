package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_with_DDF1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("D:\\Selenium tool\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		
		//Enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		//Enter pwd
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
				
		//click on login btn
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
		
		//click on continue btn
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expUserID = sh.getRow(0).getCell(3).getStringCellValue();
		
		if (actUserID.equals(expUserID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		Thread.sleep(3000);
		
		driver.close();
			
	}

}
