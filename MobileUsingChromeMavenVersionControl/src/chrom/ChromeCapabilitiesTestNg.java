package chrom;

import chrom.util.DesiredCapabilitiesHelper;
import java.net.MalformedURLException;
import java.net.URL;
/*import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;*/
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeCapabilitiesTestNg {
	static WebDriver driver;
	DesiredCapabilitiesHelper capabilities = new DesiredCapabilitiesHelper();
	@BeforeMethod
	@Parameters({"browserName","environment"})
	public void initDriver(String browserName, String environment)throws MalformedURLException  {
		//driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver =  new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities.createDesiredCapability(browserName, environment));
		driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	@Test
	public static void main() {
		System.out.println("Driver success");
	}
	
	@AfterMethod
	public void teadDown() {
		System.out.println("ChromeCapabilitiesTestNg Test is done" );
		driver.close();
	}

}
