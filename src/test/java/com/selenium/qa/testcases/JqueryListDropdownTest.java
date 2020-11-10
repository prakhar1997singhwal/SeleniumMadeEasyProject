package com.selenium.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.JqueryListDropdown;

public class JqueryListDropdownTest extends TestBase {
	HomePage hp;
	JqueryListDropdown jldd;
	
	public  JqueryListDropdownTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp = new HomePage();
		hp.clickonintermediatelink();
		hp.clickpnjquerylistbox();
		jldd = new JqueryListDropdown();
		
	}
	@Test
	public void validatevaluessenetered()
	{
		jldd.selectvalues();
		int size = 4;
		int listsize = jldd.calculatingsizeofdropdown();
		if(size==listsize)
			System.out.println("Correct no of names");
		else
			System.out.println("Incorrect no of names");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
