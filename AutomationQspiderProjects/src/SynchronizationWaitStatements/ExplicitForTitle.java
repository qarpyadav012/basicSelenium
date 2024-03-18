package SynchronizationWaitStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitForTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String loginPageTitle = driver.getTitle();
        
		driver.findElement(By.xpath("//button[@class='button buttonBlue']")).click();
		
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 
		 wait.until(ExpectedConditions.titleContains("Dashboard"));
		 
		 String homePageTitle = driver.getTitle();
		 System.out.println("Login Page title:  "+loginPageTitle);
		 System.out.println("Login Page title:  "+homePageTitle);
	}
	
}
