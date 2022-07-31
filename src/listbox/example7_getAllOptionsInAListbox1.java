package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example7_getAllOptionsInAListbox1
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:\\html/select_table.html");
		
		//step1: 
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));		

		Select s=new Select(selectCountry);
		
		List<WebElement> multipleOptions = s.getOptions();
		
		for(WebElement s1:multipleOptions) 
		{
			System.out.println(s1.getText());
		}
		
		
	}

}