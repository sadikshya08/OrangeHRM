package Assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basic_Setup 
{
	public static WebDriver driver;
	public static WebDriver open1()
	{
		System.setProperty("Webdrive.chrome.driver", ".\\resource1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	@BeforeSuite(alwaysRun = true)
	public static void brow()
	{
		//yo chai initialization
		driver=open1();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		login();			// call gareko login function
		
	}	
	public static void login() 
	{
		// yesbata chai login procedure suru
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();		//my info mai automate gariraxu sabko

				
	}
	
	
}
