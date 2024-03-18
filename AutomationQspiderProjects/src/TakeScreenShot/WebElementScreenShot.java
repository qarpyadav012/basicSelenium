package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File source = scrShot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:/Users/Ram prasad yadav/Selenium_prerequsite/eclipse/AutomationQspiderProjects/ScreenShot/googllogo.png");
	    Files.copy(source, destination);
	}

}
