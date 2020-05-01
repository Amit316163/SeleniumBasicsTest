package excelReading;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead2 {
	
	public static void main(String[] args) throws Exception {
		
		File src=new File("C:\\Users\\SONY\\Desktop\\ZohoCRMData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowCount=sheet1.getLastRowNum();
		System.out.println(rowCount);
		
		for(int i=0;i<=rowCount;i++) {
			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
			
		}
	
		
		
	}

}
