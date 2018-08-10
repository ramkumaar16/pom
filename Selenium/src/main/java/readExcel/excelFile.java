package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelFile {
	


	public Object[][] main(String excelFileName) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook(excelFileName);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		System.out.println(lastRowNum);
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		Object[][] data = new Object[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j <lastCellNum; j++) {
				
				XSSFCell cell = row.getCell(j);
				data[i-1][j] =  cell.getStringCellValue();
				System.out.println(data[i-1][j]);
			}
			
            ///return data;
		}
		wbook.close();
		return data;	
	}

}
