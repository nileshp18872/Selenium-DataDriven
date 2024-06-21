package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class BetaLogin {

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {
		// TODO Auto-generated method stub
		 //System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
		
		ATUTestRecorder recorder = new ATUTestRecorder("Rec1.mp4",false);
		 
		recorder.start();
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://162.243.162.181/beta-booster/public/login");
			Thread.sleep(5000); 
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[1]/div/input")).sendKeys("beta1-18nov@yopmail.com");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[2]/div/input")).sendKeys("Sit@1234");
			Thread.sleep(5000);  
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[3]/button")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[1]/div[4]/div/button/img")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[1]/div[4]/div/div/div/div/div[3]/button[2]")).click();
	        recorder.stop();
			driver.close();
	        
	        
	
	}

}
