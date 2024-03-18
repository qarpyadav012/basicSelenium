package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChangePositionOfBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		
		Point newPos = new Point(100, 200);
		driver.manage().window().setPosition(newPos);
		Thread.sleep(2000);
	   driver.close();
	}	
}
