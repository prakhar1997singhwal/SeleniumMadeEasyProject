package com.selenium.qa.util;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.util.ExcelReader;

public class TestUtil extends TestBase {
	static ExcelReader reader;
	public static ArrayList<Object[]> getdatafromexcel()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try
		{
			reader = new ExcelReader("C:\\Users\\KIIT\\eclipse-workspace\\SeleniumMadeEasy\\src\\main\\java\\com\\selenium\\qa\\testdata\\SeleniumMadeEasyTestdata.xlsx");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int rowCnt =2;rowCnt<=reader.getRowCount("inputvalidationsdata");rowCnt++)
		{
			String firstname = reader.getCellData("inputvalidationsdata", "FirstName" , rowCnt);
			String lastname = reader.getCellData("inputvalidationsdata", "LastName", rowCnt);
			String email = reader.getCellData("inputvalidationsdata", "E-Mail", rowCnt);
			String phone= reader.getCellData("inputvalidationsdata", "Phone", rowCnt);
			String address= reader.getCellData("inputvalidationsdata", "Address", rowCnt);
			String city= reader.getCellData("inputvalidationsdata", "City", rowCnt);
			String state= reader.getCellData("inputvalidationsdata", "State", rowCnt);
			String zipcode= reader.getCellData("inputvalidationsdata", "ZipCode", rowCnt);
			String website= reader.getCellData("inputvalidationsdata", "Website", rowCnt);
			Object obj[] = {firstname,lastname,email,phone,address,city,state,zipcode,website};
			mydata.add(obj);
		}
		return mydata;
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}

