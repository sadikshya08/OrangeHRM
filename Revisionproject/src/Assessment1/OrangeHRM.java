package Assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrangeHRM extends Basic_Setup
{
	@Test (priority = 1)
	public static void my_info() 
	{	//xpath aafai banako le kam garena
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));			// to delete the values in text field , clear function le kam garena
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("Rachel");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Anne");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.DELETE));		//Control A or a both works
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Green");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.CONTROL,"A",Keys.DELETE);		//Chord bina nI DELETE OR BACK-SPACE LE KAM GARXA
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Rach");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.CONTROL,"A",Keys.DELETE);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("0011");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys(Keys.CONTROL,"A",Keys.DELETE);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("0012");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.CONTROL,"A",Keys.DELETE);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("11223344");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(Keys.CONTROL,"A",Keys.BACK_SPACE);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("2020-02-20");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.CONTROL,"A",Keys.DELETE);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/input[1]")).sendKeys("09");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[2]/input[1]")).sendKeys(Keys.CONTROL,"A",Keys.DELETE);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[2]/input[1]")).sendKeys("008");
	}
		@Test (priority = 2)
		public static void nationality() 
		{
			// Select class banayera dropdown le kam garena yesma as in ProtoCommerce cause yesma tag ma Select nai xaina HTML ma
			//These dropdowns are called bootstrap dropdown jasko options ko xpath herna mileko thiyena so I used SELECTOR HUB EXTENSION KO TURN ON DEBUGGER OPTION LIST KO NI HTML herna
			//yeta div wala xpath i made using chropath and span using selector hub as manual xpath ko ma kunai ma indexing garna milena kunai ma inspect garnai milena
			
			//create local variable garera nationalityDdown lai Webelement banako
			WebElement nationalityDdown = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));		//whole box text field ra dropdown ko xpath ligesi balla milyo
			nationalityDdown.click();
			WebElement NepaleseOption = driver.findElement(By.xpath("//span[normalize-space()='Nepalese']"));
			NepaleseOption.click();
			
		}
		@Test (priority = 3)
		public static void marriage_status()
		{
			WebElement marriageDdown = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]"));
			marriageDdown.click();
			WebElement singleOption = driver.findElement(By.xpath("//span[normalize-space()='Single']"));
			singleOption.click();
		}
		@Test (priority = 4)
		public static void info_continued() 
		{
			driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]")).sendKeys(Keys.CONTROL,"A",Keys.DELETE);
			driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]")).sendKeys("1990-01-20");
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]")).click();
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.CONTROL,"A",Keys.DELETE);
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Yes");
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/i[1]")).click();
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/button[1]")).submit();
		}
		@Test (priority = 5)
		public static void bloodType() 
		{
			driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
			WebElement BloodGrp = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
			BloodGrp.click();
			WebElement Otype = driver.findElement(By.xpath("//span[normalize-space()='O+']"));
			Otype.click();
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/button[1]")).click();
		}
		//@Test (priority = 6)
		public static void picture() throws InterruptedException 
		{
			driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
			Thread.sleep(Duration.ofSeconds(5));
			WebElement imgUpload = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]"));
			imgUpload.sendKeys("C:\\Users\\HP\\download-compresskaru.com.png");
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/button[1]")).click();
			
		}
}
