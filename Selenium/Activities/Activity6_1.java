package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {
	public static void main(String[] args) {

        //Create a new instance of the Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
    	  WebDriverWait wait = new WebDriverWait(driver, 10);
        
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        
        System.out.println("The title of the page is : "+ driver.getTitle());
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement RemovchkButton= driver.findElement(By.id("toggleCheckbox"));
        
        RemovchkButton.click();
        
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        
        RemovchkButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        
        driver.close();
        
   
	}

}
