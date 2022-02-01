package com.simplilearn.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.simplilearn.AppiumDriverManager;

public class ReplaceItemTest {

  private AndroidDriver driver;

  @Before	
 	public void setUp() throws MalformedURLException{
 		
 		driver = new AppiumDriverManager().setUpDesiredCapabilities();
 	}

  @Test
  public void replaceItemTest() {
	  MobileElement el1_primary_cta = (MobileElement) driver.findElementById("in.swiggy.android:id/tv_primary_cta");	  
	  
	  System.out.println(el1_primary_cta.getText());
	  
	  if(el1_primary_cta.getText().equals("LOGIN / SIGNUP")) {
		  
		  MobileElement el1_continueasguest = (MobileElement) driver.findElementById("in.swiggy.android:id/tv_secondary_cta");
		  el1_continueasguest.click();
		  
	  } else {
		  el1_primary_cta.click();
	  }
	  
	  

	    //added implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    MobileElement el2 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("android:id/button2");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("in.swiggy.android:id/location_description");
	    el4.sendKeys("rohini");
	    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget."
	    		+ "RecyclerView/android.widget.LinearLayout[1]");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementById("in.swiggy.android:id/google_place_search_title_text1");
	    el6.click();
	    
	  MobileElement el18 = (MobileElement) driver.findElementById("in.swiggy.android:id/bottom_bar_explore");
	    el18.click();
	    MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
	    el19.click();
	    el19.sendKeys("pizza");
//	    MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
//	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
//	    		+ "FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
//	    		+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
//	    		+ "FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
	    
	    MobileElement e20_pizza1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]");
	    
	    MobileElement e20_pizza2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]");
	    
	    if(e20_pizza1.getText().equals("Veg Pizza Mcpuff")) {
	    	e20_pizza1.click();
	    }else {
	    	e20_pizza2.click();
	    }
	    
	    
	    
	    MobileElement itemname = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
	    		+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view."
	    		+ "ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]");
	    
	    String actualresult_itemname = itemname.getText();
	    
	    System.out.println("Actual Result Item Name - " +actualresult_itemname);
	    
	    MobileElement el21 = (MobileElement) driver.findElementByXPath("(//android.widget.RelativeLayout[@content-desc=\"Add Item\"])[1]");
	    el21.click();
	    
	    MobileElement el6_checkbox = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
	    		+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
	    		+ "LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget."
	    		+ "RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox");
	    el6_checkbox.click();
	    
	    MobileElement el7_additem = (MobileElement) driver.findElementById("in.swiggy.android:id/add_item");
	    el7_additem.click();
	    
	    MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("go back");
	    el11.click();
	    MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
	    el12.click();
	    el12.sendKeys("burger");
	    MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
	    el13.click();
	    MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[1]");
	    el14.click();
	    MobileElement el15 = (MobileElement) driver.findElementById("in.swiggy.android:id/add_to_cart_item_add_text");
	    el15.click();
  
  MobileElement el8 = (MobileElement) driver.findElementById("in.swiggy.android:id/dialog_title");
  el8.click();
  
  Assert.assertTrue(el8.getText().contains("Replace cart item?"));
    
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}

