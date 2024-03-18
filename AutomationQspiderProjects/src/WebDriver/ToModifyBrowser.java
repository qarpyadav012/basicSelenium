package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToModifyBrowser {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com");
			Thread.sleep(2000);
			Dimension dim=new Dimension(1500,800);
			driver.manage().window().setSize(dim);
			Thread.sleep(2000);
            driver.close();
	}

}
