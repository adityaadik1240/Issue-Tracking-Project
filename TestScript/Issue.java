package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Issue {
	
	@Test
	
	public void issueTracker() throws InterruptedException {
		
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
	    
		   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();   //loginBtnS
		   
		   driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div[1]/a[3]")).click();
		   
		   WebElement selectproject = driver.findElement(By.xpath("/html/body/div/div/div/div/select"));
		   
		   Select p = new Select(selectproject);                  //selectprojectdDrpdn
		   p.selectByVisibleText("Nafed");
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.findElement(By.xpath("/html/body/div/div/div/div[2]/input")).sendKeys("SignUp issue");        //Title
		  
		   WebElement desc = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/textarea"));        //description
		   desc.sendKeys("Sign Up issue while registration");
		   
		   System.out.println("Their is some login issue while doing registration"+desc);          //to print on console
		   
		   
		   WebElement priority = driver.findElement(By.xpath("/html/body/div/div/div/div[4]/div[1]/select")); //slect priority
		   
		   Select prio = new Select (priority);     //priority
		   
		   prio.selectByVisibleText("HIGH");
		   
		   
		   
		   WebElement employee = driver.findElement(By.xpath("/html/body/div/div/div/div[4]/div[2]/select"));
		   
		   Select emp = new Select (employee);     //emp select drpdn
		   
		   emp.selectByValue("4");     //emp
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("/html/body/div/div/div/button")).click();                    //create issue
		   
		   
		   
		   
		   
		   
		  
		   
		   
		   
		   
		   
	}

}
