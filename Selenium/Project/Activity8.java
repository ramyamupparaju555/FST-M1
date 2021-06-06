package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity8 {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("user_login")).sendKeys("root");
		  
		  
		  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		  
		  driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
		  	
		  String ExpectedTitle="Dashboard";
		  System.out.println("Expected Title : "+ExpectedTitle);
		  
		 String Title= driver.findElement(By.className("wp-menu-name")).getText();
		   System.out.println("Actual Title : "+Title);
		  Assert.assertEquals(ExpectedTitle, Title);
		  
		  
		  driver.close(); 
		  
		   

}
}