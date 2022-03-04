package fi.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



/**
 * Hello world!
 *
 */
public class App 
{

	
//	public void launchBrowser() {
//		System.setProperty("webdriver.edge.driver",
//    			"C:\\Users\\saura\\3D Objects\\C-DAC -2021\\Module -8- Software Development\\edgedriver_win64\\msedgedriver.exe");
//    	
//    	driver = new EdgeDriver();
//    	
//    	driver.get("http://www.flipkart.com");
//	}
	

	

		ChromeDriver driver;
		public void launchBrowser() 
		{
			System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\saura\\3D Objects\\C-DAC -2021\\Module -8- Software Development\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
		}
		public void navigate() throws InterruptedException
		{
			driver.navigate().to("https://www.flipkart.com/");
			
			
		}
		public void login() throws InterruptedException
		{
		
	         driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("9307933549");
			
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Saurabh@5016");
			
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
			Thread.sleep(2000);
			
			driver.close();
			
		}
		

		
		public static void main(String[] args) throws InterruptedException 
		{
			App ob = new App();
			ob.launchBrowser();
			ob.navigate();
			ob.login();
			
		}
	
}
