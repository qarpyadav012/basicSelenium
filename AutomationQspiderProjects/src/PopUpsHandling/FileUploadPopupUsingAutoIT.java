package PopUpsHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupUsingAutoIT {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.findElement(By.xpath("//div[text()='upload file']")).clear();
		Runtime.getRuntime().exec("C:\\\\Users\\\\Ram prasad yadav\\\\OneDrive\\\\Desktop\\\\autoIttest.au3");
	}

}
