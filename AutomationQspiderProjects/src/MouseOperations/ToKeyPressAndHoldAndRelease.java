package MouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyPressAndHoldAndRelease {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='nav-link']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
		for(WebElement link:allLinks) {
			link.click();
		}
		act.keyUp(Keys.CONTROL).perform();
		Thread.sleep(5000);
		driver.quit();
		
      }
	}
