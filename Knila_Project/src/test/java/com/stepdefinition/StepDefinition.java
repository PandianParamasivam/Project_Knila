package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.helper.FileReaderManager;
import com.pom.Page_Object_Manager;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);

	String title;
	
	@After
	public static void screenShot() throws IOException {

		screenShot("everyScenario");
		
	}

	@Given("admin launch the url")
	public void admin_launch_the_url() throws IOException {
		String url = FileReaderManager.getInstance().getInstanceCr().geturl();
		getUrl(url);

	}

	@When("admin enter the their user name")
	public void admin_enter_the_their_user_name() {
		pom.getP1().getUserName().sendKeys("Admin");

	}

	@When("admin enter  the their password")
	public void admin_enter_the_their_password() {
		pom.getP1().getPassWord().sendKeys("Admin123");

	}

	@When("admin click the location")
	public void admin_click_the_location() {
		pom.getP1().getLocation().click();

	}

	@When("admin click the login button")
	public void admin_click_the_login_button() {
		pom.getP1().getLogIn().click();

		title = driver.getTitle();
		System.out.println(title);

	}

	@When("admin registering the patient details")
	public void admin_registering_the_patient_details() throws InterruptedException {
		String title1 = driver.getTitle();
		System.out.println(title1);

		//Assert.assertEquals(title, title1);
		Thread.sleep(3000);

		pom.getP1().getRegPatient().click();

	}

	@When("admin enter the patient name")
	public void admin_enter_the_patient_name() throws InterruptedException {
		Thread.sleep(3000);
		 pom.getP1().getName().sendKeys("Pan");
		

		String attribute = pom.getP1().getName().getAttribute("value");
		System.err.println(attribute);

		Assert.assertEquals(attribute, "Pan");

	}

	@When("admin enter the patient family name")
	public void admin_enter_the_patient_family_name() {
		pom.getP1().getFamilyName().sendKeys("SIVAM");

	}

	@When("admin select the gender")
	public void admin_select_the_gender() {
		pom.getP1().getGender().click();

	}

	@When("admin click the male")
	public void admin_click_the_male() {
		pom.getP1().getMale().click();

		String attribute = pom.getP1().getMale().getText();
		System.err.println(attribute);

		Assert.assertEquals(attribute, "Male");

	}

	@When("admin click the patient birthdate")
	public void admin_click_the_patient_birthdate() {
		pom.getP1().getBirDate().click();

	}

	@When("admin enter the birth day")
	public void admin_enter_the_birth_day() {
		String date = "20";
		pom.getP1().getDay().sendKeys(date);

		int parseInt = Integer.parseInt(date);

		String text = pom.getP1().getDay().getAttribute("value").trim();
		System.err.println(text);
		int parseInt2 = Integer.parseInt(text);

		Assert.assertEquals(parseInt, parseInt2);

	}

	@When("admin select the birth month")
	public void admin_select_the_birth_month() {
		Select s = new Select(pom.getP1().getMonth());
		s.selectByIndex(8);
		
		 String text = pom.getP1().getMonth().getAttribute("value");
		 System.err.println(text);
		 
		 Assert.assertEquals(text, "8");


	}

	@When("admin enter the birth year")
	public void admin_enter_the_birth_year() {
		String year = "1996";
		pom.getP1().getYear().sendKeys(year);
		int parseInt1 = Integer.parseInt(year);
		String text = pom.getP1().getYear().getAttribute("value").trim();
		System.err.println(text);
		int parseInt2 = Integer.parseInt(text);
		
		Assert.assertEquals(parseInt1, parseInt2);

	}

	@When("admin click the address info")
	public void admin_click_the_address_info() {
		pom.getP1().getAddress().click();

	}

	@When("admin enter the patient street address")
	public void admin_enter_the_patient_street_address() {
		pom.getP1().getAddress1().sendKeys("SRINIVASA NAGAR");

	}

	@When("admin enter the patient area address")
	public void admin_enter_the_patient_area_address() {
		WebElement address2 = pom.getP1().getAddress2();
		address2.sendKeys("PUTHUR");

		String attribute = pom.getP1().getAddress2().getAttribute("value");
		System.err.println(attribute);

		Assert.assertEquals(attribute, "PUTHUR");

	}

	@When("admin enter the patient city")
	public void admin_enter_the_patient_city() {
		WebElement city = pom.getP1().getCity();
		city.sendKeys("TRICHY");

		String attribute = pom.getP1().getCity().getAttribute("value");
		System.err.println(attribute);

		Assert.assertEquals(attribute, "TRICHY");

	}

	@When("admin enter the patient state")
	public void admin_enter_the_patient_state() {
		WebElement state = pom.getP1().getState();
		state.sendKeys("TAMILNADU");

		String attribute = pom.getP1().getState().getAttribute("value");
		System.err.println(attribute);

		Assert.assertEquals(attribute, "TAMILNADU");

	}

	@When("admin enter the patient country")
	public void admin_enter_the_patient_country() {
		WebElement country = pom.getP1().getCountry();
		country.sendKeys("INDIA");
		String attribute = pom.getP1().getCountry().getAttribute("value");
		System.err.println(attribute);

		Assert.assertEquals(attribute, "INDIA");

	}

	@When("admin enter the patient postal code")
	public void admin_enter_the_patient_postal_code() {
		WebElement postalCode = pom.getP1().getPostalCode();
		postalCode.sendKeys("620017");
		String attribute = pom.getP1().getPostalCode().getAttribute("value");
		System.err.println(attribute);

		Assert.assertEquals(attribute, "620017");

	}

	@When("admin click the phone info")
	public void admin_click_the_phone_info() {
		pom.getP1().getPhone().click();

	}

	@When("admin enter the phone no")
	public void admin_enter_the_phone_no() {
		WebElement no = pom.getP1().getNo();
		no.sendKeys("8148884619");

		String attribute = pom.getP1().getNo().getAttribute("value");
		System.err.println(attribute);

		Assert.assertEquals(attribute, "8148884619");

	}

	@When("admin click the confirm button")
	public void admin_click_the_confirm_button() {
		pom.getP1().getConfirm().click();

	}

	@When("admin click the confirm button again")
	public void admin_click_the_confirm_button_again() {
		pom.getP1().getGconfirm().click();

	}

	@Then("admin navigate to the next page")
	public void admin_navigate_to_the_next_page() {
		System.out.println("SECOND PAGE");

	}

	@When("admin start the visit")
	public void admin_start_the_visit() throws InterruptedException {
		Thread.sleep(1000);
		pom.getP2().getStartVisit().click();

	}

	@When("admin click the confirm right button")
	public void admin_click_the_confirm_right_button() throws InterruptedException {
		pom.getP2().getConfirmRight().click();
		Thread.sleep(2000);
		driver.navigate().back();

	}

	@Then("admin navigate to the third page")
	public void admin_navigate_to_the_third_page() {
		System.out.println("THIRD PAGE");

	}

	@When("admin click the attachments")
	public void admin_click_the_attachments() throws InterruptedException {
		pom.getP3().getAttachments().click();
		Thread.sleep(2000);

	}

	@When("admin click the drop file")
	public void admin_click_the_drop_file() throws AWTException, InterruptedException {
		pom.getP3().getAttachments1().click();
		String file = "C:\\Users\\PC0DBD3J\\Desktop\\S1.jpg";
		StringSelection select = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	@Then("admin navigate to the fourth page")
	public void admin_navigate_to_the_fourth_page() {
		System.out.println("FOURTH PAGE");

	}

	@When("admin naming the file")
	public void admin_naming_the_file() {
		pom.getP4().getCaption().sendKeys("MEDICAL DETAILS");

	}

	@When("admin click the upload button")
	public void admin_click_the_upload_button() throws InterruptedException {
		pom.getP4().getUploadd().click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

	@When("admin end the visit")
	public void admin_end_the_visit() {
		pom.getP4().getEndVisit().click();

	}

	@When("admin click the yes button")
	public void admin_click_the_yes_button() throws InterruptedException {
		pom.getP4().getYes().click();
		Thread.sleep(5000);

	}

	@When("admin click the delete account")
	public void admin_click_the_delete_account() {
		pom.getP4().getDelAcc().click();

	}

	@When("admin giving the reason")
	public void admin_giving_the_reason() {
		pom.getP4().getReason().sendKeys("TESTING");

	}

	@When("admin click the final confirm button")
	public void admin_click_the_final_confirm_button() {
		pom.getP4().getCon().click();

	}

	@Then("admin see patient info page")
	public void admin_see_patient_info_page() {
		System.out.println("PATIENT INFO PAGE SHOWN");

	}


}
