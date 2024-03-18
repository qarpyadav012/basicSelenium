package DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyAnOption {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement dropDownYear = driver.findElement(By.id("year"));
		Select selYear=new Select(dropDownYear);
		List<WebElement> options = selYear.getOptions();
		int noOfCount = options.size();
		System.out.println("The Number of options:"+noOfCount);
		
		for(WebElement option:options) {
			String text = option.getText();
			System.out.println("The Text of options:"+text);
		}
		
	}

}
