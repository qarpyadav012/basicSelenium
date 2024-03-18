package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTagName {
	public static void main(String[] args) throws InterruptedException {
		String expectedTagName="input";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		String unTagName = un.getTagName();
		String pwdTagName = pwd.getTagName();
		if(unTagName.equalsIgnoreCase(expectedTagName) && pwdTagName.equals(expectedTagName)) {
			un.clear();
			pwd.clear();
			Thread.sleep(2000);
			un.sendKeys("qarpyadav");
			pwd.sendKeys("qarpyadav@123");
			Thread.sleep(2000);
			System.out.println("Pass: The Tag Name is verified");
			System.out.println("User Tag Name is     :  "+unTagName);
			System.out.println("Password Tag Name is :  "+pwdTagName);
			
			driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
			Thread.sleep(3000);
		}
		else {
			System.out.println("Fail: The Tag Name is not verified");
		}
		
		driver.quit();
	 }
}
