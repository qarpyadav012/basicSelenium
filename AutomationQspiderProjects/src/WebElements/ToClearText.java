package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearText {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement un = driver.findElement(By.id("username"));
	WebElement pwd = driver.findElement(By.id("password"));
	un.clear();
	pwd.clear();
	Thread.sleep(2000);
	un.sendKeys("qarpyadav");
	pwd.sendKeys("qarpyadav@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
	Thread.sleep(3000);
	driver.quit();
      }
}
