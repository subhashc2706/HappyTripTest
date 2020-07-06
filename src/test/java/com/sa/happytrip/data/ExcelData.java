package com.sa.happytrip.data;

import java.io.FileInputStream;


import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelData {

	@DataProvider(name="TestData")
	public Object[][] ExcelDatas() throws BiffException, Exception
	{
		String filepath="C:\\Workspace\\Itr2\\Happytrip_test\\src\\test\\resources\\Data.xls";
		
		//read excel data
		FileInputStream Excelfile=new FileInputStream(filepath);
		
		//Read workbook
		Workbook Exbook=Workbook.getWorkbook(Excelfile);
		
		//read sheet
		Sheet Exsheet=Exbook.getSheet("TestData");
		
		
		//read rows and column in a sheet
		int Rows =Exsheet.getRows();
		int Columns=Exsheet.getColumns();
		String Testdata[][]=new String [Rows-1][Columns];
		
		int count=0;
		for(int i=1;i<Rows;i++) {
			for(int j=0;j<Columns;j++) {
				Cell Excell=Exsheet.getCell(j, i);
				
				Testdata[count][j]=Excell.getContents();
				
			}
			count++;	
	}
		Excelfile.close();
		return Testdata;
		
	}
}
