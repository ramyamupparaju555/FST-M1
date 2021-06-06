package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8_2 {
	public static void main(String[] args) {

        //Create a new instance of the Chrome driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
    	  WebDriver driver = new ChromeDriver(); 
        
        driver.get("https://www.training-support.net/selenium/tables");
        
        System.out.println("The title of the page is : "+ driver.getTitle());
        
        List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td[1]"));
        
        List<WebElement> Clomns=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td[1]"));
        
        System.out.println("The nummber of rows are " +Rows.size());
        
        System.out.println("The numer of columns are : "+Clomns.size());
	
       String Row2Col2=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
       
       System.out.println("The cell value of second row and second column is :"+Row2Col2);
       
       driver.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[1]")).click();
       
       String Row2Col2_new=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
       
       System.out.println("The cell value of second row second column after sorting is "+Row2Col2_new);
       
       WebElement footervalues=driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
       
       System.out.println("footer values are : "+footervalues.getText());
       
       driver.close();
       
	}

}
