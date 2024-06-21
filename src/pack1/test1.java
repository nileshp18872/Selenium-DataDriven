package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://amazon.in");
			driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[2]/a")).click();
			
			//Computer Accessories
			Thread.sleep(5000);
			driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[10]/a")).click();
			
			//Tablets
			Thread.sleep(5000);
			driver.findElement(By.xpath("//html/body/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div[14]/a")).click();
			//*[@id="CardInstance338qJHpEt8IpvQmIib1_eA"]/div[2]/div[2]/div[14]/a
			
			//Mi Pad 5
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"B09XXZXQC1\"]/a[2]/span/div")).click();
			//*[@id="B09XXZXQC1"]/a[2]/span/div  
			
			//Add to Cart
			Thread.sleep(5000);
			driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[5]/div[4]/div[1]/div[3]/div/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[33]/div[1]/span/span/span/input\r\n")).click();
			
			
			//Move to Cart
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//html/body/div[2]/header/div/div[1]/div[3]/div/a[4]")).click();
			
			System.out.println(driver.getTitle());	

			//Contact us with FB
			Thread.sleep(5000);
			driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[1]/div/div[3]/ul/li[1]/a\r\n")).click();
			
			
			System.out.println(driver.getTitle());	

	}

}
