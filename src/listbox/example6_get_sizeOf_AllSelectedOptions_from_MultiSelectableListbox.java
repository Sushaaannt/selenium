package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example6_get_sizeOf_AllSelectedOptions_from_MultiSelectableListbox {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:\\html/select_table.html");
		
		//step1: 
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));		
		
		//step2:
		Select s=new Select(selectCountry);
		
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();		
		int size = allSelectedOptions.size();
		System.out.println(size);
		
		int size1 = s.getAllSelectedOptions().size();
		System.out.println(size1);
		
		System.out.println(s.getAllSelectedOptions().size());
		
	}

}


