package com.simplilearn;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppiumDriverManager {
	
	private AndroidDriver driver;
	
	
	public AndroidDriver setUpDesiredCapabilities() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("appium:platformName", Configuration.getProperty("platformName"));
	    desiredCapabilities.setCapability("appium:platformVersion", Configuration.getProperty("platformVersion"));
	    desiredCapabilities.setCapability("appium:deviceName", Configuration.getProperty("deviceName"));
	    desiredCapabilities.setCapability("appium:appPackage", Configuration.getProperty("appPackage"));
	    desiredCapabilities.setCapability("appium:appActivity", Configuration.getProperty("appActivity"));
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 0);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
	    

	    //url for appium server
	    URL remoteUrl = new URL(Configuration.getProperty("URL"));

	    //initiate driver
	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    
	    return driver;
	    
	  }

}
