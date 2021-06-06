package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity4 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
		  WebDriver driver = new ChromeDriver();
		   
		  driver.get("https://alchemy.hguy.co/jobs");
		  
		  driver.manage().window().maximize();
		  
		  String ExpectedHeading="Quia quis non";
		  System.out.println("Expected Heading : "+ ExpectedHeading);
		  
		  String ActualHeading= driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]")).getText();
		
		  
		  System.out.println("Actual Heading is: "+ActualHeading);
		  
		  Assert.assertEquals(ExpectedHeading, ActualHeading);
		  
		driver.close();
		 
		  
		 }
}


