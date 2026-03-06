package combasic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//open browser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:\\google.com");
		
		String url=driver.getCurrentUrl();
		System.out.println("url "+url);
		
		String title=driver.getTitle();
		System.out.println("title "+title);
		
		WebElement link =driver.findElement(By.linkText("About"));
		link.click();
		
		//to open a new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.in");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		
		Set <String> set=driver.getWindowHandles();
		System.out.println(set);
		
		ArrayList<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));
		driver.close(); 
		


	}

}
