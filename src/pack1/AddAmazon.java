

package pack1;
	 
	

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.bcel.classfile.Utility;
//import library.Utility;
//import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AddAmazon 
	{

	//private static final ITestResult String = null;
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;

    String screen; 
    
    
    
	@Test(priority = 0)
    public void verifyWebsite() throws InterruptedException
	{
		
	 //System.setProperty("webdriver.gecko.driver","E:\\NILESH SELENIUM\\MY SELENIUM\\SOFTWARES\\geckodriver\\geckodriver.exe");
	 report=new ExtentReports("E:\\TEMP\\EXTENTREPORT_OUTPUT\\TRIDHYA\\AddCartAmazon" + ".html");

	logger=report.startTest("Verify Amazon.in WebSite Open");
	//System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	  
   	  logger.log(LogStatus.INFO, "Browser started ");
  	  driver.get("http://amazon.in");
  	   
	  logger.log(LogStatus.INFO, "Application is up and running");
  	   
   	  logger.log(LogStatus.PASS, "Website Open Successfully");
   	report.endTest(logger);
   	
    driver.get("http://amazon.in");	
	  logger=report.startTest("Best Seller");
	    Thread.sleep(5000);  
	    driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[2]/a")).click();
		
		//Computer Accessories
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[10]/a")).click();
		
	  logger.log(LogStatus.PASS, "Click Best Seller -> Pass");
	  
    screen = "BestSeller";
    Thread.sleep(5000);
    String screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  String image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "Today Deals Page ScreenShot", image);
	  report.endTest(logger);
	
	  logger=report.startTest("Tablets");
	  
	    //Tablets
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div[14]/a")).click();
		//*[@id="CardInstance338qJHpEt8IpvQmIib1_eA"]/div[2]/div[2]/div[14]/a
		
		//Mi Pad 5
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"B09XXZXQC1\"]/a[2]/span/div")).click();
		//*[@id="B09XXZXQC1"]/a[2]/span/div  
		   
	   
	  logger.log(LogStatus.PASS, "Tablet MI Pad 5 -> Pass");
	  	  
	  screen = "Tablet";
	  //Thread.sleep(5000);
	  screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "ComputerAccessories Page ScreenShot", image);
	  report.endTest(logger);
	
      logger=report.startTest("AddtoCart1");
	 
	  Thread.sleep(5000);
	   driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[5]/div[4]/div[1]/div[3]/div/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[33]/div[1]/span/span/span/input\r\n")).click();
		 	   
	  logger.log(LogStatus.PASS, "Add to Cart Item 1 -> Pass");
	  
	  screen = "AddtoCart1";
	  //Thread.sleep(5000);
	  screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "Add to Cart Item 1", image);
	  report.endTest(logger);

	  //Thread.sleep(5000);
	  logger=report.startTest("ViewCart111");
	  
		//Move to Cart
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[2]/header/div/div[1]/div[3]/div/a[4]")).click();
		
		System.out.println(driver.getTitle());	

	  
	  logger.log(LogStatus.PASS, "View Cart Items -> Pass");
	  
	  screen = "ViewCart111";
	  //Thread.sleep(5000);
	  screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "View Cart Items", image);
	  report.endTest(logger);
	  report.flush();

	  logger=report.startTest("VerifyContactUsFB");
	  
		//Contact us with FB
			Thread.sleep(5000);
			driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[1]/div/div[3]/ul/li[1]/a\r\n")).click();
			
			
			System.out.println(driver.getTitle());	
		  
		  logger.log(LogStatus.PASS, "VerifyContactUs Page -> Pass");
		  
		  screen = "VerifyContactUs";
		  screenshot_path= library.Utility.captureScreenshot(driver, screen);
		  //String screenshot_path=Utility.captureScreenshot(driver, screen);
		  image= logger.addScreenCapture(screenshot_path);
		  logger.log(LogStatus.PASS, "ContactUs Page ScreenShot", image);
		  report.endTest(logger);
		  
		  report.flush();
		  //SendReportEmail.sendEmail();

	}
	/*
	@Test(priority = 1)
	public void BestSeller() throws InterruptedException
	{
		
	  driver.get("http://amazon.in");	
	  logger=report.startTest("Best Seller");
	    Thread.sleep(5000);  
	    driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[2]/a")).click();
		
		//Computer Accessories
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[10]/a")).click();
		
	  logger.log(LogStatus.PASS, "Click Best Seller -> Pass");
	  
      screen = "BestSeller";
      //Thread.sleep(5000);
      String screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  String image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "Today Deals Page ScreenShot", image);
	  report.endTest(logger);
	}  
	*/
	
	/*
	@Test(priority = 2)
	public void Tablets() throws InterruptedException
	{
	  logger=report.startTest("Tablets");
	  
	    //Tablets
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div[14]/a")).click();
		//*[@id="CardInstance338qJHpEt8IpvQmIib1_eA"]/div[2]/div[2]/div[14]/a
		
		//Mi Pad 5
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"B09XXZXQC1\"]/a[2]/span/div")).click();
		//*[@id="B09XXZXQC1"]/a[2]/span/div  
		   
	   
	  logger.log(LogStatus.PASS, "Tablet MI Pad 5 -> Pass");
	  	  
	  screen = "Tablet";
	  //Thread.sleep(5000);
	  String screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  String image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "ComputerAccessories Page ScreenShot", image);
	  report.endTest(logger);
	}
	*/
	/*
	@Test(priority = 3)
	public void AddtoCart1() throws InterruptedException
	{
	  logger=report.startTest("AddtoCart1");
	  
	  Thread.sleep(5000);
	   driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[5]/div[4]/div[1]/div[3]/div/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[33]/div[1]/span/span/span/input\r\n")).click();
		 	   
	  logger.log(LogStatus.PASS, "Add to Cart Item 1 -> Pass");
	  
	  screen = "AddtoCart1";
	  //Thread.sleep(5000);
	  String screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  String image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "Add to Cart Item 1", image);
	  report.endTest(logger);
	}
	*/
    /*
	@Test(priority = 6)
	public void ViewCart111() throws InterruptedException
	{
		
	  //Thread.sleep(5000);
	  logger=report.startTest("ViewCart111");
	  
		//Move to Cart
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[2]/header/div/div[1]/div[3]/div/a[4]")).click();
		
		System.out.println(driver.getTitle());	

	  
	  logger.log(LogStatus.PASS, "View Cart Items -> Pass");
	  
	  screen = "ViewCart111";
	  //Thread.sleep(5000);
	  String screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  String image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "View Cart Items", image);
	  report.endTest(logger);
	  report.flush();
	}

	*/

	/*
	@Test(priority = 15)
	public void verifyContactUs() throws InterruptedException 
	//EmailException
	{
	  logger=report.startTest("VerifyContactUsFB");
	  
	//Contact us with FB
		Thread.sleep(5000);
		driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[1]/div/div[3]/ul/li[1]/a\r\n")).click();
		
		
		System.out.println(driver.getTitle());	
	  
	  logger.log(LogStatus.PASS, "VerifyContactUs Page -> Pass");
	  
	  screen = "VerifyContactUs";
	  String screenshot_path= library.Utility.captureScreenshot(driver, screen);
	  //String screenshot_path=Utility.captureScreenshot(driver, screen);
	  String image= logger.addScreenCapture(screenshot_path);
	  logger.log(LogStatus.PASS, "ContactUs Page ScreenShot", image);
	  report.endTest(logger);
	  
	  report.flush();
	  //SendReportEmail.sendEmail();
	}

	*/
	/*
	public void tearDown() throws EmailException
	{
		
		
	//if(result.getStatus()==ITestResult.FAILURE)
	//{
    //String screenshot_path= library.Utility.captureScreenshot(driver, screen);
	//String screenshot_path=Utility.captureScreenshot(driver, result.getTestName());
	//String image= logger.addScreenCapture(screenshot_path);
	//logger.log(LogStatus.PASS, "Home Page ScreenShot", image);


	//}
    
	//report.endTest(logger);
	//report.flush();
	
	 //SendReportEmail.sendEmail();
	
	//driver.get("D:\\NILESH SELENIUM\\EXTENTREPORT_OUTPUT\\mycc1.html");
	}
*/

	}