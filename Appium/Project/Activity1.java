package activities;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@BeforeClass
	public void setupMobile() throws InterruptedException, IOException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.apps.tasks");
		caps.setCapability("appActivity", ".ui.TaskListsActivity");
		caps.setCapability("noReset", "true");

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void addtask() {

		String[] tasktoadd = { "Complete Activity with Google Tasks", "Complete Activity with Google Keep",
				"Complete the second Activity Google Keep"

		};

		for (String addingtask : tasktoadd) {
			wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
			driver.findElementByAccessibilityId("Create new task").click();
			wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));
			driver.findElementById("add_task_title").sendKeys(addingtask);
			driver.findElementById("add_task_done").click();
		}

		wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("task_name"), 3));
		List<MobileElement> taskadded = driver.findElementsById("task_name");
		assertEquals(taskadded.size(), 3);
		assertEquals(taskadded.get(2).getText(), "Complete Activity with Google Tasks");

	}

	@AfterClass
	public void quit() {
		driver.quit();

	}
}