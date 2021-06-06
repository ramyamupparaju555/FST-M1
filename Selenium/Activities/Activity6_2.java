package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
	public static void main(String[] args) {

        //Create a new instance of the Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
    	  WebDriverWait wait = new WebDriverWait(driver, 10);
        
        driver.get("https://www.training-support.net/selenium/ajax");
        
        System.out.println("The title of the page is : "+ driver.getTitle());
        		
      
        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
 
      
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
 
     
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);
        
       
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);
 
      
        driver.close();
        
	
	}

}
