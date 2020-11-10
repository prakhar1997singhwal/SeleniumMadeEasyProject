package com.selenium.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.CheckBoxDemo;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.JavaScriptAlerts;
import com.selenium.qa.pages.SimpleFormDemo;

public class HomePageTest extends TestBase {
	HomePage hp;
	SimpleFormDemo sfd;
	CheckBoxDemo cbd;
	JavaScriptAlerts jsa;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		hp = new HomePage();
	}
	@Test(priority=1)
	public void clickonsimpleformdemo()
	{
		hp.clickonbasiclink();
		sfd = hp.clickonSimpleFormDemoLink();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium Easy Demo - Simple Form to Automate using Selenium");
		
	}
	@Test(priority=2)
	public void clickOnCheckboxdemolink()
	{
		hp.clickonbasiclink();
		cbd = hp.clickOnCheckboxlink();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium Easy - Checkbox demo for automation using selenium");
		
	}
	@Test(priority=3)
	public void clickonjavascriptalertlink()
	{
		hp.clickonbasiclink();
		jsa = hp.clickonjavascriptalert();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium Easy Demo - Automate All Scenarios");
		
	}
	@Test(priority = 4)
	public void clickonwindowpopupmodellink()
	{
		hp.clickonbasiclink();
		hp.clickonwindowpopupmodel();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium Easy - Window Popup Modal Demo");
	}
	@Test(priority = 5)
	public void clickoninputformwithvalidationslink()
	{
		hp.clickonintermediatelink();
		hp.clickoninputformwithvalidations();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium Easy - Input Form Demo with Validations");
	}
	@Test(priority = 6)
	public void clickondrag_and_drop_linklink()
	{
		hp.clickonAdvancedlink();
		hp.clickondrag_and_drop_link();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Selenium Easy Demo - Drag and Drop Demo");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
