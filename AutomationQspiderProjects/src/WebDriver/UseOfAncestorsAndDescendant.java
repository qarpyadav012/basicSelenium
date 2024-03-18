package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfAncestorsAndDescendant {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 14 (512 GB) - Starlight");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (512 GB) - Starlight']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']"
				+ "/descendant::span[@class='a-price-whole']")).click();
}
}
