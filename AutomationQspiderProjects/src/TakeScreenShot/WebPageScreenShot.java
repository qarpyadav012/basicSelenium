package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebPageScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File source = scrShot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:/Users/Ram prasad yadav/Selenium_prerequsite/eclipse/AutomationQspiderProjects/ScreenShot/errorShot.png");
	    Files.copy(source, destination);
	}

}
