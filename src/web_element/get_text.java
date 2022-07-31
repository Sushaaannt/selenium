package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium tool\\chromedriver.exe");
		
		WebDriver x1= new ChromeDriver();
		
		x1.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		String title=x1.findElement(By.xpath("//a[text()='Create New Account']")).getText();
		System.out.println(title);
		//in this the last method is get text whose return type is string so we create variable object to store it
		
		}

}
