package appium1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class openchrome {
	DesiredCapabilities caps =new DesiredCapabilities();
	
	@BeforeTest
	public void beforetest() throws MalformedURLException {
		
	
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");// طريقه جديده يفضل استخدامها 
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "doaa");
		caps.setCapability("chromdriverExecutable", "C:\\Users\\User\\Desktop\\chromewebdriver\\chromedriver.exe");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		//caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());// for application
	
		
		}
	
	

	@Test()
	public void testAppium2() throws MalformedURLException {
		AndroidDriver driver=new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),caps);
	driver.get("https://www.google.com");
	
	
		
		}
		
	
	
	
	
	
	

}
