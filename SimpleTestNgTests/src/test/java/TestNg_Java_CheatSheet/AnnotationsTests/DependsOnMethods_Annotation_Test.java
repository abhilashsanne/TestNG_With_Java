package TestNg_Java_CheatSheet.AnnotationsTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

public class DependsOnMethods_Annotation_Test {

	// Consider example flow Login -> Place an Order -> View Order Report -> Logout
	// You need to stop the execution if the login method fails
	// We use 'dependsOnMethods' annotation to inject this dependency

	@Test
	public void Initialize_Application_Test() {
		System.out.println("Starting the application, launch browser and navigate to application URL");
	}

	@Test(dependsOnMethods = "Initialize_Application_Test")
	public void Login_Test() {
		System.out.println("Login into application, Navigate to login page, enter credentials and click 'log-in'");
		// if application initialization failed, it makes no sense to search for login
	}

	@Test(dependsOnMethods = "Login_Test")
	public void Place_An_Order_Test() {
		System.out.println("Navigate to catalogue and place an order");
		// Place an order only when login is successful
	}

	@Test(dependsOnMethods = "Place_An_Order_Test")
	public void View_Order_Report_Test() {
		System.out.println("Navigate to orders report page and verify order record exists");

		assertEquals(12, 200, "Wanted Failing this test, the next dependent test will be skipped");
	}

	@Test(dependsOnMethods = "View_Order_Report_Test")
	public void Logout_Test() {
		// This test will be skipped from execution as the dependent test
		// "View_Order_Report_Test" failed
		System.out.println("Logout of the application");

	}

	@AfterClass
	public void CleanUpCode() {
		// Independent of test executions being pass or fail, this code will help
		// maintain resource memory optimization.
		// Eg: Use driver.quit(); for selenium
		System.out.println("CleanUpCode");
	}
}
