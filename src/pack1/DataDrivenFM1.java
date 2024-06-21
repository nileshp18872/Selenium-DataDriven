package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Constants;
import utilities.ExcelUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DataDrivenFM1 {

	//creating object of ExcelUtils class
    static ExcelUtils excelUtils = new ExcelUtils();
    
    //using the Constants class values for excel file path 
    static String excelFilePath =Constants.Path_TestData+Constants.File_TestData;

    public static  void main(String args[]) throws IOException {
        //set the Chrome Driver path
        System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
        
        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        //launching the specified URL
       // driver.get("http://162.243.162.181/beta-booster/public/login");
        
        //Identify the WebElements for the student registration form
       // WebElement user=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[2]/div/input"));
        //WebElement pass=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[1]/div/input"));
        //WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[3]/button"));
        
        
        //calling the ExcelUtils class method to initialise the workbook and sheet
        excelUtils.setExcelFile(excelFilePath,"MyData");

        for(int i=1;i<=excelUtils.getRowCountInSheet();i++){
        
        	String user1 = excelUtils.getCellData(i,0);
        	String pass2 = excelUtils.getCellData(i,1);
        	System.out.println(user1 + "---" + pass2 );
        	
        }
           }
	
	
}
