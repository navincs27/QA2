package stepdefff;

import com.IPT_QA2_Goibibo.Pageobject;
import com.IPT_QA2_Goibibo.base.BaseClass;
import com.IPT_QA2_Goibibo.base.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends TestBase {
	Pageobject ip=new Pageobject();
	
	@Given("the user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		     launchUrl("https://www.goibibo.com/hotels/itc-grand-chola-a-luxury-collection-hotel-in-chennai-8353476183493538901/?hquery={%22ci%22:%2220240117%22,%22co%22:%2220240119%22,%22r%22:%221-2-0%22,%22ibp%22:%22%22}&cc=IN&vcid=4354390963378411938&locusId=CTMAA&locusType=city&cityCode=CTMAA");
		
	}

	@When("the user selects a room with the lowest price")
	public void the_user_selects_a_room_with_the_lowest_price() {
	    // Write code here that turns the phrase above into concrete actions
		clickOnWebelement(ip.getviewplandploices());
		
	   
	}

	@When("the user captures the plan details and policies")
	public void the_user_captures_the_plan_details_and_policies() {
	    // Write code here that turns the phrase above into concrete actions
		screenShot("ploices");
		clickOnWebelement(ip.getclose());
	}

	@When("the user takes a screenshot")
	public void the_user_takes_a_screenshot() {
	    // Write code here that turns the phrase above into concrete actions
		screenShot("ploices");
	}

	@Then("the selected room details should be displayed at  low price")
	public void the_selected_room_details_should_be_displayed_at_low_price() {
	    // Write code here that turns the phrase above into concrete actions
		clickOnWebelement(ip.getselectroom());
	}


}
