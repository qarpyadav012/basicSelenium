package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ram%20prasad%20yadav/OneDrive/Desktop/HtmlLoginPage.html");
	    driver.findElement(By.linkText("Go To Qspiders")).click();
	    driver.manage().window().maximize();
	}

}
