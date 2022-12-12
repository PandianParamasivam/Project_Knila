package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
    private WebElement userName;
	@FindBy(xpath="//input[@id='password']")
    private WebElement passWord;
	@FindBy(xpath="//li[text()='Laboratory']")
    private WebElement location;
	@FindBy(xpath="//input[@type='submit']")
    private WebElement logIn;
	@FindBy(xpath="//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    private WebElement regPatient;
	@FindBy(xpath="//input[@name='givenName']")
    private WebElement Name;
	@FindBy(xpath="//input[@name='familyName']")
    private WebElement familyName;
	@FindBy(xpath="//span[text()='Gender']")
    private WebElement gender;
	@FindBy(xpath="//option[text()='Male']")
    private WebElement male;
	@FindBy(xpath="//span[text()='Birthdate']")
    private WebElement birDate;
	@FindBy(xpath="//input[@name='birthdateDay']")
    private WebElement day;
	@FindBy(xpath="//select[@name='birthdateMonth']")
    private WebElement month;
	@FindBy(xpath="//input[@name='birthdateYear']")
    private WebElement year;
	@FindBy(xpath="//span[text()='Address']")
    private WebElement address;
	@FindBy(xpath="//input[@id='address1']")
    private WebElement address1;
	@FindBy(xpath="//input[@id='address2']")
    private WebElement address2;
	@FindBy(xpath="//input[@id='cityVillage']")
    private WebElement city;
	@FindBy(xpath="//input[@id='stateProvince']")
    private WebElement state;
	
	@FindBy(xpath="//input[@id='country']")
    private WebElement country;
	
	@FindBy(xpath="//input[@id='postalCode']")
    private WebElement postalCode;
	
	@FindBy(xpath="//span[text()='Phone Number']")
    private WebElement phone;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
    private WebElement no;
	
	@FindBy(xpath="//span[text()='Confirm']")
    private WebElement confirm;
	
	@FindBy(xpath="//input[@value='Confirm']")
    private WebElement gconfirm;

	public Pom1(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getRegPatient() {
		return regPatient;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getFamilyName() {
		return familyName;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getBirDate() {
		return birDate;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getNo() {
		return no;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getGconfirm() {
		return gconfirm;
	}

}
