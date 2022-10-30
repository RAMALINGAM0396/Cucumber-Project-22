package com.stepdef;
import org.openqa.selenium.WebDriver;
import com.Sep.Project_Sep_22.Base_Class;
import com.pageobjectmanager.PageObject_Manger;
import com.runner.Adatin_Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Step_Def extends Base_Class{
   public static WebDriver driver = Adatin_Runner.driver;
   public static PageObject_Manger manager = new PageObject_Manger(driver);		
	
   @Given("user Launch the Application.")
   public void user_launch_the_application() {
    get_Url("https://adactinhotelapp.com/");
   }
   @When("user Enter the {string} In username Field.")
   public void user_enter_the_in_username_field(String username) {
    send_Keys(manager.getSignin().getUsername(), username);
   }
   @When("and user Enter the {string} In Password Field.")
   public void and_user_enter_the_in_password_field(String password) {
   send_Keys(manager.getSignin().getPassword(), password);
   
   }
   @Then("user click on the Login Button and it Navigates To Search Hotel.")
   public void user_click_on_the_login_button_and_it_navigates_to_search_hotel() {
      click(manager.getSignin().getLogin());
   }
   @Then("user will Select the Location to book hotel.")
   public void user_will_select_the_location_to_book_hotel() {
       select_ByI(manager.getSh().getLocation(), 8);
   }
   @Then("user will choose the hotel.")
   public void user_will_choose_the_hotel() {
        select_ByT(manager.getSh().getHotel(),"Hotel Cornice");
   }
   @Then("user will select Room Type by clicking Drop Down Button.")
   public void user_will_select_room_type_by_clicking_drop_down_button() {
       select_ByT(manager.getSh().getRoomtype(), "Deluxe");
   }
   @Then("user will select the Number Of Rooms for the Stay.")
   public void user_will_select_the_number_of_rooms_for_the_stay() {
      select_ByI(manager.getSh().getNroom(), 4);
   }
   @Then("user will input the Check In Date")
   public void user_will_input_the_check_in_date() {
	   clear(manager.getSh().getIndate());
		send_Keys(manager.getSh().getIndate(), "18/09/2022");
   }
   @Then("user will input the Check Out Date")
   public void user_will_input_the_check_out_date() {
	   clear(manager.getSh().getOutdate());
		send_Keys(manager.getSh().getOutdate(), "22/09/2022");
   }
   @Then("user will select the Adults Per Room")
   public void user_will_select_the_adults_per_room() {
	   select_ByI(manager.getSh().getAdult(), 3);
   }
   @Then("user will select the Child Per Room")
   public void user_will_select_the_child_per_room() {
	   select_ByI(manager.getSh().getChild(), 2);
   }
   @Then("user will click the Search Button it Navigates to Select Hotel Page")
   public void user_will_click_the_search_button_it_navigates_to_select_hotel_page() {
	   click(manager.getSh().getSearch());
   }
   @Then("user will click the Radio Button")
   public void user_will_click_the_radio_button() {
	   click(manager.getHotel().getRadio());
   }
   @Then("user will click the Continue Button it Navigates to Book a Hotel Page")
   public void user_will_click_the_continue_button_it_navigates_to_book_a_hotel_page() {
	   click(manager.getHotel().getNext());
   }
   @Then("user will Enter Firstname in the firstname field")
   public void user_will_enter_firstname_in_the_firstname_field() {
	   send_Keys(manager.getBh().getFirstname(),"Ramalingam");
   }
   @Then("user will Enter Lastname in lastname field")
   public void user_will_enter_lastname_in_lastname_field() {
	   send_Keys(manager.getBh().getLastname(),"K");
   }
   @Then("user will Enter Billing Address in the address field")
   public void user_will_enter_billing_address_in_the_address_field() {
	   send_Keys(manager.getBh().getAddress(),"No 56,Bruno Street,Texas.");
   }
   @Then("user will Enter Credit Card Number in the Credit Card Number field")
   public void user_will_enter_credit_card_number_in_the_credit_card_number_field() {
	   send_Keys(manager.getBh().getCreditno(),"2654 2666 9545 2661");
   }
   @Then("user will Select Credit Card Type from the dropdown button")
   public void user_will_select_credit_card_type_from_the_dropdown_button() {
	   select_ByT(manager.getBh().getCredittype(),"VISA");
   }
   @Then("user will Select Month of Validity of the CreditCard")
   public void user_will_select_month_of_validity_of_the_credit_card() {
	   select_ByI(manager.getBh().getValidity1(), 12);
   }
   @Then("user will Select Year of Validity of the Credit Card")
   public void user_will_select_year_of_validity_of_the_credit_card() {
	   select_ByT(manager.getBh().getValidity2(),"2022");
   }
   @Then("user will Enter CVV Number in the CVV Number field")
   public void user_will_enter_cvv_number_in_the_cvv_number_field() {
	   send_Keys(manager.getBh().getCvv(),"555");
   }
   @Then("user will click the Book Now Button it Navigates to Booking confirmation")
   public void user_will_click_the_book_now_button_it_navigates_to_booking_confirmation() {
	   click(manager.getBh().getBooknow());
   }
   @Then("user will click the My Itinery Button")
   public void user_will_click_the_my_itinery_button() {
	   click(manager.getBh().getMyorder());
   }
   @Then("user will click the Logout Button it will Navigate to Home Page")
   public void user_will_click_the_logout_button_it_will_navigate_to_home_page() {
	   click(manager.getBh().getLogout());
   }




	
	
}
