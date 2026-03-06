package combasic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenimexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> i=lst.iterator();
		while(i.hasNext())
		{
			WebElement ele=i.next();
			System.out.println(ele.getText());
		}
				
	}

}
