package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_3 {
	public static void main(String[] args) {

        //Create a new instance of the Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        
        System.out.println("The title of the page is : "+ driver.getTitle());
	
	WebElement textfield = driver.findElement(By.id("input-text"));
	
	System.out.println("The text fields is Enable : " +textfield.isEnabled());
	
	driver.findElement(By.id("toggleInput")).click();
	
	System.out.println("The text field is enabled : " +textfield.isEnabled());
	
	driver.close();
	
	
	
	}
}
