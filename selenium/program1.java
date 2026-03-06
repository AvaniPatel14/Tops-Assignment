package combasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// 1.	Google Search Bot -- open google -- search keyword -- print first 5 titles
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
		WebElement ele=driver.findElement(By.className("gLFyf"));
		ele.sendKeys("automation");
		
		 Actions ac = new Actions(driver);
		 ac.sendKeys(Keys.ENTER).perform();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
         wait.until(ExpectedConditions.urlContains("automation"));
       
		 
		 String url=driver.getCurrentUrl();
		 
		 System.out.println(url);
		 
		 WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(150));
         wait1.until(ExpectedConditions.urlContains("automation"));
		 
		   
         WebElement ele1=driver.findElement(By.className("zReHs"));
      
         String str=ele1.getText();
         
         System.out.println(str);
         																

	}

}
