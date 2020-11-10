package com.selenium.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.CheckBoxDemo;
import com.selenium.qa.pages.HomePage;

public class CheckBoxDemoTest extends TestBase {
	HomePage hp;
	CheckBoxDemo cbd;
	
	public CheckBoxDemoTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp = new HomePage();
		hp.clickonbasiclink();
		hp.clickOnCheckboxlink();
		cbd = new CheckBoxDemo();
		
	}
	@Test
	public void clickoncheckbox()
	{
		cbd.clickonthischeckBox();
		String message = driver.findElement(By.xpath("//div[@id='txtAge']")).getText();
		Assert.assertEquals(message, prop.getProperty("message1"));
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
