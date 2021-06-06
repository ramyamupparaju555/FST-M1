package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity7_1 {
	
	public static void main(String[] args) {

        //Create a new instance of the Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
    	 
        
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        
        System.out.println("The title of the page is : "+ driver.getTitle());
        
        driver.findElement(By.xpath("//input[contains(@class,'username')]")).sendKeys("admin");
        
        driver.findElement(By.xpath("//input[contains(@class,'password')]")).sendKeys("password");
        
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        		
      
      String LoginMessage =driver.findElement(By.id("action-confirmation")).getText();
      System.out.println("The login message is : " +LoginMessage);
      
        driver.close();
        
	
	}


}
