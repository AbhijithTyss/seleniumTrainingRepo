package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1: create FIS/FR type object
		FileInputStream fis=new FileInputStream("./testdata/testScriptData.xlsx");
		
		//step 2: create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step 3: call read method
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(3).getLocalDateTimeCellValue();
		Row row1 = workbook.getSheet("Sheet1").getRow(1);
		double number = row1.getCell(4).getNumericCellValue();
		int actNumber=(int) number;
		
		boolean status = row1.getCell(5).getBooleanCellValue();
		
		System.out.println(date);
		System.out.println(actNumber);
		System.out.println(status);
		
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
	}

}
