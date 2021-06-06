package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity6 {
	
	 public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
		    
			  WebDriver driver = new ChromeDriver();
			   
			  driver.get("https://alchemy.hguy.co/jobs");

			  driver.manage().window().maximize();
			  
			  driver.findElement(By.linkText("Jobs")).click();
			  
        driver.findElement(By.id("search_keywords")).sendKeys("Banking402");
        
        driver.findElement(By.className("search_submit")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.className("position")).click();
        
        Thread.sleep(3000);
        
        WebElement element = driver.findElement(By.xpath("//input[contains(@class, 'button')]"));
        
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        
        Thread.sleep(5000);
        
		
		  String email=driver.findElement(By.className("job_application_email")).getText();
		  
		  System.out.println("The email id present is : "+email);
		  
		  
		  
		  
		  driver.close();
		 
			 
			  
			 }	

}
