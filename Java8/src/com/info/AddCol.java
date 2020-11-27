package com.info;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddCol {

	public static void main(String[] args) {

		try {
			FileInputStream excelFile = new FileInputStream(new File("C:\\Users\\Admin\\Desktop\\Springs\\New\\Stage.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			XSSFSheet my_worksheet = workbook.getSheetAt(0);
			Row row = my_worksheet.getRow(0);
			int numOfColumns = row.getLastCellNum();
			Iterator<Row> iterator = null;
			for(int i = 0; i<numOfColumns;i++){
				iterator = datatypeSheet.iterator();
				while (iterator.hasNext()) {
					Row currentRow = iterator.next();
					Cell cell = currentRow.createCell(currentRow.getLastCellNum(), Cell.CELL_TYPE_STRING);
					if(currentRow.getRowNum() == 0){
						cell.setCellValue(currentRow.getCell(i).toString()+"_Error_Description");
					}
				}
			}
			FileOutputStream fileOut = new FileOutputStream(new File("C:\\Users\\Admin\\Desktop\\Springs\\New\\Stage.xlsx"));
			workbook.write(fileOut);
			fileOut.close();
		} 
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}


