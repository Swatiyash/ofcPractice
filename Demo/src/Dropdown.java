import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Swati\\Selenium folder\\Demo\\lib\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		//Dropdown
		WebElement Dropdown=driver.findElement(By.xpath("//*[@id=\"testingDropdown\"]"));
		Select Drop=new Select(Dropdown);
		
		Drop.selectByVisibleText("Database Testing");
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		

	}

}
