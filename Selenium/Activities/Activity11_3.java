package seleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");

		System.out.println("The page title is :: " + driver.getTitle());

		driver.findElement(By.cssSelector("button#prompt")).click();

		Alert promptAlert = driver.switchTo().alert();

		String alertText = promptAlert.getText();
		System.out.println("Alert text is: " + alertText);
		
		promptAlert.sendKeys("Yes, you are!");
		
		Thread.sleep(5000);

		promptAlert.accept();

		driver.close();

	}

}
