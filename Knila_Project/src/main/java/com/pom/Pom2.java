package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	
public static WebDriver driver;
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement startVisit;
	
	@FindBy(xpath="(//button[@class='confirm right'])[6]")
	private WebElement confirmRight;

	public Pom2(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getStartVisit() {
		return startVisit;
	}

	public WebElement getConfirmRight() {
		return confirmRight;
	}

}
