package seleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity11_1 {
	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");

		driver.findElement(By.cssSelector("button#simple")).click();

		Alert simpleAlert = driver.switchTo().alert();

		String alertText = simpleAlert.getText();
		System.out.println("Alert text is: " + alertText);

		simpleAlert.accept();

		driver.close();
	}

}
