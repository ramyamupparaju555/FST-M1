package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_1 {
	public static void main(String[] args) {

        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        
        System.out.println("The title of the page is : "+ driver.getTitle());
        
        boolean checkbox=driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed();
        
        System.out.println("The check box is displaying : " +checkbox);
        
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("The check box is displaying : " + driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
        
        driver.close();
	}
}
