package excelReading;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {
	
	public static void main(String[] args) throws Exception {
		
		File src=new File("C:\\Users\\SONY\\Desktop\\ZohoCRMData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
	
		
		
	}

}
