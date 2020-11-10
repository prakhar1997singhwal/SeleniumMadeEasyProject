package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.qa.base.TestBase;

public class WindowPopupModel extends TestBase {
	@FindBy(xpath="//a[text()='  Follow On Twitter ']")
	WebElement followontwitter;
	@FindBy(xpath="//a[@title='Follow @seleniumeasy on Facebook']")
	WebElement likeusonfb;
	@FindBy(xpath="//a[text()='Follow Twitter & Facebook']")
	WebElement followtwitterfacebook;
	
	public WindowPopupModel()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public ChildWindowPopupTwitter clickonTwitter()
	{
		followontwitter.click();
		return new ChildWindowPopupTwitter();
		
	}
	public ChildWindowPopupfb clicklikeusonfb()
	{
		likeusonfb.click();
		return  new ChildWindowPopupfb();
	}
	public ChildWindowPopupfb clickonfollowtwitterandfacebook()
	{
		followtwitterfacebook.click();
		return new ChildWindowPopupfb();
		
	}

}
