package com.allautomation;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.Sep.Project_Sep_22.Base_Class;
import com.pageobjectmanager.Automation_Pom;
import com.pageobjectmanager.Casual_POM;
import com.runner.AllAutomation;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class All_Autostep_Def extends Base_Class{
	public static WebDriver driver = AllAutomation.driver;
	public static Automation_Pom auto = new Automation_Pom(driver);
	public static Casual_POM cpom = new Casual_POM(driver);
	
   @Before
    public void click_Signin() {
	   click(auto.getLi().getSignin());
	}
	
   @After
       public void logout() {
       click(auto.getPay().getSignout());
	   driver.navigate().to("http://automationpractice.com/index.php");
	}
   @When("user enter the username in the username field")
   public void user_enter_the_username_in_the_username_field() {
	   send_Keys(auto.getLi().getUsername(),"k.ramu196@gmail.com");
   }
   @When("user enter the password in the password field")
   public void user_enter_the_password_in_the_password_field() {
	   send_Keys(auto.getLi().getPassword(), "Java@123");
   }
   @Then("user click the login button it Navigates to details page")
   public void user_click_the_login_button_it_navigates_to_details_page() {
	   click(auto.getLi().getLogin());
   }
   @When("user click the CasualDress Text It Navigates to the CasualDress Page")
   public void user_click_the_casual_dress_text_it_navigates_to_the_casual_dress_page() {
	   actions(driver, auto.getHp().getDresses());
	   click(cpom.get_cd().getCasualDress());
   }
   @When("user Choose the product and click he quickview")
   public void user_choose_the_product_and_click_he_quickview() {
	   click(cpom.get_cd().getImage());
	   Frames(cpom.get_cd().getFrame());
   }
   @When("user select the Quantity and change size and add the product to cart")
   public void user_select_the_quantity_and_change_size_and_add_the_product_to_cart() {
	   click(cpom.get_cpp().getQuantity());
		select_ByT(cpom.get_cpp().getSize(), "L");
		click(cpom.get_cpp().getProtc());
   }
   @When("user click the proceed to checkout button and navigates to Order page")
   public void user_click_the_proceed_to_checkout_button_and_navigates_to_order_page() {
	   click(cpom.get_ptc().getPtc());
		
   }
   @When("user click the proceed to checkout in order page and navigates to order verify page")
   public void user_click_the_proceed_to_checkout_in_order_page_and_navigates_to_order_verify_page() {
	   click(cpom.get_ptc().getProceed());
   }
   @When("user confirm that click proceed to checkout button in Address")
   public void user_confirm_that_click_proceed_to_checkout_button_in_address() {
	   click(cpom.get_ptc().getProadd());
	   click(cpom.get_ptc().getChkbox());
   }
   @When("user select the Terms and conditions and click proceed to checkout button")
   public void user_select_the_terms_and_conditions_and_click_proceed_to_checkout_button() {
	   click(cpom.get_ptc().getProscarrier());
   }
   @When("user choose the Payment Method")
   public void user_choose_the_payment_method() {
	   click(cpom.get_ptc().getBank());
		click(cpom.get_ptc().getSubmit());
   }
   @Then("user confirm the order")
   public void user_confirm_the_order() throws IOException {
	   click(cpom.get_ptc().getBoccasual());
	   TakesScreenshot_t();
   }
//   EveningDress
   
   @When("user click the EveningDress Text It Navigates to the EveningDress Page")
   public void user_click_the_evening_dress_text_it_navigates_to_the_evening_dress_page() {
	   actions(driver, auto.getHp().getDresses());
	   click(auto.getHp().getEveningDress());
   }
   @When("user Choose the product and click he quickview of Evening Dress")
   public void user_choose_the_product_and_click_he_quickview_of_evening_dress() {
	   click(auto.getHp().getImage());
	   Frames(auto.getHp().getFrame());
   }
   @When("user select the Quantity and color and change size and add the product to cart")
   public void user_select_the_quantity_and_color_and_change_size_and_add_the_product_to_cart() {
	   click(auto.getPp().getQuantity());
	   select_ByT(auto.getPp().getSize(), "M");
	   click(auto.getPp().getColor());
	   click(auto.getPp().getAdd2cart());
   }
   @When("user click the proceed to atu checkout button and navigates to Order page")
   public void user_click_the_proceed_to_atu_checkout_button_and_navigates_to_order_page() {
	   click(auto.getPtc().getCkot());
   }
   @When("user click the proceed to checkout la in order page and navigates to order verify page")
   public void user_click_the_proceed_to_checkout_la_in_order_page_and_navigates_to_order_verify_page() {
	   click(auto.getPtc().getPtoc());
   }
   @When("user confirm that click ae proceed to checkout button in Address")
   public void user_confirm_that_click_ae_proceed_to_checkout_button_in_address() {
	   click(auto.getPtc().getSubmit());
	   click(auto.getPtc().getTick());
   }
   @When("user select the TaCTerms and conditions and click proceed to checkout button")
   public void user_select_the_ta_c_terms_and_conditions_and_click_proceed_to_checkout_button() {
	   click(auto.getPtc().getSubmit2());
   }
   @When("user choose the Payment Method in Evening Dress")
   public void user_choose_the_payment_method_in_evening_dress() {
	   click(auto.getPay().getPaymode());
   }
   @Then("user confirm the order in Evening Dress")
   public void user_confirm_the_order_in_evening_dress() {
	   click(auto.getPay().getOko());
	   click(auto.getPay().getBco());
	   
   }
   
}

