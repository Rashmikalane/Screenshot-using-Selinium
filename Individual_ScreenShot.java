package sreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Individual_ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.co.in/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		WebElement  logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File src= logo.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\A1\\Desktop\\Screenshot\\logopage.png");
		Files.copy(src, dest);
		

	}

}
