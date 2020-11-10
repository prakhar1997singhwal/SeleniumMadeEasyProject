package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.qa.base.TestBase;

public class AjaxFormSubmit extends TestBase{
	@FindBy(xpath="//input[@id='title']")
	WebElement title;
	@FindBy(xpath="//textarea[@id='description']")
	WebElement description;
	@FindBy(xpath="//input[@id='btn-submit']")
	WebElement button;
	public AjaxFormSubmit()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public AjaxFormSubmit entername()
	{
		title.sendKeys("Prakhar Singhwal");
		return this;
	}
	public AjaxFormSubmit entercomment()
	{
		description.sendKeys("This is my second testing project");
		return this;
	}
	public AjaxFormSubmit clickonthebutton()
	{
		button.click();
		return this;
	}
	

}
