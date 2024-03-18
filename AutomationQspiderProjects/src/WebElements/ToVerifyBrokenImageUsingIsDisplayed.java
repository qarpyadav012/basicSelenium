package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyBrokenImageUsingIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Broken Image']")).click();
		Thread.sleep(2000);
		WebElement brokenImage = driver.findElement(By.xpath("//img[@alt='broken image']"));
		Thread.sleep(2000);
        System.out.println("Pass: The Broken Image is verified"+brokenImage);
        boolean flag = brokenImage.isDisplayed();
        if(flag) {
        	System.out.println("Pass: The Broken Image is verified");
        }
        else {
        	System.out.println("Fail: The Broken Image is not verified");
        }
        driver.quit();
	}

}
