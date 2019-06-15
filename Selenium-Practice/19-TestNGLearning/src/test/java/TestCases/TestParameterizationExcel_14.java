package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class TestParameterizationExcel_14 {

	@Test(dataProvider = "getCredentials")
	public void login(String unm, String pass) {
			System.out.println(unm);
			System.out.println(pass);
	}

	@DataProvider
	public Object[][] getCredentials() {
		ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\testdata\\testdata.xlsx");
		String sheetName = "LoginTest";
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
		System.out.println(excel.getCellData(sheetName, 2, 0));
		System.out.println("Total rows are : " + rowNum + " and total cols are : " + colNum);
		Object[][] data = new Object[rowNum - 1][colNum];
		for (int rows = 2; rows <= rowNum; rows++) {
			for (int cols = 0; cols < colNum; cols++) {
				data[rows - 2][cols] = excel.getCellData(sheetName, cols, rows);
			}
		}
		return data;
	}
}
