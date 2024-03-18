package MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		WebElement source = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/parent::div"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
}}
