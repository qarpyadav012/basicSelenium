package MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		WebElement button = driver.findElement(By.id("btn20"));
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
     }
	}
