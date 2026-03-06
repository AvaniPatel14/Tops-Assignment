package combasic;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumexample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Scanner sc=new Scanner("System.in");
		System.out.println("Enter gender");
		String gender=sc.next();
		
		if(gender.equals("male"))
		
			driver.findElement(By.id("male")).click();
		
	    else
		 
		driver.findElement(By.id("female")).click();		

	}

}
