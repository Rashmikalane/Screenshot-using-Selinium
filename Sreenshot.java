package sreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Sreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\A1\\Desktop\\Screenshot\\gpage.png");
		Files.copy(src, dest);
	}

}
