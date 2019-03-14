package chrom.util;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class DesiredCapabilitiesHelper {
	private DesiredCapabilities capabilities  = new DesiredCapabilities();
	public DesiredCapabilities fireFoxMobileCapabilities() {
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus5X");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"firefox");
		capabilities.setCapability("chromedriverExecutable", "C:\\Siva\\Selenium\\MobileUsingChrome\\Browserdrivers\\geckodriver.exe");
		capabilities.setCapability(MobileCapabilityType.HAS_TOUCHSCREEN, true);
		capabilities.setCapability("nativeWebScreenshot","true");
		capabilities.setCapability("androidScreenshotPath", "target/screenshots");
		return capabilities;
	}
	public DesiredCapabilities chromeMobileCapabilities() {
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus5X");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		capabilities.setCapability("chromedriverExecutable", "C:\\Siva\\Selenium\\MobileUsingChrome\\Browserdrivers\\chromedriver.exe");
		capabilities.setCapability(MobileCapabilityType.HAS_TOUCHSCREEN, true);
		capabilities.setCapability("nativeWebScreenshot","true");
		capabilities.setCapability("androidScreenshotPath", "target/screenshots");
		return capabilities;
	}
	public DesiredCapabilities internetExplorerMobileCapabilities() {
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus5X");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		capabilities.setCapability("chromedriverExecutable", "C:\\Siva\\Selenium\\MobileUsingChrome\\Browserdrivers\\IEDriverServer.exe");
		capabilities.setCapability(MobileCapabilityType.HAS_TOUCHSCREEN, true);
		capabilities.setCapability("nativeWebScreenshot","true");
		capabilities.setCapability("androidScreenshotPath", "target/screenshots");
		return capabilities;
	}
	public DesiredCapabilities fireFoxCapabilities() {
		capabilities.setCapability("browserName", "firefox");
		capabilities.setCapability("marionette", true);
		capabilities.setCapability("maxInstances", 5);
		capabilities.setCapability("seleniumProtocol", "WebDriver");
		return capabilities;
	}
	public DesiredCapabilities chromeCapabilities() {
		
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("platform", "WIN10");
		capabilities.setCapability("maxInstances", 5);
		capabilities.setCapability("seleniumProtocol", "WebDriver");
		return capabilities;
	}
	public DesiredCapabilities internetExplorerCapabilities() {
		capabilities.setCapability("browserName", "firefox");
		capabilities.setCapability("platform", "WINDOWS");
		capabilities.setCapability("maxInstances", 1);
		capabilities.setCapability("seleniumProtocol", "WebDriver");
		return capabilities;
	}
	public DesiredCapabilities safariCapabilities() {
		capabilities.setCapability("browserName", "safari");
		capabilities.setCapability("technologyPreview", false);
		capabilities.setCapability("platform", "MAC");
		capabilities.setCapability("maxInstances", 1);
		capabilities.setCapability("seleniumProtocol", "WebDriver");
		return capabilities;
	}
	public DesiredCapabilities createDesiredCapability (String browserName, String environment) {
		if(browserName.equalsIgnoreCase("firefox") && environment.equalsIgnoreCase("mobile")) {
			capabilities = this.fireFoxMobileCapabilities();
		}else if (browserName.equalsIgnoreCase("chrome") && environment.equalsIgnoreCase("mobile")) {
			capabilities = this.chromeMobileCapabilities();
		}else if (browserName.equalsIgnoreCase("internetExplorer") && environment.equalsIgnoreCase("mobile")) {
			capabilities = this.internetExplorerMobileCapabilities();
		}else if (browserName.equalsIgnoreCase("firefox")&& environment.equalsIgnoreCase("desktop")) {
			capabilities = this.fireFoxCapabilities();
		}else if (browserName.equalsIgnoreCase("internetExplorer") && environment.equalsIgnoreCase("desktop")) {
			capabilities = this.internetExplorerCapabilities();
		}else if (browserName.equalsIgnoreCase("safari") && environment.equalsIgnoreCase("desktop")) {
			capabilities = this.safariCapabilities();
		} else {
			capabilities = this.chromeCapabilities();
		}
		
		return capabilities;
	}

}
