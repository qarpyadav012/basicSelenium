package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseAbsoluteXpath {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ram%20prasad%20yadav/OneDrive/Desktop/HtmlLoginPage.html");
		driver.findElement(By.xpath("html/body/input[1]")).sendKeys("QARP");
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys("qarpyadav");
		driver.findElement(By.xpath("html/body/input[3]")).click();
   }
}
