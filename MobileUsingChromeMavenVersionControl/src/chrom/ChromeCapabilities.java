package chrom;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeCapabilities {

	public static void main(String[] args) throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Siva\\Selenium\\Selenium software\\Browserdrivers\\chromedriver.exe" );
		
		
      /*  The below code is for Setting desired capabilities of Chrome to execute script in Responsive design mode
       * Map<String, Object> deviceMetrics = new HashMap<>();

        deviceMetrics.put("width", 320);
        deviceMetrics.put("height", 568);
        deviceMetrics.put("pixelRatio", 2);
        deviceMetrics.put("zoom", "150%");
        deviceMetrics.put("deviceName", "iPhone 5/SE");
        
        Map<String, Object> mobileEmulation = new HashMap<>();

        mobileEmulation.put("deviceMetrics", deviceMetrics);
       
        mobileEmulation.put("userAgent", "Mozilla/5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53");

        Map<String, Object> chromeOptions = new HashMap<>();

        chromeOptions.put("mobileEmulation", mobileEmulation);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        
       
        WebDriver driver = new RemoteWebDriver(capabilities);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();*/
		
		/* The below code is set the Chrome capability*/
		DesiredCapabilities capabilities  = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus5X");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("platformName", "WIN10");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		//capabilities.setCapability("chromedriverExecutable", "C:\\Siva\\Selenium\\MobileUsingChrome\\Browserdrivers\\chromedriver.exe");
		capabilities.setCapability(MobileCapabilityType.HAS_TOUCHSCREEN, true);
		capabilities.setCapability("nativeWebScreenshot","true");
		capabilities.setCapability("androidScreenshotPath", "target/screenshots");
		//driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		WebDriver driver =  new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	
		driver.get("http://demo.guru99.com/test/newtours/");
		
		System.out.println("Driver success");
	}

}
