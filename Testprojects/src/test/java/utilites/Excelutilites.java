package utilites;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilites {
	
 //static String FILE_PATH="Products.xlsx";
 	
 	public static void writeToExcel(List<String[]> data) {
 		
 		XSSFWorkbook workbook = new XSSFWorkbook();
 		XSSFSheet sheet = workbook.createSheet("Products");
 			
 		int rowNum=1;
 		for(String[] rowData:data) {
 			Row row = sheet.createRow(rowNum++);
 			for(int i=0;i< rowData.length; i++) {
 				row.createCell(i).setCellValue(rowData[i]);
 			}
 		}
 		try (FileOutputStream fos = new FileOutputStream("Data.xlsx")){
 			workbook.write(fos);
 			workbook.close();
 		}catch(IOException e) {
 			e.printStackTrace();
 		}
 	}

}
