package com.selenium.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.InputFormValidations;
import com.selenium.qa.util.TestUtil;

public class InputFormValidationsTest extends TestBase{
	HomePage hp;
	InputFormValidations ifv;

	 public InputFormValidationsTest()
	 {
		 super();
	 }
	 @BeforeMethod
	 public void setUp()
	 {
		 initialization();
		 hp = new HomePage();
		 hp.clickonintermediatelink();
		 hp.clickoninputformwithvalidations();
		 ifv = new InputFormValidations();
		 
	 }
	 @DataProvider
	 public Iterator<Object[]>  getinputtestdata()
	 {
		 ArrayList<Object[]> data = TestUtil.getdatafromexcel();
		 return data.iterator();
	 }
	 @Test(dataProvider = "getinputtestdata")
	 public void validatecreatyenewcontact(String firstName,String lastName,String email,String Phone,String Address,String City,String State,String ZipCode,String Website)
	 {
		 ifv.createnewcontact(firstName,lastName,email,Phone,Address,City,State,ZipCode,Website);
	 }
	 @AfterMethod
	 public void tearDown()
	 {
		 driver.quit();
	 }
}
