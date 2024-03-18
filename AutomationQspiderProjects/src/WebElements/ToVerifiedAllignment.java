package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifiedAllignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/login");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("password"));
		Point emailPos = email.getLocation();
		Point pwdPos = pwd.getLocation();
		int emailPosX = emailPos.getX();
		int pwdPosX = pwdPos.getX();
		
		System.out.println("Email X Co-ordinate is:"+emailPosX);
		System.out.println("Password X Co-ordinate is:"+pwdPosX);
		
		if(emailPosX==pwdPosX) {
			System.out.println("Pass: The allignement issue is Verified ");
		}
		else {
			System.out.println("Fail: The allignement issue is not Verified ");
		}
		driver.quit();
		

	}

}
