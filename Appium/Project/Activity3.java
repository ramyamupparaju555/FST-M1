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

public class Activity3 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@BeforeClass
	public void setupMobile() throws InterruptedException, IOException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.keep");
		caps.setCapability("appActivity", "com.google.android.apps.keep.ui.activities.BrowseActivity");
		caps.setCapability("noReset", "true");

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void addNote() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));
		driver.findElementByAccessibilityId("New text note").click();

		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("editable_title")));
		driver.findElementById("editable_title").sendKeys("Add the Reminder");

		driver.findElementById("edit_note_text").sendKeys("Take your Medicine");
		Thread.sleep(3000);
		driver.findElementById("menu_reminder").click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("bs_list_view")));
		driver.findElementByClassName("android.view.ViewGroup").click();

		driver.findElementByAccessibilityId("Navigate up").click();

		wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.id("index_note_text_description"), 2));
		List<MobileElement> reminder_note_name = driver.findElementsById("index_note_text_description");
		assertEquals(reminder_note_name.get(0).getText(), "Take your Medicine");

	}

	@AfterClass
	public void close() {
		driver.quit();
	}
}
