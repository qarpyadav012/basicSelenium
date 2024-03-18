package DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyselectedOrNot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement countryDropDown = driver.findElement(By.id("select-multiple-native"));
		Select select=new Select(countryDropDown);
		select.selectByVisibleText("Canada");
		select.selectByVisibleText("China");
		select.selectByVisibleText("Poland");
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		int noOfCount = allSelectedOptions.size();
		System.out.println(noOfCount);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		System.out.println("=================================================");
		for(WebElement option:allSelectedOptions) {
			System.out.println(option.getText());
		
	}

	}
	}
