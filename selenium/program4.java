package combasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");	
		
		
		WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))
        );
        searchBox.sendKeys("laptop");
		
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
		
		// wait.until(
	      //          ExpectedConditions.presenceOfElementLocated(By.cssSelector("a-link-normal h2")));
		
		List<WebElement> lst=driver.findElements(By.cssSelector("a-link-normal h2"));
		
		  for (int i = 0; i < Math.min(5, lst.size()); i++) {
            System.out.println((i + 1) + ". " + lst.get(i).getText());
        }
		  
		 System.out.println("title found");
		    

	}

}
