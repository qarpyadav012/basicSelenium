package SynchronizationWaitStatements;

import java.time.Duration;
import java.util.List;
import java.lang.Iterable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindNoOfSuggessions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("deadpool");
		List<WebElement> allSuggessions = driver.findElements(By.xpath("//span[contains(text(),'eadpool')]"));
		int noOfSuggessions = allSuggessions.size();
		System.out.println(allSuggessions);
		for(WebElement c : allSuggessions) {
			System.out.println(c.getText());
			
		}
		
 }
}
