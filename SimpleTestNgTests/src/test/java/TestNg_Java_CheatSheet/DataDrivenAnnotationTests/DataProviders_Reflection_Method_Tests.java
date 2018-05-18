package TestNg_Java_CheatSheet.DataDrivenAnnotationTests;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_Reflection_Method_Tests {

	// There are two type of parameters supported by DataProvider method.

	// Method- If the SAME DataProvider should behave differently with different
	// test method , use Method parameter.

	// ITestContext- It can use to create different parameters for test cases
	// based on groups.

	/**********************************************************************/
	@Test(dataProvider = "SearchProvider")
	public void testMethodA(String author, String searchKey) {
		System.out.println(author + " ::::" + searchKey);
	}

	@Test(dataProvider = "SearchProvider")
	public void testMethodB(String searchKey) {
		System.out.println("Single Parameter ::::" + searchKey);
	}

	/**
	 * Here DataProvider returning value on the basis of test method name
	 **/
	@DataProvider(name = "SearchProvider")
	public Object[][] getDataFromDataprovider(Method m) {
		if (m.getName().equalsIgnoreCase("testMethodA")) {
			return new Object[][]{{"Hyderabad", "India"},
					{"London", "UK"}, {"New York", "USA"}};
		} else {
			return new Object[][]{{"India"}, {"UK"}, {"USA"}};
		}
	}

	/**********************************************************************/
}
