package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AttendanceReport {
	
	@Test
	
	public void report() throws InterruptedException {
		
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
	    
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();
		   
		   driver.findElement(By.xpath("/html/body/div/nav/div[1]/a[7]")).click();
		   
	//	   WebElement search = driver.findElement(By.xpath("/html/body/div/div/form/div[1]/input"));
		   
	//	   search.sendKeys("Aditya");          //search
		   
		   
/* WebElement Status = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/table/tbody/tr[55]/td[3]/select"));  	
		   
		   Select attendance = new Select(Status);           
		   
		  attendance.selectByVisibleText("Absent");  
		  
		  Thread.sleep(3000);
		   
		  driver.findElement(By.xpath("/html/body/div/div/form/div[3]/button")).click();   */
		   
		   
		   
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("/html/body/div/div/form/div[2]/table/tbody/tr[4]/td[4]/button")).click();  //update btn test is pass
		  
WebElement Statuss = driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr/td[3]/select"));  	
		   
		   Select attendance = new Select(Statuss);           
		   
		  attendance.selectByVisibleText("Absent");  
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr/td[4]/input")).sendKeys("2026-09-25");
		   
		  driver.findElement(By.xpath("/html/body/div/div/div/button")).click();
		  
		  
		  
		  
		  
		  
		 
		  
		  
		  
		  
		   
		   
		   
	}

}
