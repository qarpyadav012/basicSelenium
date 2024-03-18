package SynchronizationWaitStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToExplicitWaitForElementToBeClickable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
        WebElement email = driver.findElement(By.id("email"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(email));
        email.sendKeys("qarpyada@gmail.com");
        WebElement continueButton=driver.findElement(By.xpath("//button[@data-continue-to='password-container']"));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
        
   }
}