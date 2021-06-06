package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {
	
	public static void main(String[] args) {

        //Create a new instance of the Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver(); 
        
        driver.get("https://www.training-support.net/selenium/selects");
        
        System.out.println("The title of the page is : "+ driver.getTitle());
        WebElement selectvalue=driver.findElement(By.id("single-select"));
        
        Select dropdown=new Select(driver.findElement(By.id("single-select")));
        
        dropdown.selectByVisibleText("Option 2");
        System.out.println("Second dropdown value is : "+selectvalue.getText());
        
        dropdown.selectByIndex(3);
        System.out.println("The third value is dropdown is : "+selectvalue.getText());
        
        dropdown.selectByValue("4");
        System.out.println("The fourth value in drop down is : "+selectvalue.getText());
        
        List<WebElement> ValuesinDropdown=dropdown.getOptions();
        for(WebElement values :ValuesinDropdown) {
        	System.out.println("All the optionsin the dropdown are : "+values.getText());
        }
        driver.close();
        
	}

}
