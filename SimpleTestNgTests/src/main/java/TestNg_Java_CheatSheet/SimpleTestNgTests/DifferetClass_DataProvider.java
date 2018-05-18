package TestNg_Java_CheatSheet.SimpleTestNgTests;

import org.testng.annotations.DataProvider;

public class DifferetClass_DataProvider {

	@DataProvider(name = "RandomData")
	public Object[][] getDataFrom_DifferentClass() {
		return new Object[][]{{"ABC", "123"}, {"DEF", "456"},
				{"GHI", "789"}};

	}
}
