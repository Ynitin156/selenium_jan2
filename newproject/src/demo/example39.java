package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class example39 
{

    @Test
    public void readsheet() throws IOException
	{
		File file = new File("C:\\Users\\HP\\Documents\\daat2.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
        int rowNum= sheet1.getLastRowNum()+1;
        for(int i=0;i<rowNum;i++)
         { 
        	   XSSFRow row = sheet1.getRow(i);
               for(int j=0;j<row.getLastCellNum();j++)
               {
	                String data=sheet1.getRow(i).getCell(j).getStringCellValue();
	                System.out.println(data);
               }

         }

}
		
			
				
	        	

}
