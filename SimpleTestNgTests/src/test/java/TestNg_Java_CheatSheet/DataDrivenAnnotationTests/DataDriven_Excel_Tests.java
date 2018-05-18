package TestNg_Java_CheatSheet.DataDrivenAnnotationTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNg_Java_CheatSheet.SimpleTestNgTests.UtilsForDataProvider;
import jxl.read.biff.BiffException;

public class DataDriven_Excel_Tests {

	@Test(dataProvider = "ExcelTestData") // Using the dataProvider
											// 'ExcelTestData'
	public void DataDriven_Addition_ExcelTest(String val1,
			String val2,
			String expectedSum) {

		// NOTE: The test method has 3 parameters because the @DataProvider
		// (ExcelTestData) has data in a table containing three columns
		int a = Integer.parseInt(val1);
		int b = Integer.parseInt(val2);
		Assert.assertEquals(a + b, expectedSum,
				"Sum of two integers should match expected");
	}

	// Reading the Excel file and generating the array of data
	@DataProvider(name = "ExcelTestData") // Naming the DataProvider as //
											// 'ExcelTestData'
	Object[][] getDataFromDataProvider() throws BiffException,
			IOException {
		return UtilsForDataProvider
				.readExcel("C:/LocalPath/TestDataFile.xls", 0);
	}

}
