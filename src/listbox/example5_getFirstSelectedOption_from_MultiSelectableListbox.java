package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example5_getFirstSelectedOption_from_MultiSelectableListbox {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:\\html/select_table.html");
		
		//step1: 
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));		
		
		//step2:
		Select s=new Select(selectCountry);
		
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		
//		WebElement firstSelectedOption = s.getFirstSelectedOption();
//		String text = firstSelectedOption.getText();
//		System.out.println(text);
		
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
		
		//System.out.println(s.getFirstSelectedOption().getText());
	}
}
