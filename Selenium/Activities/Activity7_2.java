package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7_2 {
	public static void main(String[] args) {

        //Create a new instance of the Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
    	 
        
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        
        System.out.println("The title of the page is : "+ driver.getTitle());

        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("admin");
        
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password");
        
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("Password");
        driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("vsga@gmail.com");
        
        
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
        
        String Message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + Message);
        driver.close();
	
	}
}
