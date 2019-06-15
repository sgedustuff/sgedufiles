package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTestClass;

public class TestUtils extends BaseTestClass{
	
	public static String filename;
	
	public static Object[][] getData(String sheetName)
	{
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
		Object[][] data = new Object[rowNum - 1][colNum];
		for (int rows = 2; rows <= rowNum; rows++) {
			for (int cols = 0; cols < colNum; cols++) {
				data[rows - 2][cols] = excel.getCellData(sheetName, cols, rows);
			}
		}
		return data;
	}
	
	public static void captureScreenShot() throws IOException
	{
		Date d1 = new Date(); 
		filename = d1.toString().replace(":", "_").replace(" ", "_") + ".jpg";		
		TakesScreenshot tss = (TakesScreenshot) driver;
		File fss = tss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fss, new File(".\\target\\surefire-reports\\html\\" + filename));
	}
}
