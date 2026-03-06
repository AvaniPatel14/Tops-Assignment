package combasic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		WebElement ele=driver.findElement(By.name("search"));
		ele.sendKeys("Selenium java");
		
		 Actions ac = new Actions(driver);
		 ac.sendKeys(Keys.ENTER).perform();
		 
		 //mw-search-results-info
		 
		 WebElement paragraph=driver.findElement(By.className("mw-search-results-info"));
		 String str=paragraph.getText();
		 System.out.println(str);
		 
		 List<WebElement> headings = driver.findElements(
				 By.cssSelector("h1, h2, h3, h4, h5, h6"));
		 
		 Iterator<WebElement> i=headings.iterator();
			while(i.hasNext())            
			{
				WebElement ele1=i.next();
				System.out.println(ele1.getText());
			}
			        

	}

}
