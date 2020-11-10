package com.selenium.qa.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.WindowPopupModel;

public class WindowPopupModelTest extends TestBase {
	HomePage hp;
	WindowPopupModel wmd;
	public WindowPopupModelTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp = new HomePage();
		hp.clickonbasiclink();
		hp.clickonwindowpopupmodel();
		wmd = new WindowPopupModel();
		
	}
	@Test(priority=1)
	public void handlemultiplewindows1() throws InterruptedException
	{
		wmd.clickonTwitter();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentid = it.next();
		System.out.println("parent window id:"+parentid);
		String childid = it.next();
		System.out.println("child window id:"+childid);
	    driver.switchTo().window(childid);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='No, thanks']")).click();
	    String title = driver.getTitle();
	    System.out.println("the title of the page is ="+title);
	    Assert.assertEquals(title,"Selenium Easy (@seleniumeasy) / Twitter");
	    driver.close();
	    
	}
	@Test(priority=2)
	public void handlemultiplewindows2() throws InterruptedException
	{
		wmd.clicklikeusonfb();
		Set<String> handler1 = driver.getWindowHandles();
		Iterator<String> it = handler1.iterator();
		String parentid = it.next();
		System.out.println("parent window id:"+parentid);
		String childid = it.next();
		System.out.println("child window id:"+childid);
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email' and @class='inputtext login_form_input_box']")).sendKeys("prakharsinghwal38@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass' and @class='inputtext login_form_input_box']")).sendKeys("skynet00007");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test(priority=3)
	public void hanlesmultiplewindows3() throws InterruptedException
	{
		wmd.clickonfollowtwitterandfacebook();
		Set<String> handler2 = driver.getWindowHandles();
		Iterator<String> it = handler2.iterator();
		String parentid = it.next();
		System.out.println("parent window id:"+parentid);
		String childid = it.next();
		System.out.println(" first child window id:"+childid);
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
		driver.close();
		String childid1 = it.next();
		System.out.println("second child window id is:"+childid1);
		driver.switchTo().window(childid1);
		driver.manage().window().maximize();
		driver.close();
		Thread.sleep(2000);
	}
	
	
	
	  @AfterMethod public void tearDown() { driver.quit();
	  
	  }
	 
	 

}
