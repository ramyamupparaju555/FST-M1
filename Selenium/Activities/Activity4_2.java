package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_2 {
	public static void main(String[] args) {

        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.training-support.net/selenium/simple-form");
        
        System.out.println("The title of the page is :"+ driver.getTitle());
        
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ramya");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Mupparaju");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramaya@in.ibm.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567890");
      
        driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
       
  
        
        
	}


}
