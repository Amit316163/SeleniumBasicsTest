package excelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead3 {
	
	//To read a excel sheet 
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataRead3(String excelPath) throws Exception {
		try {
			File file=new File (excelPath);
			FileInputStream fis=new FileInputStream(file);
			
			 wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public String getData(int sheetNum,int rowNum,int cellNum) {
		 sheet=wb.getSheetAt(sheetNum);
		String data=sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
	}

}
