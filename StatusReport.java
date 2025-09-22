package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StatusReport {

	@Test
	
	   public void status() {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost:5173/");
		System.out.println("The title of the page" + driver.getTitle());
	    
	    driver.findElement(By.id("username")).sendKeys("aditya");
	 
	    driver.findElement(By.id("password")).sendKeys("Test@123");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click(); //login
		   
		   driver.findElement(By.xpath("/html/body/div/nav/div[1]/a[4]")).click();
		   
           WebElement status = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/select"));
		   
		   Select oprn = new Select(status);           
		   
		//  oprn.selectByVisibleText("TO_DO");            //To Do status shows
		  
		 // oprn.selectByVisibleText("IN_PROGRESS");     //IN_Progress status Shows

		  oprn.selectByVisibleText("DONE");               //Done Status Shows
		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/button")).click();    //Generate 
		  
		  
		  
		  
		  
		  
		   
	}
}
