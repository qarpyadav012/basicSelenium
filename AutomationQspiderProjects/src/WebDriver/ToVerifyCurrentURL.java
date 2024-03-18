package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
        driver.manage().window().maximize();
        String expUrl="button";
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains(expUrl)) {
        	System.out.println("Pass: The Contains of URL is verfied");
        }
        else {
        	System.out.println("Fail: The Contains of URL is not verfied");
        }
        //Thread.sleep(5000);
        //driver.close();
	}
}
