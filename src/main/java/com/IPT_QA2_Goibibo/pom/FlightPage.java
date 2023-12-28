package com.IPT_QA2_Goibibo.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_QA2_Goibibo.base.BaseClass;



public class FlightPage extends BaseClass {
	public FlightPage (){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Enter Last Name']")
	private WebElement last_Name;

}
