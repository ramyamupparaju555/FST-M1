package activities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class Activity6 {

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
	public void popups() throws InterruptedException {

		driver.get("https://www.training-support.net/selenium");
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));

		driver.findElement(MobileBy.AndroidUIAutomator(
				"UiScrollable(UiSelector().scrollable(true)).flingForward().scrollIntoView(textContains(\"Popups\"))"))
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath(
				"//android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.widget.Button")
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"//android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]")
				.sendKeys("admin");
		driver.findElementByXPath(
				"//android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]")
				.sendKeys("password");
		driver.findElementByXPath("//android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
				.click();

		WebElement msg = driver.findElement(By.xpath("//*[@text='Welcome Back, admin']"));
		System.out.println(msg.getText());
		Assert.assertEquals(msg.getText(), "Welcome Back, admin");
	}

	@Test(priority = 2)
	public void FormClear() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath(
				"//android.webkit.WebView/android.view.View[1]/android.view.View[5]/android.widget.Button").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath(
				"//android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]").clear();
		driver.findElementByXPath(
				"//android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]").clear();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 3)
	public void InvalidSignup() {

		driver.findElementByXPath(
				"//android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]")
				.sendKeys("admin");
		driver.findElementByXPath(
				"//android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]")
				.sendKeys("passwrd");
		driver.findElementByXPath("//android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
				.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement message = driver.findElement(By.xpath("//*[@text='Invalid Credentials']"));
		System.out.println(message.getText());
		Assert.assertEquals(message.getText(), "Invalid Credentials");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}
}