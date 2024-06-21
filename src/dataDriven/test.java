package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
System.out.println("----- Login ------");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.talentsavvy.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(email).sendKeys("mahesh@bsaas.us");
		driver.findElement(submitbtn).click();
		
		Thread.sleep(5000);			
		driver.findElement(passteams).sendKeys("P99Soft.com");
		driver.findElement(signInbtn).click();
		driver.findElement(noteamsbtn).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		System.out.println("*******Login - SUCCESS*********");
		Thread.sleep(5000);	
		driver.findElement(userSelectMenu).click();
		Thread.sleep(5000);	
		driver.findElement(userSelectfinal).click();
		Thread.sleep(5000);	
		driver.findElement(accountMenu).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@id=\"tableID\"]/div/div/div/div[1]/div[2]/div[3]/div[1]/div/div[1]/div[3]/div[1]")).sendKeys("Project Manager");
		
		/*
		 * List<WebElemnet> roleColumn=driver.findElements(roletab);
		 * System.out.println("Row size: "+ roleColumn.size());
		 * //roleColumn.get(roleColumn.size()-1).click(); Thread.sleep(3000);
		 * roleColumn.get(roleColumn.size()-1).sendKeys("Tester");
		 * roleColumn.get(roleColumn.size()-1).sendKeys(Keys.ENTER);
		 */
	}

}
