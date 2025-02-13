package apiLearning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testing {

	public static String[][] main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wd = new XSSFWorkbook("./excelSheet/filename.xlsx");
		
		XSSFSheet sheetValue = wd.getSheetAt(0);
		
		int RowNum = sheetValue.getLastRowNum();
		
		short CellNum = sheetValue.getRow(1).getLastCellNum();
		
		String[][] data = new String [RowNum][CellNum];
		
		for(int i=1;i<=RowNum;i++) {
			for(int j=0;j<=CellNum;i++) {
				String stringCellValue = sheetValue.getRow(i).getCell(i).getStringCellValue();
				data[i-1][j]=stringCellValue;
				
			}
		}
		wd.close();
		return data;
		
	}

}


