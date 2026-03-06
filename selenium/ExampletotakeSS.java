package combasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ExampletotakeSS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot shot=(TakesScreenshot)driver;
		File file=shot.getScreenshotAs(OutputType.FILE);
		File file1=new File("C:\\Users\\Hewlett-Packard\\Documents\\1.png");
        Files.copy(file, file1);
		System.out.println(file.getAbsolutePath());  
		

	}

}
