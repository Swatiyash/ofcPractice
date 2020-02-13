import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Swati\\Selenium folder\\Demo\\lib\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		//driver.get("https://www.toolsqa.com/iframe-practice-page/");  //Enter URL
		//Thread.sleep(2000);
		
		//WebElement ifame1=driver.findElement(By.id("IF1"));
		/*	driver.switchTo().frame(ifame1);
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/div/a[5]/span[2]")).click();
			Thread.sleep(5000);
			
			
			 // Switch to default content
			  driver.switchTo().defaultContent();
			  
			  //Switch to second frame
			  WebElement ifame2=driver.findElement(By.id("IF2"));
			  driver.switchTo().frame(ifame2);
			  
			  WebElement tab3= driver.findElement(By.id("ui-id-3"));
			 Thread.sleep(2000);
			  
			  //Click on tab3 from second frame
			  tab3.click();
			  String TitleText=driver.findElement(By.xpath(".//*[@id='tabs-3']/b")).getText();
			  System.out.println(TitleText);
			  driver.close();*/
		
		    driver.get("http://demo.guru99.com/test/facebook.html");
		    Thread.sleep(2000);
		    
	        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
	        for (int i=0; i<2; i++) {											
	            chkFBPersist.click ();
	            Thread.sleep(2000);
	            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isEnabled());							
	        }		
			driver.close();		
	        		
	    }		
	
		
	}


