package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		Actions actions = new Actions(driver);

       
        driver.get("https://www.training-support.net/selenium/input-events");
       
        System.out.println("The title of the page is : " + driver.getTitle());
        
        WebElement obj = driver.findElement(By.id("wrapD3Cube"));

        
        actions.click(obj);
        WebElement ObjVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + ObjVal.getText());

        
        actions.doubleClick(obj).perform();
        ObjVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + ObjVal.getText());
        
             
        actions.contextClick(obj).perform();
        ObjVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + ObjVal.getText());

    
        driver.close();
	}

}
