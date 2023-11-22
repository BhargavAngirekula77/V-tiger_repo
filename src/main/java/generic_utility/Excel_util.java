package generic_utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_util {
	public String getExcelData(String sheet,int row,int cell) throws Exception {
	FileInputStream fish=  new FileInputStream(IConstant_utility.Excel);
	Workbook book =WorkbookFactory.create(fish);
	Sheet she=  book.getSheet(sheet);
	DataFormatter form= new DataFormatter();
	String value=form.formatCellValue(she.getRow(row).getCell(cell));
	return value;
	
	}
	

}
