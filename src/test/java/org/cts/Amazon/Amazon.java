package org.cts.Amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Amazon {
		
		public static String data(int rowno,int colno) throws IOException {
 
			File f=new File("C:\\Users\\Janakiram\\eclipse-workspace\\Amazon\\Excel\\Amazon.xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(fis);
			Sheet s=w.getSheet("Sheet1");
			
			Row r=s.getRow(rowno);
			Cell c=r.getCell(colno);
			String name="";
			
			int type=c.getCellType();
			if(type==1)
			{
				name=c.getStringCellValue();
			}
			else
			{
				if(DateUtil.isCellDateFormatted(c))
				{
					Date d=c.getDateCellValue();
					SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
					name=sf.format(d);
				}
				
				else
				{
					double d=c.getNumericCellValue();
					long l=(long)d;
					name=String.valueOf(l);
					
				}
			}
		return name;
		
		}
		
}
