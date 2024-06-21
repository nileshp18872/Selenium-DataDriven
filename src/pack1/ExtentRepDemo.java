

package pack1;
	 
	
import library.Utility;
	 




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



	import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

	public class ExtentRepDemo 
	{

	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;


	@Test
	public void verifyBlogTitle()
	{
		
	 //System.setProperty("webdriver.gecko.driver","E:\\NILESH SELENIUM\\MY SELENIUM\\SOFTWARES\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
		report=new ExtentReports("E:\\Temp\\EXTENTREPORT_OUTPUT\\Tridhya.html");

	logger=report.startTest("Verify TridhyaTech HomePage Title");

		  	   
	  driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	logger.log(LogStatus.INFO, "Browser started ");

	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	
	driver.get("https://tridhyatech.com");
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	
	
	logger.log(LogStatus.INFO, "Application is up and running");

	String title=driver.getTitle();
	
	Assert.assertTrue(title.contains("Enterprise Digital Transformation Services and Solutions | Tridhya Tech")); 

	logger.log(LogStatus.PASS, "Title verified as expected: Enterprise Digital Transformation Services and Solutions | Tridhya Tech");
		
	}
	

	@AfterMethod
	public void tearDown(ITestResult result)
	{
		
	if(result.getStatus()==ITestResult.SUCCESS)
	{

		String screenshot_path=Utility.captureScreenshot(driver, result.getName());
		String image= logger.addScreenCapture(screenshot_path);
		logger.log(LogStatus.PASS, "Title verification as expected", image);
	}
	    	
		
	if(result.getStatus()==ITestResult.FAILURE)
	{

	String screenshot_path=Utility.captureScreenshot(driver, result.getName());
	String image= logger.addScreenCapture(screenshot_path);
	logger.log(LogStatus.FAIL, "Title verification nit as expected", image);


	}
	
	
	report.endTest(logger);
	report.flush();
	
	//driver.get("D:\\NILESH SELENIUM\\EXTENTREPORT_OUTPUT\\mycc1.html");
	}


	}