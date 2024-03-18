package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       Navigation nav=driver.navigate();
       nav.to("https://www.facebook.com");
       Thread.sleep(2000);
       nav.to("https://www.instagram.com");
       Thread.sleep(2000);
       nav.back();
       Thread.sleep(2000);
       nav.forward();
       Thread.sleep(2000);
       nav.refresh();
       Thread.sleep(3000);
       driver.close();
	}

}
