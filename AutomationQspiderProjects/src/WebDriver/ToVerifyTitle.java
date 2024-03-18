package WebDriver;

   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;

      public class ToVerifyTitle {
         public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        String expTitle="Facebook";
	        String actualTitle=driver.getTitle();
	        if(actualTitle.contains(expTitle)) {
	        	System.out.println("Pass: The Title is verfied");
	        }
	        else {
	        	System.out.println("Fail: The Title is not verfied");
	        }
	        Thread.sleep(5000);
	        driver.close();
		}

	}

