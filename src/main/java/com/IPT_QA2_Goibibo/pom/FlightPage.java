package com.IPT_QA2_Goibibo.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_QA2_Goibibo.base.BaseClass;

public class FlightPage extends BaseClass {
	public  FlightPage() {
	PageFactory.initElements(driver, this);

	}

@FindBy(xpath ="(//p[text()='Enter city or airport'])[1]")
public WebElement flight;
public WebElement getFlight() {
	return flight;
}
@FindBy(xpath = "(//p[text()='Enter city or airport'])[2]")
public WebElement flightto;
public WebElement getFlightto() {
	return flightto;
}

}
