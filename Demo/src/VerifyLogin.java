import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLogin
{
	@Test
	public void verifylogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UE\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		LoginPage Login=new LoginPage(driver);
		
		Login.username();
		
		Login.Password();
		
		Login.submit();
		
		//driver.quit();
	}

}
