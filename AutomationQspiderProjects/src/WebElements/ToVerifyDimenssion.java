package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimenssion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/Login");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("password"));
		Dimension emailDim = email.getSize();
		Dimension pwdDim = pwd.getSize();
		int emailHeight = emailDim.getHeight();
		int emailWidth = emailDim.getWidth();
		
		int pwdHeight = pwdDim.getHeight();
		int pwdWidth = pwdDim.getWidth();
		
		System.out.println("The Height of Email:"+emailHeight);
		System.out.println("The Width of Email:"+emailWidth);
		System.out.println("The Height of Password:"+pwdHeight);
		System.out.println("The Width of Password:"+pwdWidth);
		
		if(emailHeight==pwdHeight && emailWidth ==pwdWidth) {
			System.out.println("Pass: The Dimenssions are verified");
		}
		else {
			System.out.println("Pass: The Dimenssions are verified");
		}
		driver.quit();
		
		
		
		
	}

}
