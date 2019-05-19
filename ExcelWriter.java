package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriter {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		String actualvalue="15.717";
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet s=wb.getSheet("Sheet3");
		String expectedvalue=s.getRow(1).getCell(3).getStringCellValue();
		if(expectedvalue.equalsIgnoreCase(actualvalue)){
			
		}
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
		wb.write(fo);
		fo.close();fi.close();
	}

}
