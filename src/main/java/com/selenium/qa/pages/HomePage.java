package com.selenium.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//a[text()='Selenium Easy']")
	WebElement pagetxt;
	@FindBy(xpath="//a[@id='basic_example']//i")
	WebElement basic_icon;
	@FindBy(xpath="//div[@class='tab-pane fade active in']//a[text()='Simple Form Demo']")
	WebElement Simple_form_demo_link;
	@FindBy(xpath="//div[@class='tab-pane fade active in']//a[text()='Check Box Demo']")
	WebElement check_box_demo_link;
	@FindBy(xpath="//div[@class='tab-pane fade active in']//a[text()='Select Dropdown List']")
	WebElement selectdropdownlistlink;
	@FindBy(xpath="//div[@class='tab-pane fade active in']//a[text()='Javascript Alerts']")
	WebElement java_script_alert_link;
	@FindBy(xpath="//div[@class='tab-pane fade active in']//a[text()='Window Popup Modal']")
	WebElement window_popup_model_link;
	@FindBy(xpath="//a[@id='inter_example']//i")
	WebElement intermediate_link;
	@FindBy(xpath="//div[@id='intermediate']//a[text()='Input Form with Validations']")
	WebElement input_form_with_validations;
	@FindBy(xpath="//div[@id='intermediate']//a[text()='Ajax Form Submit']")
	WebElement ajax_form_submit_page;
	@FindBy(xpath="//div[@id='intermediate']//a[text()='JQuery Select dropdown']")
	WebElement jquery_select_dropdown_link;
	@FindBy(xpath="//a[@id='advanced_example']//i")
	WebElement advanced_link;
	@FindBy(xpath="//div[@id='advanced']//a[text()='Table Sort & Search']")
	WebElement table_Sort_and_search;
	@FindBy(xpath="//div[@id='advanced']//a[text()='Drag and Drop']")
	WebElement drag_and_drop_link;
	@FindBy(xpath="//div[@id='intermediate']//a[text()='JQuery List Box']")
	WebElement jquerylistbox;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	//Actions
	public HomePage validate_Home_Page_Text()
	{
		String txt = pagetxt.getText();
		Assert.assertEquals(txt,"Selenium Easy");
		return this;
		
	}
	public HomePage clickonbasiclink()
	{
		basic_icon.click();
		return this;
	}
	public SimpleFormDemo clickonSimpleFormDemoLink()
	{
		Simple_form_demo_link.click();
		return new SimpleFormDemo();
	}
	public CheckBoxDemo clickOnCheckboxlink()
	{
		check_box_demo_link.click();
		return new CheckBoxDemo();
	}
	public SelectDropDownList clickselectdropdownlist()
	{
		selectdropdownlistlink.click();
		return new SelectDropDownList();
	}
	public JavaScriptAlerts clickonjavascriptalert()
	{
		java_script_alert_link.click();
		return new JavaScriptAlerts();
	}
	public WindowPopupModel clickonwindowpopupmodel()
	{
		window_popup_model_link.click();
		return new WindowPopupModel();
	}
	public HomePage clickonintermediatelink()
	{
		intermediate_link.click();
		return new HomePage();
	}
	public InputFormValidations clickoninputformwithvalidations()
	{
		input_form_with_validations.click();
		return new InputFormValidations();
	}
	public AjaxFormSubmit clickonajaxformsubmitlink()
	{
		ajax_form_submit_page.click();
		return new AjaxFormSubmit();
	}
	
	public HomePage clickonAdvancedlink()
	{
		advanced_link.click();
		return this;
	}
	public TableSortAndSearch clickontable_sort_and_search()
	{
		table_Sort_and_search.click();
		return new TableSortAndSearch();
	}
	public TableSortAndSearch clickontablesortandsearch()
	{
		table_Sort_and_search.click();
		return new TableSortAndSearch();
	}
	public DragandDrop clickondrag_and_drop_link()
	{
		drag_and_drop_link.click();
		return new DragandDrop();
	}
	public JqueryListDropdown clickpnjquerylistbox()
	{
		jquerylistbox.click();
		return new JqueryListDropdown();
	}
	
	

}
