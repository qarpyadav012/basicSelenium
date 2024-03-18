package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceVerification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String expContent="Gmail";
        String actualPageSource=driver.getPageSource();
        if(actualPageSource.contains(expContent)) {
        	System.out.println("Pass: The Contains of Page Source is verfied");
        }
        else {
        	System.out.println("Fail: The Contains of URL is not verfied");
        }
        
        //System.out.println("Actual Page source:"+actualPageSource);
        //Thread.sleep(5000);
        //driver.close();
	}
	
}
