package com.testleaf.utils;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	
	public static String[][] readData(String fileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+ fileName +".xlsx");
		
	
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowCount = ws.getLastRowNum();
		
		
		
		int cellCount  = ws.getRow(0).getLastCellNum();

		String[][] data = new String[rowCount][cellCount];
		
		
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j<cellCount; j++) {
				data[i-1][j] = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		
		wb.close();
		
		return data;
	}

}