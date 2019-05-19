package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet s=wb.getSheet("Sheet3");
		int rows_count =s.getLastRowNum();
		int cols_count=s.getRow(0).getLastCellNum();
		
		for(int i=0;i<rows_count;i++){
			
			Row r=s.getRow(i);
			
			for(int j=0;j<cols_count;j++){
				
				Cell c=r.getCell(j);
				String valus=c.getStringCellValue();
				System.out.println(valus);
			}
			
			
		}

		wb.close();fi.close();
	}

}
