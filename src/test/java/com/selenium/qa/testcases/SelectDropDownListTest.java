package com.selenium.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.SelectDropDownList;

public class SelectDropDownListTest extends TestBase{
	HomePage hp;
	SelectDropDownList sddl;
	public SelectDropDownListTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp = new HomePage();
		hp.clickonbasiclink();
		hp.clickselectdropdownlist();
		sddl = new SelectDropDownList();
		
		
	}
	@Test
	public void selectyourday()
	{
		sddl.selectYourDay();
	}
	
	  @Test 
	  public void selectyourcity() 
	  { 
		  sddl.selectYourCity();
	  
	  }
	 
	
	  @AfterMethod public void tearDown() { driver.quit(); }
	 
}
