package WebElements;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class ToRegisterAnUser {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			Thread.sleep(2000);
			WebElement userName = driver.findElement(By.id("name"));
			WebElement email = driver.findElement(By.id("email"));
			WebElement pwd = driver.findElement(By.id("password"));
			userName.sendKeys("QARPYADAV");
			email.sendKeys("qa.rpyadav19892@gmail.com");
			Thread.sleep(2000);
			email.sendKeys(Keys.CONTROL,"a");
			Thread.sleep(2000);
			email.sendKeys(Keys.CONTROL,"c");
			Thread.sleep(2000);
			pwd.sendKeys(Keys.CONTROL,"v");
			pwd.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			String header = driver.findElement(By.tagName("h1")).getText();
			System.out.println(header);
			if(header.equals("Login")) {
				System.out.println("Pass: The user is registered");
			}
			else {
			System.out.println("Fail: The user is not registered");
			}
			driver.quit();	
		}
	}


