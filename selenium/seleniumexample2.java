package combasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement txtName=driver.findElement(By.name("email")); 
		txtName.sendKeys("avanipatel140192@gmail.com");
		
		WebElement Password=driver.findElement(By.name("password")); 
		Password.sendKeys("avanipatel140192");
		
		WebElement cPassword=driver.findElement(By.name("confirmPassword")); 
		cPassword.sendKeys("avanipatel140192");
		
		WebElement country=driver.findElement(By.name("country"));
		
		Select sel=new Select(country);
		sel.selectByVisibleText("CUBA");
		
		
		 

	}

}
