package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	
public static WebDriver driver;
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[10]")
    private WebElement attachments;
	
	@FindBy(xpath="//div[@class='dz-default dz-message ng-binding']")
    private WebElement attachments1;

	public Pom3(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getAttachments() {
		return attachments;
	}

	public WebElement getAttachments1() {
		return attachments1;
	}

}
