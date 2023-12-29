package com.IPT_QA2_Goibibo;

import org.junit.runner.RunWith;

import com.IPT_QA2_Goibibo.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "",
								glue = "com.StepDef", monochrome = true, 
								dryRun = false, 
								plugin= {"json:JsonReport/limelog.json", "html:Htmlreport/limelogn.html",
										"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})




public class Runner_Class extends BaseClass {
	

	

}
