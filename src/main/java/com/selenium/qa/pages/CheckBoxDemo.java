package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.qa.base.TestBase;

public class CheckBoxDemo extends TestBase {
	
	@FindBy(xpath="//input[@id='isAgeSelected']")
	WebElement checkbox;
	
	public CheckBoxDemo()
	{
		PageFactory.initElements(driver, this);
	}
	public CheckBoxDemo clickonthischeckBox()
	{
		checkbox.click();
		return this;
	}

}
