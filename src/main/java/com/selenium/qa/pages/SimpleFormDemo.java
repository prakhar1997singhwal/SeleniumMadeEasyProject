package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.qa.base.TestBase;

public class SimpleFormDemo extends TestBase{
	
	@FindBy(xpath="//input[@id='user-message']")
	WebElement enter_message;
	@FindBy(xpath="//button[text()='Show Message']")
	WebElement show_message;
	@FindBy(xpath="//input[@id='sum1']")
	WebElement enter_value_of_a;
	@FindBy(xpath="//input[@id='sum2']")
	WebElement enter_value_of_b;
	@FindBy(xpath="//button[text()='Get Total']")
	WebElement get_total;
	public SimpleFormDemo()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public SimpleFormDemo enterthemessage()
	{
		enter_message.sendKeys(prop.getProperty("message"));
		return this;
	}
	public SimpleFormDemo showmessage()
	{
		show_message.click();
		return this;
	}
	public SimpleFormDemo enterthevalueofa()
	{
		enter_value_of_a.sendKeys(prop.getProperty("a"));
		return this;
	}
	public SimpleFormDemo enter_the_value_of_b()
	{
		enter_value_of_b.sendKeys(prop.getProperty("b"));
		return this;
	}
	public SimpleFormDemo get_Total()
	{
		get_total.click();
		return this;
	}
	

}
