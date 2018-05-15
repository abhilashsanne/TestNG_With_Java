package DataDrivenAnnotationTests;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import jxl.*; //Using jxl jar for reading Excel files
import jxl.read.biff.BiffException;

public class DataDriven_Excel_Tests {

	@Test(dataProvider = "ExcelTestData") //Using the dataProvider 'ExcelTestData'
	public void DataDriven_Addition_ExcelTest(String val1, String val2, String expectedSum) {

		// NOTE: The test method has 3 parameters because the @DataProvider
		// (ExcelTestData) has data in a table containing three columns
		int a = Integer.parseInt(val1);
		int b = Integer.parseInt(val2);
		Assert.assertEquals(a + b, expectedSum, "Sum of two integers should match expected");
	}

	// Reading the Excel file and generating the array of data
	@DataProvider(name = "ExcelTestData") // Naming the DataProvider as 'ExcelTestData'
	public Object[][] readExcel() throws BiffException, IOException {
		File f = new File("C:/LocalPath/TestDataFile.xls"); // location and name of excel file
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int rows = s.getRows();
		int columns = s.getColumns();

		String inputData[][] = new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell c = s.getCell(j, i);
				inputData[i][j] = c.getContents();
			}
		}
		return inputData;
	}
}
