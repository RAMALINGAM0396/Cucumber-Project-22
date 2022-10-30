package com.stepdefautopack;

import org.openqa.selenium.WebDriver;

import com.Sep.Project_Sep_22.Base_Class;
import com.pageobjectmanager.Automation_Pom;
import com.runner.Automation_Practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AutoStep_Def extends Base_Class{
	
	public static WebDriver driver = Automation_Practice.driver;
	public static Automation_Pom auto = new Automation_Pom(driver);
	
	@Given("user Launch the Application")
	public void user_launch_the_application() {
		get_Url("http://automationpractice.com/index.php");
	}
	@When("user will click the Signin Button it Navigates to Login page")
	public void user_will_click_the_signin_button_it_navigates_to_login_page() {
		click(auto.getLi().getSignin());
	}
	@When("user will Enter the {string} in the Username field")
	public void user_will_enter_the_in_the_username_field(String username) {
		send_Keys(auto.getLi().getUsername(), username);
	}
	@When("user will Enter the {string} in the Password field")
	public void user_will_enter_the_in_the_password_field(String password) {
		send_Keys(auto.getLi().getPassword(), password);
	}
	@When("user will click the Login Button it will Navigates to Products Page")
	public void user_will_click_the_login_button_it_will_navigates_to_products_page() {
		click(auto.getLi().getLogin());
	}
	@When("user will Perform a Action by Mouseover on Dresses")
	public void user_will_perform_a_action_by_mouseover_on_dresses() {
		actions(driver, auto.getHp().getDresses());
	}
	@When("user will click the Evening Dress")
	public void user_will_click_the_evening_dress() {
		click(auto.getHp().getEveningDress());
	}
	@When("user will click the Printed Dress")
	public void user_will_click_the_printed_dress() {
		click(auto.getHp().getImage());
	}
	@When("after user click the Printed Dress it will open as Frame")
	public void after_user_click_the_printed_dress_it_will_open_as_frame() {
		Frames(auto.getHp().getFrame());
	}
	@When("user will click the Quantity for the Dress")
	public void user_will_click_the_quantity_for_the_dress() {
		click(auto.getPp().getQuantity());
	}
	@When("user will choose size of the Dress")
	public void user_will_choose_size_of_the_dress() {
		select_ByT(auto.getPp().getSize(), "M");
	}
	@When("user will select the Color of the Dress")
	public void user_will_select_the_color_of_the_dress() {
		click(auto.getPp().getColor());
	}
	@When("user will finally click Add to Cart Button")
	public void user_will_finally_click_add_to_cart_button() {
		click(auto.getPp().getAdd2cart());
	}
	@When("user will click the Proceed to Checkout button")
	public void user_will_click_the_proceed_to_checkout_button() {
		click(auto.getPtc().getCkot());
	}
	@When("user will click the Proceed to Checkout")
	public void user_will_click_the_proceed_to_checkout() {
		click(auto.getPtc().getPtoc());
	}
	@When("user will check the address and click the Proceed to Checkout Button")
	public void user_will_check_the_address_and_click_the_proceed_to_checkout_button() {
		click(auto.getPtc().getSubmit());
	}
	@When("user will tick the Check Box")
	public void user_will_tick_the_check_box() {
		click(auto.getPtc().getTick());
	}
	@When("user will click the Proceed to Checkout Button")
	public void user_will_click_the_proceed_to_checkout_box() {
		click(auto.getPtc().getSubmit2());
	}
	@When("user will click the Bankwire for Payment mode")
	public void user_will_click_the_bankwire_for_payment_mode() {
		click(auto.getPay().getPaymode());
	}
	@When("user will click the I Confirm My Order Button")
	public void user_will_click_the_i_confirm_my_order_button() {
		click(auto.getPay().getOko());
	}
	@When("user will click the Back to Orders")
	public void user_will_click_the_back_to_orders() {
		click(auto.getPay().getBco());
	}
	@Then("user will click the Signout Button")
	public void user_will_click_the_signout_button() {
		click(auto.getPay().getHome());
	}
	
	
	
	
	
	
	
	
	
	
}
