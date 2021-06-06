package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Activity7 {
	 public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
		    
			  WebDriver driver = new ChromeDriver();
			   
			  driver.get("https://alchemy.hguy.co/jobs");

			  driver.manage().window().maximize();
			  
			  driver.findElement(By.linkText("Post a Job")).click();
			  
			  Thread.sleep(5000);
			  
			  String ExpectedJob= "Developer";

			  
			  driver.findElement(By.id("create_account_email")).sendKeys("ramyakommalapati@mail.com");
			  
			  driver.findElement(By.id("job_title")).sendKeys(ExpectedJob);
			  
			  driver.findElement(By.id("job_location")).sendKeys("Ongole");
			  
				Select jobtype = new Select(driver.findElement(By.id("job_type")));
				
				jobtype.selectByVisibleText("Part Time");
				
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(By.xpath("//label[contains(text(),'Description')]//following::iframe[1]"));
			    		
			    js.executeScript("arguments[0].scrollIntoView();", Element);
			    
			    WebElement iframe = driver.findElement(By.cssSelector("#job_description_ifr"));;
			    driver.switchTo().frame(iframe);
			   
			    driver.findElement(By.xpath("/html/body")).sendKeys("Rquirement for Java Developer");
				driver.switchTo().defaultContent();
				
				Thread.sleep(3000);
				
				driver.findElement(By.id("application")).sendKeys("https://w3.ibm.com");
				driver.findElement(By.id("company_name")).sendKeys("IBM");
				
				driver.findElement(By.id("company_website")).sendKeys("http://IBM%20INDIA%20Private%20Limited");
				driver.findElement(By.id("company_tagline")).sendKeys("IBM INDIA Private Limited");
				driver.findElement(By.id("company_twitter")).sendKeys("IBM INDIA Private Limited");
				
				driver.findElement(By.xpath("//input[@name='submit_job']")).click();
				
				driver.findElement(By.id("job_preview_submit_button")).click();
				driver.findElement(By.linkText("click here")).click();
				
				String ActualJob=driver.findElement(By.tagName("h1")).getText();
				
				Assert.assertEquals(ActualJob, ExpectedJob);
				
				driver.close();
			  
    
			 
			  
			 }	

}
