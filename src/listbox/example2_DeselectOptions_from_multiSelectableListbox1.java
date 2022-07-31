package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_DeselectOptions_from_multiSelectableListbox1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:\\html/select_table.html");
		
		//step1: 
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));		
		
		//step2:
		Select s=new Select(selectCountry);
		
		//step3:
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		
		s.deselectByVisibleText("Ind");
		s.deselectByIndex(2);
		//s.deselectByValue("");
		
	}

}