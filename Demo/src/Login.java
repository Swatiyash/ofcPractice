import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Open Browser
		System.setProperty("webdriver.gecko.driver", "D:\\Swati\\Selenium folder\\Demo\\lib\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.seleniumeasy.com/selenium-tutorials");  //Enter URL
		Thread.sleep(1000);
		
		String actualTitle=driver.getTitle();   //Get Title
		System.out.println(actualTitle);
		
		
		if(actualTitle.contentEquals("Data"))
		{
			System.out.println("Test passed!!!");
		}
		else
		{
			System.out.println("Test failed!!!");
		}
		
		
		//Locaters
		
		/*driver.findElement(By.className("gb_g")).click();
		
		driver.findElement(By.id("edit-search-block-form--2")).sendKeys("Test NG");
		
		driver.findElement(By.cssSelector("#edit-search-block-form--2")).sendKeys("Data");
		
		driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]")).sendKeys("java");
		
		driver.findElement(By.linkText("Maven")).click();
		
		driver.findElement(By.partialLinkText("Add new")).click();
		
		driver.findElement(By.name("search_block_form")).sendKeys("swati");
		
		
		//Get commands
		String source=driver.getPageSource();
		System.out.println(source);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String text=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[2]/div/section[1]/div/a[2]")).getText();
		System.out.println(text);*/
		
		
		//Navigate commands
		driver.navigate().to("https://www.toolsqa.com/selenium-webdriver/selenium-navigation-commands/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
