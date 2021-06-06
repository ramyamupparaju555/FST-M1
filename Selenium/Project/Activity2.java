package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity2 {
	 public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
		    
			  WebDriver driver = new ChromeDriver();
			   
			  driver.get("https://alchemy.hguy.co/jobs");
			  
			  driver.manage().window().maximize();
			  
			  String ExpectedHeading="Welcome to Alchemy Jobs";
			  
			  System.out.println("Expected title: "+ExpectedHeading);
			  
			  String ActualHeading = driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Alchemy Jobs')]")).getText();
			  
			  System.out.println("Actual title: "+ActualHeading);
			  
			  
			Assert.assertEquals(ExpectedHeading,ActualHeading);
			
			driver.close();
			 
			  
			 }
}
