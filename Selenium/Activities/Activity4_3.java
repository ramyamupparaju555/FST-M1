package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_3 {
	public static void main(String[] args) {

        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.training-support.net/selenium/target-practice");
        
        System.out.println("The title of the page is : "+ driver.getTitle());
        
      String ThridHeader=  driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        
      System.out.println("The text for the element is : "+ThridHeader);
   
      String Fifttheadercolor=driver.findElement(By.tagName("h5")).getCssValue("color");
      
      System.out.println("Fifth header color :"+Fifttheadercolor);
      String violet=driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class");
      
      System.out.println("The violet button attributes : "+violet);
      
      String greyButton=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
      
      System.out.println("The text for the grey button is : "+greyButton);
       
  
        
        
	}


}
