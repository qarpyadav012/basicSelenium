package PopUpsHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.linkText("Open in new Window")).click();
		Set<String> allIds = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String id:allIds) {
			driver.switchTo().window(id);
			
			String currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains("signuppage")) {
				driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
				driver.findElement(By.id("password")).sendKeys("qwerty");
				driver.close();
			}
		}
		
	}

}
