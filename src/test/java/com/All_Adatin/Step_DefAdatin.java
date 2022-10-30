package com.All_Adatin;

import org.openqa.selenium.WebDriver;

import com.Sep.Project_Sep_22.Base_Class;
import com.pageobjectmanager.PageObject_Manger;
import com.runner.All_Adatin;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_DefAdatin extends Base_Class{
	public static WebDriver driver = All_Adatin.driver;
    public static PageObject_Manger manager = new PageObject_Manger(driver);	
			
    @Before
    public void click_Signin() {
    	driver.get("https://adactinhotelapp.com/");
	}
	
   @After
       public void logout() {
	   click(manager.getBh().getLogout());
	}

@When("user enter the username in the username field")
public void user_enter_the_username_in_the_username_field() {
    send_Keys(manager.getSignin().getUsername(), "Ramalingam300");
}
@When("user enter the password in the password field")
public void user_enter_the_password_in_the_password_field() {
    send_Keys(manager.getSignin().getPassword(), "Java@123");
}
@Then("user click the login button it Navigates to details page")
public void user_click_the_login_button_it_navigates_to_details_page() {
   click(manager.getSignin().getLogin());
}
@When("user Select the location and the Hotel for Stay")
public void user_select_the_location_and_the_hotel_for_stay() {
	select_ByI(manager.getSh().getLocation(), 8);
    select_ByT(manager.getSh().getHotel(), "Hotel Cornice");
}
@When("user Select the Roomtype and Number of Rooms fits to them.")
public void user_select_the_roomtype_and_number_of_rooms_fits_to_them() {
	select_ByT(manager.getSh().getRoomtype(), "Deluxe");
	select_ByI(manager.getSh().getNroom(), 4);
}
@When("user Enters the CheckIn and CheckOut Date .")
public void user_enters_the_check_in_and_check_out_date() {
	clear(manager.getSh().getIndate());
	send_Keys(manager.getSh().getIndate(), "18/10/2022");
	 clear(manager.getSh().getOutdate());
		send_Keys(manager.getSh().getOutdate(), "25/10/2022");
}
@When("user also choose the Rooms for both Adult and Children click Search.")
public void user_also_choose_the_rooms_for_both_adult_and_children_click_search() {
	select_ByI(manager.getSh().getAdult(), 3);
	 select_ByI(manager.getSh().getChild(), 2);
	 click(manager.getSh().getSearch());
}
@When("user check the Radio button and proceed with next page.")
public void user_check_the_radio_button_and_proceed_with_next_page() {
	click(manager.getHotel().getRadio());
	 click(manager.getHotel().getNext());
}
@When("user finds the availability and gives his details to Book the Hotel")
public void user_finds_the_availability_and_gives_his_details_to_book_the_hotel() {
	send_Keys(manager.getBh().getFirstname(),"Ramalingam");
	send_Keys(manager.getBh().getLastname(),"K");
	send_Keys(manager.getBh().getAddress(),"No 56,Bruno Street,Texas.");
	send_Keys(manager.getBh().getCreditno(),"2654 2666 9545 2661");
	select_ByT(manager.getBh().getCredittype(),"VISA");
	select_ByI(manager.getBh().getValidity1(), 12);
	select_ByT(manager.getBh().getValidity2(),"2022");
	send_Keys(manager.getBh().getCvv(),"555");
}
@When("user confirming the Booking and finalize the order")
public void user_confirming_the_booking_and_finalize_the_order() {
	 click(manager.getBh().getBooknow());
	 click(manager.getBh().getMyorder());
}
// Hotel Hervey

@When("user Select the Location and the Hotel to enjoy the trip")
public void user_select_the_location_and_the_hotel_to_enjoy_the_trip() {
	select_ByT(manager.getSh().getLocation(), "Brisbane");
	select_ByT(manager.getSh().getHotel(), "Hotel Hervey");
}
@When("user Select the Roomtype and Number of rooms for the Morning rise View")
public void user_select_the_roomtype_and_number_of_rooms_for_the_morning_rise_view() {
	select_ByT(manager.getSh().getRoomtype(), "Double");
	select_ByV(manager.getSh().getNroom(), "5");
}
@When("user Enters the Checkin and Checkout Date accordingly.")
public void user_enters_the_checkin_and_checkout_date_accordingly() {
	clear(manager.getSh().getIndate());
	send_Keys(manager.getSh().getIndate(), "27/10/2022");
	clear(manager.getSh().getOutdate());
	send_Keys(manager.getSh().getOutdate(), "30/10/2022");
}
@When("user also choose the Adult rooms and Children rooms for the Trip")
public void user_also_choose_the_adult_rooms_and_children_rooms_for_the_trip() {
	send_Keys(manager.getSh().getAdult(), "2");
	select_ByV(manager.getSh().getChild(), "4");
	click(manager.getSh().getSearch());
}
@When("user check the Radio Button and proceed to continue.")
public void user_check_the_radio_button_and_proceed_to_continue() {
	click(manager.getHotel().getRadio());
	click(manager.getHotel().getNext());
}
@When("user finds the available rooms and gives the details to book the hotel")
public void user_finds_the_available_rooms_and_gives_the_details_to_book_the_hotel() {
	send_Keys(manager.getBh().getFirstname(), "RAMALINGAM");
	send_Keys(manager.getBh().getLastname(), "K");
	send_Keys(manager.getBh().getAddress(), "No 56,Bruno Street,Texas.");
	send_Keys(manager.getBh().getCreditno(), "0123456789845689");
	select_ByV(manager.getBh().getCredittype(), "VISA");
	select_ByV(manager.getBh().getValidity1(), "12");
	select_ByV(manager.getBh().getValidity2(), "2022");
	send_Keys(manager.getBh().getCvv(), "555");
}
@When("user confirming the Booking and wait for the keys and moves to order page")
public void user_confirming_the_booking_and_wait_for_the_keys_and_moves_to_order_page() {
	click(manager.getBh().getBooknow());
    click(manager.getBh().getMyorder());
}
	
	
	
}
