package MouseOperations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToBringMousePointerOnFocus {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		act.moveByOffset(1448, 43).click().perform();
		driver.close();
}
}