 package com.utilities

import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration

public class Validations {
	@Keyword
	public void demoWriteExcel(String strTest) throws IOException {
		String path = RunConfiguration.getProjectDir()
		FileInputStream fis = new FileInputStream(path + '\\Test Files\\WriteData.xlsx')
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet('UserDetails')
		XSSFRow row = sheet.getRow(1)
		int colNum = row.getLastCellNum()
		println('Total Number of columns: '+ colNum)
		println('Value of strTest is: '+ strTest )

		XSSFCell cell=null

		if(cell==null)
			cell=row.createCell(colNum)

		cell.setCellValue(strTest)
		FileOutputStream fos = new FileOutputStream(path + '\\Test Files\\WriteData.xlsx')
		workbook.write(fos)
		fos.close()
	}
}
