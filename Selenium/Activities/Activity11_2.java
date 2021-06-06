package seleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_2 {
	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");

		System.out.println("The title of the page is :" + driver.getTitle());

		driver.findElement(By.cssSelector("button#confirm")).click();

		Alert confirmAlert = driver.switchTo().alert();

		String alertText = confirmAlert.getText();
		System.out.println("Alert text is: " + alertText);

		confirmAlert.accept();

		// Close the Browser
		driver.close();

	}

}
