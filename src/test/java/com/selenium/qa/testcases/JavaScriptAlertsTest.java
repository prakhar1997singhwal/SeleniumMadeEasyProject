package com.selenium.qa.testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.JavaScriptAlerts;

public class JavaScriptAlertsTest extends TestBase{
	HomePage hp;
	JavaScriptAlerts jsa;
	
	public JavaScriptAlertsTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp = new HomePage();
		hp.clickonbasiclink();
		hp.clickonjavascriptalert();
		jsa = new JavaScriptAlerts();
	}
	@Test
	public void clickonfirstbutton()
	{
		jsa.clickonclickme();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		Assert.assertEquals(text,"I am an alert box!");
		alert.accept();
	}
	@Test
	public void clickonsecondbutton() throws InterruptedException
	{
		jsa.click_for_prompt_box();
		Alert alerts = driver.switchTo().alert();
		alerts.sendKeys("Prakhar Singhwal");
		alerts.accept();
		
	}
	
	 @AfterMethod 
	 public void tearDown() 
	 { 
		 driver.quit();
	 
	 } 
	 

}
