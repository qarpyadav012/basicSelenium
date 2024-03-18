package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TosubmitForm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonsubmit?sublist=3");
		Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("sat1"));
        Thread.sleep(2000);
        button.click();
        button.submit();
        String submitButtonText = driver.findElement(By.xpath("//span[text()='You Selected \"Yes\"']")).getText();
        System.out.println("submit Button Text:"+submitButtonText); 
        driver.quit();
        }
}