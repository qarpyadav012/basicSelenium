package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathText {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ram%20prasad%20yadav/OneDrive/Desktop/HtmlLoginPage.html");
		WebElement headerText = driver.findElement(By.xpath("//h1[text()=' Qspider Login Page ']"));
		WebElement link = driver.findElement(By.xpath("//a[text()=' Go To Qspiders 2024 ']"));
		String text = headerText.getText();
		System.out.println(link);
		System.out.println(text);
		link.click();
		
		
}
}
