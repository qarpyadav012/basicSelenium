package Framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOutComeFromPresentToParentAndDefault {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(outerFrame);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.switchTo().parentFrame();
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		System.out.println(email);
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//span[text()='Write a script to handle frames in web page?']")).getText();
		System.out.println(text);
	}

}
