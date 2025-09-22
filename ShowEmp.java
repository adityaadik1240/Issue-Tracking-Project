package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ShowEmp {
	
	@Test
	
	public void showemployee() throws InterruptedException {
		
		
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
		   
		   Thread.sleep(4000);
		   
		   driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div[1]/a[1]")).click();
		   
		   driver.findElement(By.xpath("/html/body/div/nav/div[1]/a[6]")).click();
		   
		 //  driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td[5]/div/button[1]")).click();
		  
		  //driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[4]/td[5]/div/button[1]")).click();     //view
		   
	/*	  driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[4]/td[5]/div/button[2]")).click();     //edit
		  
		  WebElement nameField = driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[1]/input")); // name field
		  nameField.clear();  // clears "Aditya"
		  nameField.sendKeys("Adii");  // enters new value
		  
		  
		  driver.findElement(By.xpath("/html/body/div/div/form/button")).click(); //update
		  
		  */
		   
driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[4]/td[5]/div/button[3]")).click(); //delete

		   
		   
	}
	
}
