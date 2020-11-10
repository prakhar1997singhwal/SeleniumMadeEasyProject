package com.selenium.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.selenium.qa.base.TestBase;

public class JqueryListDropdown extends TestBase {
	@FindBy(xpath="//select[@class='form-control pickListSelect pickData']")
	WebElement dropdown;
	@FindBy(xpath="//button[text()='Add']")
	WebElement addbutton;
	@FindBy(xpath="//select[@class='form-control pickListSelect pickListResult']")
	WebElement oppositedropdown;
	
	public JqueryListDropdown()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public void selectvalues()
	{
		Select select = new Select(dropdown);
		select.selectByVisibleText(prop.getProperty("name1"));
		Select select1 = new Select(dropdown);
		select1.selectByVisibleText(prop.getProperty("name2"));
		Select select2 = new Select(dropdown);
		select2.selectByVisibleText(prop.getProperty("name3"));
		Select select3 = new Select(dropdown);
		select3.selectByVisibleText(prop.getProperty("name4"));
		addbutton.click();
	}
	public int calculatingsizeofdropdown()
	{
		List<WebElement> list = driver.findElements(By.xpath("//select[@class='form-control pickListSelect pickListResult']//option"));
		return list.size();
		
	}

}
