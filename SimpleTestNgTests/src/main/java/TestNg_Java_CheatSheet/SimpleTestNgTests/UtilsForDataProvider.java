package TestNg_Java_CheatSheet.SimpleTestNgTests;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UtilsForDataProvider {

	public static Object[][] readExcel(String workbookPath,
			int sheetNumber) throws BiffException,
			IOException {
		File f = new File("C:/LocalPath/TestDataFile.xls"); // location and name
															// of excel file
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
