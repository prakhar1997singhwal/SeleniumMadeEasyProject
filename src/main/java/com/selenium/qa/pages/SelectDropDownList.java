package com.selenium.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.selenium.qa.base.TestBase;

public class SelectDropDownList extends TestBase {
	@FindBy(xpath="//select[@id='select-demo']")
	WebElement dropdown;
	@FindBy(xpath="//select[@id='multi-select']")
	WebElement multidropdown;
	@FindBy(xpath="//button[@id='printMe']")
	WebElement firstselecterdbutton;
	
	public SelectDropDownList()
	{
		PageFactory.initElements(driver, this);
	}
  //Actions
	public SelectDropDownList selectYourDay()
	{
		Select select = new Select(dropdown);
		select.selectByVisibleText(prop.getProperty("day"));
		return this;
	}
	public SelectDropDownList selectYourCity()
	{
		Select select = new Select(multidropdown);
		select.selectByVisibleText(prop.getProperty("city"));
		firstselecterdbutton.click();
		return this;
	}
	
	

}

