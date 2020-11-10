package com.selenium.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.DragandDrop;
import com.selenium.qa.pages.HomePage;

public class DragandDropTest extends TestBase {
	HomePage hp;
	DragandDrop dad;
	
	public DragandDropTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp = new HomePage();
		hp.clickonAdvancedlink();
		hp.clickondrag_and_drop_link();
		dad = new DragandDrop();
		
		
		
	}
	@Test
	public void draganddroptest() throws InterruptedException
	{
		dad.draganddropelements();
		Thread.sleep(2000);
	}
	
	  @AfterMethod 
	  public void tearDown() 
	  { driver.quit();
	  
	  }
	 

}
