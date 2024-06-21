package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\nilesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.manektech.com");
		
		driver.findElement(By.xpath("//html/body/main/header/div/nav/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"letstalkfrm\"]/div/div[1]/div/input")).sendKeys("Nilesh");

	}

}
