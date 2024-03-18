package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyIsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
        WebElement checkbox = driver.findElement(By.id("domain1"));
        checkbox.isSelected();
        Thread.sleep(2000);
        if(checkbox.isSelected()) {
        	System.out.println("Pass: The checkbox is selected");
        }
        else {
        	System.out.println("Fail: The checkbox is not selected");
        }
        driver.quit();
	}

}
