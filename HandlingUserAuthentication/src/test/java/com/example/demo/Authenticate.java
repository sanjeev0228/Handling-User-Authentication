package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Authenticate {

	@Test
	@DisplayName("Testcase for Authentication of User")
	void userAuthenticate() {
		assertNotNull(App.id);
		assertEquals(App.Defineid,App.id);
	}
	
	@Test
	@DisplayName("Testcase for Authentication of Password")
	void passwordAuthenticate() {
		assertNotNull(App.pass);
		assertEquals(App.Definepass, App.pass);
	}
	
	@BeforeAll
	@DisplayName("First Testcase.")
	static void authenticationTestCase() {
		App.inputID();
	    App.inputPassword();
	    
	    assertNotNull(App.id);
	    assertNotNull(App.pass);		
	}
	
	@AfterAll
	@DisplayName("Last Testcase.")
	static void last() {
		
		if (App.authenticate())
			System.out.println("Authentication Successfull...");
		else System.out.println("Authentication Failed...");
		
		App.id = null;
		App.pass = null;
		
		assertNull(App.id);
		assertNull(App.pass);
	}

}
