package combasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class redbuslabtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // FROM
        WebElement fromInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("srcinput")));
        fromInput.sendKeys("Paldi");

        List<WebElement> fromSuggestions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("div.lineLength2___37b7a3:nth-child(2)")));

        for (WebElement city : fromSuggestions) {
            if (city.getText().contains("Paldi")) {
                city.click();
                break;
            }
        }

        // TO
        WebElement toInput = driver.findElement(By.id("destinput"));
        toInput.sendKeys("Bangalore");

        List<WebElement> toSuggestions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("div.listItem___baef76:nth-child(1)")));

        for (WebElement city : toSuggestions) {
            if (city.getText().contains("Bangalore")) {
                city.click();
                break;
            }
        }

        // READ entered values
        String fromValue = fromInput.getAttribute("value");
                 String toValue = toInput.getAttribute("value");

        System.out.println("From: " + fromValue);
        System.out.println("To: " + toValue);
        
        
        WebElement searchBusesBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.className("searchButtonWrapper___2d58a0")));
           searchBusesBtn.click();

        
      
       // driver.quit();
    
		
	}

}
