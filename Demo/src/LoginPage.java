import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	By username = By.id("txtUsername");
	By Password = By.name("txtPassword");
	By loginButton = By.xpath("//input[@name='Submit']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void username()
	{
		driver.findElement(username).sendKeys("Admin");
	}
	
	
	public void Password()
	{
		driver.findElement(Password).sendKeys("admin123");
	}
	
	public void submit()
	{
		driver.findElement(loginButton).click();
	}

}
