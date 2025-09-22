package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Project {

	@Test
	
	public void projectmodule() throws InterruptedException {
		
	
		
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost:5173/");
		
	    System.out.println("The title of the page" + driver.getTitle());
	    
	    driver.findElement(By.id("username")).sendKeys("aditya");
	 
	    driver.findElement(By.id("password")).sendKeys("Test@123");
	    Thread.sleep(1000);
	    
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();   //loginbutton  
		   
	   driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div[1]/a[2]")).click();       //project
	   
	  /* driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/input")).sendKeys("Issue");    // project name
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/textarea")).sendKeys("Description issue tracking system");  //description
	   
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button[1]")).click();  */          //create project
	   
	  WebElement project =  driver.findElement(By.xpath("/html/body/div/div/div/select[1]"));
	   
	  Select p = new Select(project);                                                                // dropdown of project
	   System.out.println("Default Selected value is:"+p.getFirstSelectedOption().getText());        //for default selected option
	   
	   p.selectByVisibleText("Nafed");                                      //to select value
	   
	   WebElement emp = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/select[2]"));
	   
	   Select e = new Select(emp);                                                              //dropdown of Emp
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   e.selectByValue("4");
	  
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button[2]")).click();
	   
	   
	   
	   
	  
	   
	  
	   
	    
	   
	   
	   
	   
	   
	  
	   
	   
	   
	 
	   
	   
	    
}
}



