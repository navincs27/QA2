package com.IPT_QA2_Goibibo.base;

import org.openqa.selenium.WebDriver;

import com.IPT_QA2_Goibibo.pom.HomePage;

public class Home extends BaseClass{

	 HomePage h=new HomePage();
	
	public static void browser() {
		 getDriver("chrome");
		 launchUrl("https://www.goibibo.com/");
		 refresh();
		 
	}
}
