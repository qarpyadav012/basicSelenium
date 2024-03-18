package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseContainsMethod {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		String text = driver.findElement(By.xpath("//p[contains(text(),'If you want to create robust')]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[contains(@href,'https://www.youtube.com/p')]")).click();
}
}
