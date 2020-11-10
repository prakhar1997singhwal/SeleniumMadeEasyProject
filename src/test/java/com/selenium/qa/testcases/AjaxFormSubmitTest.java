package com.selenium.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.AjaxFormSubmit;
import com.selenium.qa.pages.HomePage;

public class AjaxFormSubmitTest extends TestBase {
	HomePage hp;
	AjaxFormSubmit afst;
	
	public AjaxFormSubmitTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp = new HomePage();
	    hp.clickonintermediatelink();
	    hp.clickonajaxformsubmitlink();
	    afst = new AjaxFormSubmit();
	    
	    
	}
	@Test(priority=1)
	public void enterthenametest()
	{
		afst.entername();
		afst.entercomment();
		afst.clickonthebutton();
	    String text = driver.findElement(By.xpath("//div[text()='Form submited Successfully!']")).getText();
		Assert.assertEquals(text,"Form submited Successfully!");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
