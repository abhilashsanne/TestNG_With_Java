package TestNg_Java_CheatSheet.DataDrivenAnnotationTests;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNg_Java_CheatSheet.SimpleTestNgTests.DifferetClass_DataProvider;

public class DataDriven_DataProvider_Tests {

	/**********************************************************************/

	/*
	 * This test will run 3 times as the data provider 'Books_DataProvider' has
	 * 3 rows of data
	 */
	@Test(dataProvider = "Books_DataProvider")
	public void DataDriven_Books_Test(String author,
			String bookTitle) {

		System.out.println("The book: " + bookTitle
				+ " is authored by ->" + author);
	}

	/*
	 * DataProvider resides in the same class where test method is or its base
	 * class To put it in some other class we need to make data provider method
	 * as static and in test method we need to add an attribute
	 * dataProviderClass in @Test annotation.
	 */
	@DataProvider(name = "Books_DataProvider")
	public Object[][] getDataFromDataprovider() {
		return new Object[][]{
				{"Robin Sharma", "The Leader Who Had No Title"},
				{"Joseph Murphy", "TELEPSYCHICS"},
				{"James Allen", "As a Man Thinketh"}};
	}

	/**********************************************************************/

	@Test(dataProvider = "Single_DataProvider")
	public void DataDriven_SameProvider_Test1(String message) {

		System.out.println("Hello!! " + message);
	}

	@Test(dataProvider = "Single_DataProvider")
	public void DataDriven_SameProvider_Test2(String dayPosition,
			String dayName) {

		System.out.println("This is " + dayName + " it is "
				+ dayPosition + " of the week");
	}

	/*
	 * SAME DataProvider behaves differently with different test method
	 */
	@DataProvider(name = "Single_DataProvider")
	public Object[][]
			useSingleDataProviderForMultipleTests(Method testMethod) {
		if (testMethod.getName()
				.equalsIgnoreCase("DataDriven_SameProvider_Test2")) {
			return new Object[][]{{"1st", "Monday"},
					{"3rd", "Wednesday"}, {"5th", "Friday"}};
		} else if (testMethod.getName()
				.equalsIgnoreCase("DataDriven_SameProvider_Test1")) {
			return new Object[][]{{"Good Morning!!"},
					{"Good Afternoon"}, {"Good Evening"},
					{"Good Night"}};
		} else
			return null;
	}

	/**********************************************************************/

	@Test(dataProvider = "RandomData", dataProviderClass = DifferetClass_DataProvider.class)
	public void DataDriven_DifferenClassDataProvider_Test(
			String chars,
			String numbers) {

		System.out.println("This is " + chars
				+ " it is represented in numbers as" + numbers);
	}

	/**********************************************************************/

}
