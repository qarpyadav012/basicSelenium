package WebDriver;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSingleWindowId {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multiplewindow?sublist=2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();	
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println(windowIds);
		Thread.sleep(10000);
        driver.quit();
	}

}
