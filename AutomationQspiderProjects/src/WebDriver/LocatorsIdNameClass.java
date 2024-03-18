package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIdNameClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ram%20prasad%20yadav/OneDrive/Desktop/HtmlLoginPage.html");
	    WebElement userName=driver.findElement(By.id("username"));
	    WebElement password=driver.findElement(By.name("password"));
	    WebElement checkbox=driver.findElement(By.className("checkbox"));
	    userName.sendKeys("qarpyadav");
	    password.sendKeys("Pooja@143");
	    checkbox.click();
	
	}

}
