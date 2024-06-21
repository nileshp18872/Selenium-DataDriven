package dataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.Table.Cell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class pruthiraj {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("E:\\Data\\DataDrivenExcel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis) ;
	
		int sheets=workbook.getNumberOfSheets();
		for (int i=0;i<sheets;i++)
		{
		if(workbook.getSheetName (i).equalsIgnoreCase ("testdata"))
		{
		XSSFSheet sheet=workbook. getSheetAt(i);
		
		Iterator<Row> rows= sheet.iterator();
		Row firstrow= rows.next ();
		Iterator<org.apache.poi.ss.usermodel.Cell> ce=firstrow.cellIterator();//row is collection of cells
		int k = 0;
		int coloumn = 0;
		while(ce.hasNext () )
		{
		//Cell value=(Cell) ce.next ();
		//if (((org.apache.poi.ss.usermodel.Cell) value).getStringCellValue().equalsIgnoreCase("Data2"))
		//{
		//coloumn=k;	
		//}
		k++;
		}
		System.out.println(coloumn);

}

}
}

		
	}


