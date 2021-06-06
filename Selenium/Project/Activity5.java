package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity5 {
	 public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
    
	  WebDriver driver = new ChromeDriver();
	   
	  driver.get("https://alchemy.hguy.co/jobs");

	  driver.manage().window().maximize();
	  
	  driver.findElement(By.linkText("Jobs")).click();
	  
	 String ExpectedTitle="Jobs";
	 System.out.println("Expected Page Title : "+ ExpectedTitle);
	String actualTitle=driver.findElement(By.xpath("//h1[contains(text(),'Jobs')]")).getText();
	
	System.out.println("Expected Page Title : "+ ExpectedTitle);
	
	Assert.assertEquals(ExpectedTitle, actualTitle);
	
	driver.close();
	 
	  
	 }

}
