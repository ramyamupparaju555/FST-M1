package seleniumActivities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity1 {

    public static void main(String[] args) {
  
  System.
  setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");
	    
  WebDriver driver = new ChromeDriver();
	//Open the browser
	driver.get("https://www.training-support.net");
		
	//Close the browser
	driver.close();
    }

}


