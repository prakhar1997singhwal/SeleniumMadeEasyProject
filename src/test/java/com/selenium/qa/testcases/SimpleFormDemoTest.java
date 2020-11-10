package com.selenium.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.SimpleFormDemo;

public class SimpleFormDemoTest extends TestBase {
	HomePage hp;
	SimpleFormDemo sfd;
	
	public SimpleFormDemoTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		hp = new HomePage();
		hp.clickonbasiclink();
		sfd = hp.clickonSimpleFormDemoLink();
		sfd = new SimpleFormDemo();
		
		
	}
	@Test(priority=1)
	public void validatemessage()
	{
		sfd.enterthemessage();
		sfd.showmessage();
		String message = driver.findElement(By.xpath("//span[@id='display']")).getText();
		Assert.assertEquals(message, prop.getProperty("message"));
	}
	@Test(priority=2)
	public void validateTotal()
	{
		sfd.enterthevalueofa();
		sfd.enter_the_value_of_b();
		sfd.get_Total();
		String total = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
		Assert.assertEquals(total,String.valueOf(Integer.parseInt(prop.getProperty("a"))+Integer.parseInt(prop.getProperty("b"))));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
