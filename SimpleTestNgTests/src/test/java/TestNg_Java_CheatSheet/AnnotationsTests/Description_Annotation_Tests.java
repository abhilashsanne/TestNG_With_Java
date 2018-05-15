package TestNg_Java_CheatSheet.AnnotationsTests;

import org.testng.annotations.*;

public class Description_Annotation_Tests {

	@Test(description = "Test case showing the demo of how description annotation works")
	public void description_Demo_test() {
		System.out.println("The string description for this method will appear in HTML report as well as "
				+ "on the standard output console");

		// The description annotation is very important as whenever we send a report to
		// team, manager or client they will easily understand what exactly this test
		// case is doing
	}
}
