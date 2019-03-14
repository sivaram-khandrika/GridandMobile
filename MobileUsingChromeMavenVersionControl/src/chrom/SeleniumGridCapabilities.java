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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridCapabilities {
	static WebDriver driver;
	DesiredCapabilitiesHelper capabilities = new DesiredCapabilitiesHelper();
	@BeforeMethod
	@Parameters({"browserName","environment"})
	public void initDriver(String browserName, String environment)throws MalformedURLException  {
		//driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver = new RemoteWebDriver(new URL(" http://192.168.24.69:4445/wd/hub"),capabilities.createDesiredCapability(browserName, environment));
		driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	@Test
	public static void main() {
		System.out.println("Driver success");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		
		  driver.findElement(By.name("firstName")).sendKeys("Siva Ram");
		  driver.findElement(By.name("lastName")).sendKeys("Khandrika");
		  driver.findElement(By.name("phone")).sendKeys("9000122600");
		 driver.findElement(By.name("userName")).sendKeys("k_sivaram@rediffmail.com");
		 driver.findElement(By.name("address1")).sendKeys("nizampet");
		 driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telangana");
	}
	@AfterMethod
	public void teadDown() {
		System.out.println("SeleniumGridCapabilities Test is done" );
		driver.close();
	}

}
