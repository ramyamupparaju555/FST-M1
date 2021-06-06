package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_1 {
	public static void main(String[] args) {

        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.training-support.net");
        
        System.out.println("The title of the page is :"+ driver.getTitle());
        
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
      
        System.out.println("The title of the Next loaded page is :"+ driver.getTitle());
        driver.close();
  
        
        
	}

}
