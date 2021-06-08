package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity5 {

	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait = null;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {

		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		// Initialize Appium Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);

		// Initialize WebDriverWait.
		wait = new WebDriverWait(driver, 30);

		// Open the URL in the Chrome browser.
		driver.get("https://www.training-support.net/selenium");
	}

	@Test
	public void verifySuccesslogin() {

		String expectedSuccessLoginText = "Welcome Back, admin";

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Button")));

		MobileElement loginForm = driver.findElement(MobileBy.AndroidUIAutomator(
				"UiScrollable(UiSelector()).getChildByText(UiSelector().className(\"android.view.View\"), \"Login Form\")"));

		loginForm.click();

		wait.until(
				ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[@text='Login Form']")));

		driver.findElementById("username").sendKeys("admin");

		driver.findElementById("password").sendKeys("password");

		driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("action-confirmation")));

		String actualSuccessLoginText = driver.findElementById("action-confirmation").getText();

		System.out.println("The actual welcome message is : " + actualSuccessLoginText);

		Assert.assertEquals(expectedSuccessLoginText, actualSuccessLoginText);

	}

	@Test
	public void verifyUnSuccessfullogin() {

		String expectedError = "Invalid Credentials";

		driver.findElementById("username").sendKeys("root");

		driver.findElementById("password").sendKeys("pin222");

		driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();

		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("action-confirmation")));

		String actualError = driver.findElementById("action-confirmation").getText();

		System.out.println("The actual error message is : " + actualError);

		Assert.assertEquals(expectedError, actualError);

	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
	}

}