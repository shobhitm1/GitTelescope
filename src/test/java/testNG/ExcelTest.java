package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\Testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sumsheets=workbook.getNumberOfSheets();
		for(int i=0;i<sumsheets;i++) { 
			if(workbook.getSheetName(i).equalsIgnoreCase("Testdata")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				java.util.Iterator<Row> rows=sheet.rowIterator();
				Row firstrow=rows.next();
				int k=0;int column=0;
				java.util.Iterator<Cell> cell=firstrow.cellIterator();
				while(cell.hasNext()) {
					Cell value=cell.next();
					System.out.println(value);
					if(value.getStringCellValue().equalsIgnoreCase("City")) {
						column=k;
					}
					k++;
				}
				System.out.println(column);
				System.out.println("Hello world");
			}
		
		}
	}

}
