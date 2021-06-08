package activities;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@BeforeClass
	public void setupMobile() throws InterruptedException, IOException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", "true");

		// Instantiate Appium Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 10);

	}

	@Test
	public void To_do_list() throws InterruptedException {
		// Wait for Search text box to display
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Button")));

		driver.findElementByXPath("//android.widget.Button[contains(@text,'Get Started')]").click();

		Thread.sleep(4000);

		MobileElement ele = driver.findElementByXPath("//android.view.View[contains(@text,'To-Do List')]");

		Thread.sleep(3000);

		MobileElement toList = driver.findElement(MobileBy.AndroidUIAutomator(
				"UiScrollable(UiSelector()).getChildByText(UiSelector().className(\"android.view.View\"), \"To-Do List\")"));

		toList.click();

		wait.until(ExpectedConditions
				.presenceOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='To-Do List']")));

		String[] tasks = { "Add tasks to list", "Get number of tasks", "Clear the list" };

		for (int i = 0; i <= tasks.length; i++) {

			driver.findElementById("taskInput").sendKeys(tasks[i]);

			driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();

			Thread.sleep(3000);
		}

		List<MobileElement> list = driver.findElementsById("tasksList");
		int size = list.size();

		System.out.println("The count of tasks are : " + size);

		for (int j = 1; j <= size; j++) {
			driver.findElementByXPath("//android.view.View[@id='tasksList']//android.view.View[" + j + "]").click();
		}

		driver.findElementByXPath("//android.view.View[@text='Clear List']").click();

		Assert.assertTrue(!(driver.findElementByXPath("(//android.view.View[@id='tasksList']//android.view.View)[1]")
				.isDisplayed()));
	}

	@AfterClass
	public void afterClass() {
		// Close the browser.
		driver.quit();
	}

}
