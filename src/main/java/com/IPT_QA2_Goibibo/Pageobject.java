package com.IPT_QA2_Goibibo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_QA2_Goibibo.base.BaseClass;
import com.IPT_QA2_Goibibo.base.TestBase;

public class Pageobject extends TestBase{
	
	
	public Pageobject()
	{
	
		PageFactory.initElements(driver, this);
		
	
	}
		
	@FindBy(xpath = "(//a[text()='View plan details & policies'])[1]" )
	private WebElement viewplandploices;
	public WebElement getviewplandploices() {
		return viewplandploices;
	}
	
	@FindBy(xpath  ="(//*[name()='svg'][@class='HappyCloseIcon-sc-nbfb2j-0 bmjMDO'])[1]")
	private WebElement close;
	public WebElement getclose() {
		return  close;
}
	
	@FindBy(xpath="(//button[@data-testid='selectRoomBtn'])[1]")
	private WebElement selectroom;
	public WebElement getselectroom() {
		return  selectroom;
}

}
		
	
	
	



