package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAndDeselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement countryDropDown = driver.findElement(By.id("select-multiple-native"));
		Select select=new Select(countryDropDown);
		select.selectByVisibleText("Canada");
		Thread.sleep(2000);
		select.selectByVisibleText("China");
		Thread.sleep(2000);
		select.selectByVisibleText("Poland");
		Thread.sleep(2000);
		select.selectByValue("Canada");
		Thread.sleep(2000);
		select.deselectAll();
		
	}

}
