package PopUpsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		//alert Pop up
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		
		// Confirmation Pop up
		driver.findElement(By.id("buttonAlerts")).click();
		Thread.sleep(2000);
		alert.dismiss();
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		//Prompt Pop up
		driver.findElement(By.id("buttonAlerts")).click();
		Thread.sleep(2000);
		String textMessage = alert.getText();
		alert.accept();
		System.out.println("This is the alert Message:"+textMessage);
	}
}
