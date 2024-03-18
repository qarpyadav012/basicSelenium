package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAChildWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipletabs?sublist=3");
		Thread.sleep(3000);
        driver.findElement(By.id("browserButton2")).click();
        Set<String> allWindowIds=driver.getWindowHandles();
        for(String id:allWindowIds) {
        	driver.switchTo().window(id);
        String	currentUrl=driver.getCurrentUrl();
        if(currentUrl.equals("https://demoapps.qspiders.com/ui/browser/SignUp"));
        Thread.sleep(3000);
        driver.close();
        }
	}

}
