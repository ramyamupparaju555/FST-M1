package seleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {
	public static void main(String[] args) {
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	        Actions act = new Actions(driver);
		
        driver.get("https://www.training-support.net/selenium/popups");
        
        
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
        
        
        act.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = button.getAttribute("data-tooltip");
        System.out.println("Tooltip text: " + tooltipText);
        
       
        button.click();
        
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        
        
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
       
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
        
        //Close browser
        driver.close();
	
	}

}
