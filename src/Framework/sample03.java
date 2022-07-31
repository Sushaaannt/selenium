package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample03 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Selenium tool\\Book1.xlsx");
		Sheet x = WorkbookFactory.create(file).getSheet("Sheet1");

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//input[@label='User ID']")).sendKeys(x.getRow(0).getCell(0).getStringCellValue());
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(x.getRow(0).getCell(1).getStringCellValue());
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@label='PIN']")).sendKeys(x.getRow(0).getCell(2).getStringCellValue());
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		 
		
	}

}
