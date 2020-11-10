package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.qa.base.TestBase;

public class InputFormValidations extends TestBase {
	
  @FindBy(xpath="//input[@name='first_name']")
  WebElement first_name;
  @FindBy(xpath="//input[@name='last_name']")
  WebElement last_name;
  @FindBy(xpath="//input[@name='email']")
  WebElement email;
  @FindBy(xpath="//input[@name='phone']")
  WebElement phoneno;
  @FindBy(xpath="//input[@name='address']")
  WebElement address;
  @FindBy(xpath="//input[@name='city']")
  WebElement city;
  @FindBy(xpath="//select[@name='state']")
  WebElement state;
  @FindBy(xpath="//input[@name='zip']")
  WebElement zipcode;
  @FindBy(xpath="//input[@name='website']")
  WebElement website;
  @FindBy(xpath="//div[@class='radio']//input[@value='yes']")
  WebElement button;
  @FindBy(xpath="//button[@type='submit']")
  WebElement sendbutton;
  public InputFormValidations()
  {
	  PageFactory.initElements(driver, this);
  }
  //Actions
  public void createnewcontact(String firstName,String lastName,String emailid,String Phone,String Address,String City,String State,String ZipCode,String Website)
  {
	  first_name.sendKeys(firstName);
	  last_name.sendKeys(lastName);
	  email.sendKeys(emailid);
	  phoneno.sendKeys(Phone);
	  address.sendKeys(Address);
	  city.sendKeys(City);
	  state.sendKeys(State);
	  zipcode.sendKeys(ZipCode);
	  website.sendKeys(Website);
	  button.click();
	  sendbutton.click();
	  
  }
  
}
