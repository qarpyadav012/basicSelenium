package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		Point pos = driver.manage().window().getPosition();
		int xCoordinate = pos.getX();
		int yCoordinate = pos.getY();
		System.out.println("The X Coordinate is:"+xCoordinate);
        System.out.println("The X Coordinate is:"+yCoordinate);
      }
	}