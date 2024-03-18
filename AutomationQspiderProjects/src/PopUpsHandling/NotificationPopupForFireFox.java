package PopUpsHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopupForFireFox {

	public static void main(String[] args) {
		FirefoxOptions option=new FirefoxOptions();
		option.addPreference("dom.webnotifications.enabled",false);
		
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
	}

}
