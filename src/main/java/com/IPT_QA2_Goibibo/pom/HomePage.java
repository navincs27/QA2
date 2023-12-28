package com.IPT_QA2_Goibibo.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IPT_QA2_Goibibo.base.BaseClass;

public class HomePage extends BaseClass {
	
		public HomePage (){
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//a[@href='/hotels/']")
		private WebElement Hotels;
		
		public WebElement getHotels() {
			return Hotels;
		}

		public void setHotels(WebElement hotels) {
			Hotels = hotels;
		}

}
