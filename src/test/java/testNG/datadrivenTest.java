package testNG;

import java.io.FileInputStream;
import org.apache.poi.ss.util.NumberToTextConverter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.CellType;
public class datadrivenTest {

	public ArrayList<String> getData(String testcaseName) throws IOException
		{
		ArrayList<String> ar =new ArrayList<String>();
		FileInputStream fis = new FileInputStream("E:\\Testdata.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		
		int totalsheets=workbook.getNumberOfSheets();
		for(int i=0;i<totalsheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Testdata")) {//workbook is collection of sheets
				XSSFSheet sheet=workbook.getSheetAt(i);
				//Identify Testcases coloum by scanning the entire 1st row
				java.util.Iterator<Row> rows=sheet.rowIterator();//sheet is a collection of rows
				Row firstrow =rows.next();
				int k=0;int column = 0;
				java.util.Iterator<Cell> firstcell=firstrow.cellIterator();//row is collection of cells
				while(firstcell.hasNext()) {
					Cell value=firstcell.next();
					System.out.println(value);
					if(value.getStringCellValue().equalsIgnoreCase("Name")) {
						column=k;
						
					}
					k++;
				}	System.out.println(column);	
			////once coloumn is identified then scan entire testcase
				while(rows.hasNext()) {
					Row re=rows.next();
					if(re.getCell(column).getStringCellValue().equalsIgnoreCase("Amitesh"))
					{
						java.util.Iterator<Cell> cells=re.cellIterator();
						while(cells.hasNext()) {
							Cell c=cells.next();
							if(c.getCellType()==c.CELL_TYPE_STRING) {
								ar.add((cells.next().getStringCellValue()));
							}
							else {
								ar.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
					
				}
				
		}
		
	
	}
	return ar;	
	}
	

	
}
