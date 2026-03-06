package combasic;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		WebElement yt=driver.findElement(By.name("search_query"));
		yt.sendKeys("python tutuorial");
		
		 Actions ac = new Actions(driver);
		 ac.sendKeys(Keys.ENTER).perform();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		  wait.until(ExpectedConditions.presenceOfElementLocated(
                  By.cssSelector("ytd-video-renderer")));
		 
		 List<WebElement> lst=driver.findElements(By.cssSelector("ytd-video-renderer h3 a#video-title"));
		
		  for (int i = 0; i < Math.min(5, lst.size()); i++) {
              System.out.println((i + 1) + ". " + lst.get(i).getText());
          }
		  
		  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		  WebElement firstVideo = wait1.until(
                  ExpectedConditions.elementToBeClickable(
                          By.cssSelector("ytd-video-renderer h3 a#video-title"))
          );

          // Click first video
          firstVideo.click();
          
          WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20)); 
          wait2.until(ExpectedConditions.presenceOfElementLocated(
                  By.cssSelector("ytd-watch-flexy")));

          System.out.println("Clicked first video successfully!");
          
        //  WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20)); 
          wait.withTimeout(Duration.ofSeconds(10));
          
        System.out.println("Video started...");
          
      //    driver.quit();
		  
		 
	}

}
