package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement dropDownDay = driver.findElement(By.id("day"));
		WebElement dropDownMonth = driver.findElement(By.id("month"));
		WebElement dropDownYear = driver.findElement(By.id("year"));
		Select selDay=new Select(dropDownDay);
		selDay.selectByIndex(10);
		Select selMonth=new Select(dropDownMonth);
		selMonth.selectByValue("11");
		Select selYear=new Select(dropDownYear);
		selYear.selectByVisibleText("2000");
	}

}
