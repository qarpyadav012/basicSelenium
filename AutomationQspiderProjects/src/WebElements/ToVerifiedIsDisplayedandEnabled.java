package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifiedIsDisplayedandEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("email"));
        WebElement button = driver.findElement(By.xpath("//button[@data-continue-to='password-container']"));
        boolean emaiDisplayed = email.isEnabled();
        if(emaiDisplayed)
        {
        	System.out.println("Pass: The email is displayed");
        	email.sendKeys("qa.rpyadav@gmail.com");
        	Thread.sleep(3000);
        	boolean buttonEnabled = button.isEnabled();
            
            if(buttonEnabled)
            {
            	System.out.println("Pass: The Button is Enabled");
            }
           else {
            	System.out.println("Fail: The Button is not Enabled");
                } 
        }
        else {
        	System.out.println("Fail: The email is not displayed");
              }
 
	     }
      
      }

