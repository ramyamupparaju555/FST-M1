package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
	public static void main(String[] args) {

        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://training-support.net/selenium/simple-form");
        
        System.out.println("The title of the page is :"+ driver.getTitle());
        
        driver.findElement(By.id("firstName")).sendKeys("Ramya");
        driver.findElement(By.id("lastName")).sendKeys("Mupparaju");
        driver.findElement(By.id("email")).sendKeys("ramya@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9502997340");
        driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
        
        driver.close();
  
        
        
	}
}
