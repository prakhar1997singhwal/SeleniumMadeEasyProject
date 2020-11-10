package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.qa.base.TestBase;

public class JavaScriptAlerts extends TestBase {
	
	@FindBy(xpath="//div[@class='panel-body']//button[text()='Click me!' and @class='btn btn-default']")
	WebElement clickme;
	@FindBy(xpath="//div[@class='panel-body']//button[text()='Click for Prompt Box']")
	WebElement clickonpromptbox;
	
	public JavaScriptAlerts()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonclickme()
	{
		clickme.click();
	}
	public void click_for_prompt_box()
	{
		clickonpromptbox.click();
	}

}
