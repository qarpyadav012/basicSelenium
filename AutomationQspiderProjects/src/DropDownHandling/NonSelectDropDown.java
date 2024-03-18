package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NonSelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/search?sublist=2");
		WebElement countryDropDown = driver.findElement(By.xpath("//label[text()='Country']/..//div[@class=' css-19bb58m']"));
		
		Actions act=new Actions(driver);
		act.sendKeys(countryDropDown,"China").sendKeys(Keys.ENTER).perform();
	}

}
