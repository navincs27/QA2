package com.IPT_QA2_Goibibo.pom;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPage {


PageFactory.initElements(driver,this);

@FindBy(xpath ="(//p[text()='Enter city or airport'])[1]")

}
