package seleniumProject;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("user_login")).sendKeys("root");
		  
		  
		  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		  
		  driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
		  
		  driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
		  
		  driver.findElement(By.linkText("Add New")).click();
		  driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[1]/button")).click();
		 
		  
			/*
			 * driver.findElement(By.id("post-title-0")).click();
			 * 
			 * driver.findElement(By.className("editor-post-title")).sendKeys(
			 * "CA_Accountent");
			 */
			/*
			 * String bkg = "ABCDE9000333"; WebElement bkgNo =
			 * driver.findElement(By.id("post-title-0")); JavascriptExecutor jse =
			 * (JavascriptExecutor)driver; jse.executeScript("arguments[0].value="+bkg+";",
			 * bkgNo);
			 */
		  driver.findElement(By.xpath("//*[@id='editor']/div/div/div[1]/div/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div")).click();
		  
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys("testing1");
			
			  driver.findElement(By.id("_job_location")).sendKeys("ongole");
			 
				
				  driver.findElement(By.id("_company_website")).sendKeys("www.ibm.com");
				  driver.findElement(By.id("_company_name")).sendKeys("IBM");
				  driver.findElement(By.id("_company_tagline")).sendKeys("Be Equal");
				  driver.findElement(By.id("_company_twitter")).sendKeys("www.twitter.com");
				  driver.findElement(By.id("_company_video")).sendKeys("www.google.com");
				  driver.findElement(By.id("in-job_listing_type-5")).click();
				  driver.findElement(By.xpath("//button[contains(text(), 'Publish…')]")).
				  click();
				  
				  	
					     driver.findElement(By.xpath("//*[@id='editor']/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
					  
						
				 
	
	}

}
