package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2  {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.training-support.net");
        
        
        String title = driver.getTitle();
       
        System.out.println("Page title is: " + title);
        
        
        WebElement idLocator = driver.findElement(By.id("about-link"));
        
        System.out.println("link when we use id: " + idLocator.getText());
        
        
        WebElement classNameLocator = driver.findElement(By.className("green"));
        System.out.println("link when we use Class name: " + classNameLocator.getText());
        
        
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Link when we use CSS selector : " + cssLocator.getText());
        
        
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Link when we use Link Text: " + linkTextLocator.getText());
        
           driver.close();
    }
}