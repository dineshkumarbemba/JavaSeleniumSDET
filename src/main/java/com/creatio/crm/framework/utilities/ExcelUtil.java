package com.creatio.crm.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
public static String readData(String fileName,String sheetName,int rowNo,int cellNo) {
	String value="";
	
	try {
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\Files\\"+fileName);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheetName);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row=sheet.getRow(rowNo);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell=row.getCell(cellNo);
				
				CellType celltype=cell.getCellType();
				switch(celltype) {
				case STRING:
					value=cell.getStringCellValue();
					break;
					
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						SimpleDateFormat sdf= new SimpleDateFormat("DD-MM-YYYY");
						value=sdf.format(cell.getDateCellValue());
					}
					else {
						double d=cell.getNumericCellValue();
						long l=(long)d;
						value =String.valueOf(l);
					}
					break;
					default :
						break;
				}
			}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return value;
}
}
