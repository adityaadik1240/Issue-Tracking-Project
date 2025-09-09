package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	
	@Test
	
	public void login() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost:5173/");
		
	    System.out.println("The title of the page" + driver.getTitle());
	    
	   driver.findElement(By.id("username")).sendKeys("aditya");
	    driver.findElement(By.id("password")).sendKeys("Test@123");

	    
	    Thread.sleep(3000);
	    
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();
	   
	/*   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/a")).click();      //Reset Password
	   
	   driver.findElement(By.id("username")).sendKeys("aditya");
	   driver.findElement(By.xpath("//*[@id=\"newPassword\"]")).sendKeys("Aditya@1234");
	   
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();
	   
	   //driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[3]/ul/li/a")).click(); */
	   
	}
	
	
}
