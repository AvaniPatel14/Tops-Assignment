package combasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//code for double click
		WebElement ele=driver.findElement(By.id("name"));
		ele.sendKeys("Avani");
		Actions ac=new Actions(driver);
		ac.doubleClick(ele).perform();
		
		//code for drag and drop
		
		WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        System.out.println(droppable.getText());
        new Actions(driver)
                .dragAndDrop(draggable, droppable)
                .perform();
        
        System.out.println(droppable.getText());
		


	}

}
