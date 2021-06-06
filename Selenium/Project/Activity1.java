package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity1 {
	 public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
    
	  WebDriver driver = new ChromeDriver();
	   
	  driver.get("https://alchemy.hguy.co/jobs");
	  
	  String Expectedtitle="Alchemy Jobs – Job Board Application";
	  
	  System.out.println("Expected title: "+Expectedtitle);
	  
	  String Actualtitle = driver.getTitle();
	  
	  System.out.println("Expected title: "+Actualtitle);
	  
	  
	Assert.assertEquals(Expectedtitle,Actualtitle);
	
	driver.close();
	 
	  
	 }

}
