package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
	
public static WebDriver driver;
	
	@FindBy(xpath="//textarea[@placeholder='Enter a caption']")
    private WebElement caption;
	
	@FindBy(xpath="//button[text()='Upload file']")
    private WebElement uploadd;

	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[6]")
    private WebElement endVisit;
	
	@FindBy(xpath="(//button[text()='Yes'])[2]")
    private WebElement yes;
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[8]")
    private WebElement DelAcc;
	
	@FindBy(xpath="//input[@id='delete-reason']")
    private WebElement reason;
	
	@FindBy(xpath="(//button[@class='confirm right'])[6]")
    private WebElement con;
	
	
	public Pom4(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public WebElement getCaption() {
		return caption;
	}


	public WebElement getUploadd() {
		return uploadd;
	}


	public WebElement getEndVisit() {
		return endVisit;
	}


	public WebElement getYes() {
		return yes;
	}


	public WebElement getDelAcc() {
		return DelAcc;
	}


	public WebElement getReason() {
		return reason;
	}


	public WebElement getCon() {
		return con;
	}

}
