package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
 	private Pom1  P1;
 	
 	private Pom2 P2;
 	
 	private Pom3 P3;
 	
 	private Pom4 P4;

	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
		

	}

	public Pom1 getP1() {
		 P1 = new Pom1(driver);
		return P1;
	}

	public Pom2 getP2() {
		 P2 = new Pom2(driver);

		return P2;
	}

	public Pom3 getP3() {
		 P3 = new Pom3(driver);

		return P3;
	}

	public Pom4 getP4() {
		 P4 = new Pom4(driver);

		return P4;
	} 

}
