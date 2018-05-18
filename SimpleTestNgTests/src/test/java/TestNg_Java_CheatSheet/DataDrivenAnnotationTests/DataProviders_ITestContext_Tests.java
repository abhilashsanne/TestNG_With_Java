package TestNg_Java_CheatSheet.DataDrivenAnnotationTests;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_ITestContext_Tests {
	// There are two type of parameters supported by DataProvider method.

	// Method- If the SAME DataProvider should behave differently with different
	// test method , use Method parameter.

	// ITestContext- It can use to create different parameters for test cases
	// based on groups.

	/**********************************************************************/
	// ITestContext to vary parameter values based on Test Methods, hosts,
	// configurations of the test.

	/*
	 * We have 2 groups A & B Each test method is assigned to a group If value
	 * of group is A, a particular data set is returned If value of group is B,
	 * another data set is returned
	 */
	/**********************************************************************/

	// Run this file using DataProviders_ITestContext_Tests.xml
	// If you directly run your testNG class, it will first call data provider
	// which can't get groups information as groups are not available. But
	// instead if you call this class via testng.xml, it will have groups info
	// available with ITestContext.
	@Test(dataProvider = "getDataForGroups", groups = "A")
	public void testMethod_Group_A(String author, String searchKey) {
		System.out
				.println("Group A, " + author + " ::::" + searchKey);
	}

	@Test(dataProvider = "getDataForGroups", groups = "B")
	public void testMethod_Group_B(String searchKey,
			String unusedParam) {
		System.out.println(
				"Group B, Single Parameter ::::" + searchKey);

	}

	/**
	 * Here the DAtaProvider will provide Object array on the basis on
	 * ITestContext
	 */
	@DataProvider(name = "getDataForGroups")
	public Object[][] getDataForGroups(ITestContext c) {
		Object[][] groupArray = null;
		for (String group : c.getIncludedGroups()) {
			if (group.equalsIgnoreCase("A")) {
				groupArray = new Object[][]{{"Hyderabad", "India"},
						{"London", "UK"}, {"New York", "USA"}};
				break;
			} else if (group.equalsIgnoreCase("B")) {
				groupArray = new Object[][]{{"India"}, {"UK"},
						{"USA"}};
			}
			break;
		}
		return groupArray;
	}
	/**********************************************************************/

}
