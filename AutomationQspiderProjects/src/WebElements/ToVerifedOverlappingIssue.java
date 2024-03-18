package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifedOverlappingIssue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("password"));
		Rectangle emailRect = email.getRect();
		Rectangle pwdRect = pwd.getRect();
		int emailY = emailRect.getY();
		int emailH = emailRect.getHeight();
		int emailEndY = emailY+emailH;
		
		int pwdY = pwdRect.getY();
		
		System.out.println("Email End Y Co-ordinate is:"+emailEndY);
		System.out.println("Password Start Y Co-ordinate is:"+pwdY);
		Thread.sleep(2000);
		if(emailEndY<=pwdY) {
			System.out.println("Pass: The Overlapping issue is Verified");
			
		}
		else {
			System.out.println("Fail: The Overlapping issue is not Verified");
		}
		
		driver.quit();
      
	}

}
