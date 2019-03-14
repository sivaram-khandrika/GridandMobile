package chrom;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Siva\\Selenium\\Selenium software\\Browserdrivers\\chromedriver.exe" );
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setPlatform(Platform.WIN10);
		//dc.setBrowserName("chrome");
		dc.setCapability("browserName", "chrome");
		//dc.setCapability("platform", "WIN10");
		//dc.setCapability("version", "65.0.1");
		//dc.setCapability(FirefoxDriver.BINARY, "C:\\Siva\\Selenium\\Selenium software\\Browserdrivers\\geckodriver.exe");
		
		WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.24.69:4445/wd/hub"),dc);
		//driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("https://in.yahoo.com/");
		System.out.println("Driver success");
	}

}
