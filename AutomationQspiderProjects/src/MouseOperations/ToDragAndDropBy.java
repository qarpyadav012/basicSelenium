package MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDropBy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		WebElement box = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDropBy(box, 80, 70).perform();
		
}}
