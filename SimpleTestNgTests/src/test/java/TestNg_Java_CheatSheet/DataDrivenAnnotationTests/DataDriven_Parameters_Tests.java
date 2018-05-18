package TestNg_Java_CheatSheet.DataDrivenAnnotationTests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriven_Parameters_Tests {

	/*
	 * Simple Data Driven test running with parameters 'author' and 'bookTitle'
	 * Run using the XML file DataDriven_Parameters_Tests.xml
	 */

	// Suite level – The parameters inside the <suite> tag of TestNG XML file
	// will be a suite level parameter.

	/*
	 * Test Level -- The parameters inside the <Test> tag of testing XML file
	 * will be a Test level parameter.
	 */
	// NOTE: In case if the parameter name is same in suite level and test level
	// then test level parameter will get preference over suite level.
	@Test
	@Parameters({"author", "bookTitle"})
	public void testParameterWithXML(String author,
			String bookTitle) {

		System.out.println("The book: " + bookTitle
				+ " is authored by ->" + author);
	}

	@Test
	@Parameters({"author", "bookTitle"})
	public void test_OptionalParameterWithXML(
			@Optional("Unknown") String author,
			String bookTitle) {

		// Comment parameter 'author' to XML file to see output of
		// test_OptionalParameterWithXML
		System.out.println("The book: " + bookTitle
				+ " is authored by ->" + author);
	}

	// LIMITATION: You want to test multiple values of the same parameter using
	// Testng.xml
	// this can not be done! You can have multiple different parameters, but
	// each parameter can only have a single value.If you want to use multiple
	// values for a parameter use DataProviders
}
