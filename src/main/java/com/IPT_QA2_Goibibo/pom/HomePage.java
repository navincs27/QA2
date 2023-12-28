package com.IPT_QA2_Goibibo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.IPT_QA2_Goibibo.base.BaseClass;

public class HomePage extends BaseClass  {
	
 public static void login () {
	        //login
			WebElement loginbtn = driver.findElement(By.id("get_sign_in"));
			loginbtn.click();
			//mbl no
			WebElement username = driver.findElement(By.xpath("//input[@class='loginCont__input']"));
			username.sendKeys("9094191951");
			
			
			
			
			
			
}

}
