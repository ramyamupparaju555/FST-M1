package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
		  WebDriver driver = new ChromeDriver();
		   
		  driver.get("https://alchemy.hguy.co/jobs");
		  
		  driver.manage().window().maximize();
		  
		WebElement i= driver.findElement(By.tagName("img"));
		  
		  System.out.println("The URL of image is "+i.getAttribute("src"));
		  
		driver.close();
		 
		  
		 }
}
