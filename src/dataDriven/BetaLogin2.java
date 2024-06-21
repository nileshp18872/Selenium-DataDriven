package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BetaLogin2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//define file path in Java class
			FileInputStream fi = new FileInputStream("E:\\MyPropertiesFile.Properties");
			Properties storage = new Properties();
			//load the propertiesfile
			storage.load(fi);
			
			driver.get(storage.getProperty("ClientURL"));
			Thread.sleep(5000); 
			driver.findElement(By.xpath(storage.getProperty("UserEmail"))).sendKeys(storage.getProperty("UserEmailVal"));
			driver.findElement(By.xpath(storage.getProperty("UserPS"))).sendKeys(storage.getProperty("UserPSVal"));
			Thread.sleep(5000);  
			driver.findElement(By.xpath(storage.getProperty("LoginBtn"))).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath(storage.getProperty("img"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(storage.getProperty("LogoutBtn"))).click();
	        driver.quit();
	        
	
	}

}
