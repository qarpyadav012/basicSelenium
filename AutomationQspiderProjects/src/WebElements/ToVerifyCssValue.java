package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCssValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("btn"));
        button.click();
        String text = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
        
        System.out.println("Displayed Text Is:"+text);
        
        String color = button.getCssValue("background-color");
        Thread.sleep(2000);
		
        System.out.println(color);
        if(color.contains("134, 239, 172")) {
        	System.out.println("Pass: The Button is selected");
        }
        else {
        	System.out.println("Fail: The Button is not selected");
        }
        
        
		driver.quit();
	}
     
}
