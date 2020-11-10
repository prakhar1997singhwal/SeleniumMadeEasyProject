package com.selenium.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.TableSortAndSearch;

public class TableSortAndSearchTest extends TestBase{
	HomePage hp;
	TableSortAndSearch tsast;
	public TableSortAndSearchTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hp = new HomePage();
		hp.clickonAdvancedlink();
		hp.clickontable_sort_and_search();
		tsast = new TableSortAndSearch();
		
	}
	@Test
	public void validatetheentry()
	{
		tsast.selectnoofenteriesandselectedsearch();
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='example']//th"));
		System.out.println(list.size());
		String beforexpath = "//table[@id='example']/tbody/tr[";
		String afterxpath = "]/td[1]";
		
		for(int i=1;i<=list.size();i++)
		{
			String actualxpath = beforexpath+i+afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println("The name of the customer is :"+element.getText());
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
