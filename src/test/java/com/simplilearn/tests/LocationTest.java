package com.simplilearn.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import com.simplilearn.AppiumDriverManager;

public class LocationTest{

  private AndroidDriver driver;

  @Before	
	public void setUp() throws MalformedURLException{
		
		driver = new AppiumDriverManager().setUpDesiredCapabilities();
	}

  @Test
  public void locationTest() {
	  MobileElement el1_primary_cta = (MobileElement) driver.findElementById("in.swiggy.android:id/tv_primary_cta");
	  	  
	  
	  System.out.println(el1_primary_cta.getText());
	  
	  if(el1_primary_cta.getText().equals("LOGIN / SIGNUP")) {
		  
		  MobileElement el1_continueasguest = (MobileElement) driver.findElementById("in.swiggy.android:id/tv_secondary_cta");
		  
		  el1_continueasguest.click();		  
	  }
	  else {
	    el1_primary_cta.click();
	  }

	    //added implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    MobileElement el2 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("android:id/button2");
	    el3.click();

	    MobileElement el26 = (MobileElement) driver.findElementById("in.swiggy.android:id/location_description");
	    el26.click();
	    el26.sendKeys("mountain view");
	    
	    MobileElement el27 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
	    		+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget"
	    		+ ".FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
	    
	    el27.click();
	    
	    MobileElement el28 = (MobileElement) driver.findElementById("in.swiggy.android:id/google_place_search_title_text1");
	    el28.click();
	    
	    MobileElement imageview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view."
	    		+ "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	    imageview.click();
	    System.out.println("Message in the Image - \"We are currently not delivering at this location at the moment. Please try again later.\"");
	    Assert.assertTrue(imageview.isDisplayed());
	    
  }

  @After
  public void tearDown() {
    driver.quit();
    
  }
}

