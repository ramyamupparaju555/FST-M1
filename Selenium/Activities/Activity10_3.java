package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {
	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAMUPPARAJU\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://training-support.net/selenium/drag-drop");

		System.out.println("The title of the page is : " + driver.getTitle());

		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));

		WebElement ball = driver.findElement(By.id("draggable"));

		WebElement zone1 = driver.findElement(By.id("droppable"));

		WebElement zone2 = driver.findElement(By.id("dropzone2"));

		Actions dragAndDrop = new Actions(driver);
		dragAndDrop.dragAndDrop(ball, zone1).build().perform();

		wait.until(ExpectedConditions.attributeToBeNotEmpty(zone1, "background-color"));
		System.out.println("ENTERED DROPZONE 1");

		dragAndDrop.dragAndDrop(ball, zone2).build().perform();
		wait.until(ExpectedConditions.attributeToBeNotEmpty(zone2, "background-color"));
		System.out.println("ENTERED DROPZONE 2");

		// Close the browser
		driver.close();
	}

}
