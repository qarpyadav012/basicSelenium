package DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyAnOptionIsPresent {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement dropDownYear = driver.findElement(By.id("year"));
		String optionTCheck = "1905";
		boolean flag = false;
		Select selYear=new Select(dropDownYear);
		List<WebElement> options = selYear.getOptions();
		int noOfCount = options.size();
		System.out.println("The Number of options:"+noOfCount);
		
		for(WebElement option:options) {
			if(option.getText().equals(optionTCheck)) {
				flag=true;
				break;
				}
			}
		if(flag) {
			System.out.println(optionTCheck+" :is present");
		}
		else
			System.out.println(options+" :is not present");
	}

}
