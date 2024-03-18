package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseTagName {
	public static void main(String[] args) {
		//Test data
		String expectedheaderText="Qspider";
		//Preconditions
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ram%20prasad%20yadav/OneDrive/Desktop/HtmlLoginPage.html");
		//Test Case-To verify the header
	    WebElement header = driver.findElement(By.tagName("h1"));
	    String actualHeaderText = header.getText();
	    System.out.println("Actual Header:"+actualHeaderText);
	    if(actualHeaderText.contains(expectedheaderText)) {
	    	System.out.println("Pass:The Header is verified");
	    }
	    else {
	    	System.out.println("fail:The Header is not verified");
	    	//Post Condition
	    	driver.quit();
	    }
	}
}
