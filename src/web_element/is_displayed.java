package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_displayed {
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		
		x1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		boolean pic=x1.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(pic);
		if(pic==true) {
			System.out.println("Logo is displayed");
		}
		else {
			System.out.println("not displayed");
		}
		}

}
