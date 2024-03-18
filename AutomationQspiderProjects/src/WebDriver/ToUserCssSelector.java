package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUserCssSelector {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ram%20prasad%20yadav/OneDrive/Desktop/HtmlLoginPage.html");
	    driver.findElement(By.cssSelector("#username")).sendKeys("qarp");
	    driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("manager");
	    driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	
	}
}
	
	
