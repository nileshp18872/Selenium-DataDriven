package dataDriven;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;


public class test2 {
public WebDriver driver;
	
	By email = By.xpath(".//input[@id='email']");
	By submitbtn = By.xpath(".//button[@type='submit']");
	By passteams = By.xpath(".//input[@name='passwd']");
	By signInbtn = By.xpath(".//input[@id='idSIButton9']");
	By yesteamsbtn = By.xpath(".//input[@id='idSIButton9']");
	By noteamsbtn = By.xpath(".//input[@id='idBtn_Back']");
	By profileicon = By.xpath(".//span[@class='ant-avatar-string']");
	By userSelectMenu = By.xpath(".//span[@class='ant-select-selection-item']");
	By userSelectfinal = By.xpath("(.//div[text()='Fixed Deposits'])[2]");
	By accountMenu = By.xpath(".//div[text()='Accounts']");
	By roletab = By.xpath(".//div[@col-id='role_name']");
	
	public WebDriver verifyLogin(String userName, String password) throws IOException, InterruptedException {
		
		System.out.println("----- Login ------");
		
		driver = new ChromeDriver();
		driver.get("https://qa.talentsavvy.com/login");
		
		driver.findElement(email).sendKeys("mahesh@bsaas.us");
		driver.findElement(submitbtn).click();
					
		driver.findElement(passteams).sendKeys("P99Soft.com");
		driver.findElement(signInbtn).click();
		driver.findElement(noteamsbtn).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		System.out.println("*******Login - SUCCESS*********");
		
		driver.findElement(userSelectMenu).click();
		driver.findElement(userSelectfinal).click();
		driver.findElement(accountMenu).click();
		
		/*
		 * List<WebElemnet> roleColumn=driver.findElements(roletab);
		 * System.out.println("Row size: "+ roleColumn.size());
		 * //roleColumn.get(roleColumn.size()-1).click(); Thread.sleep(3000);
		 * roleColumn.get(roleColumn.size()-1).sendKeys("Tester");
		 * roleColumn.get(roleColumn.size()-1).sendKeys(Keys.ENTER);
		 */
		
		
		return driver;
	}



	
}
