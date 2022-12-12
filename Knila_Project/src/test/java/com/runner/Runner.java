package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mages\\eclipse-workspace\\Knila_Project\\src\\test\\java\\com\\feature\\knila.feature",
glue = "com.stepdefinition",
dryRun = false,
monochrome = true,
plugin = {"pretty", "html:target/knila.html", "json:target/knila.json" ,
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void runTheProgram() throws IOException {
		String browser = FileReaderManager.getInstance().getInstanceCr().getBrowser();
		driver = BaseClass.browser(browser);



}

}
