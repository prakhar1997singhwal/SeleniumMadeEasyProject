package com.selenium.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.selenium.qa.base.TestBase;

public class TableSortAndSearch extends TestBase {
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
	@FindBy(xpath="//select[@name='example_length']")
	WebElement enteries;
	@FindBy(xpath="//table[@id='example']//th")
	WebElement tablexpath;
	public TableSortAndSearch()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public TableSortAndSearch selectnoofenteriesandselectedsearch()
	{
	   Select select = new Select(enteries);
	   select.selectByVisibleText("10");
	  search.sendKeys("Edinburgh");
	   return this;
		
	}
}
