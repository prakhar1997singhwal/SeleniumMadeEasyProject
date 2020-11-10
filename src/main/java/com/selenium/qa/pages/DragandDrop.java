package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.qa.base.TestBase;

public class DragandDrop extends TestBase {
	@FindBy(xpath="//span[text()='Draggable 1']")
	WebElement draggable1;
	@FindBy(xpath="//span[text()='Draggable 2']")
	WebElement draggable2;
	@FindBy(xpath="//span[text()='Draggable 3']")
	WebElement draggable3;
	@FindBy(xpath="//span[text()='Draggable 4']")
	WebElement draggable4;
	@FindBy(xpath="//div[@id='mydropzone']")
	WebElement drop;
	public DragandDrop()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public DragandDrop draganddropelements()
	{
		Actions action = new Actions(driver);
		action.clickAndHold(draggable1).moveToElement(drop).release().build().perform();
		Actions action1 = new Actions(driver);
		action1.clickAndHold(draggable2).moveToElement(drop).release().build().perform();
		Actions action2 = new Actions(driver);
		action2.clickAndHold(draggable3).moveToElement(drop).release().build().perform();
		Actions action3 = new Actions(driver);
		action3.clickAndHold(draggable4).moveToElement(drop).release().build().perform();
		return this;
		
	}
	
	
	

}
