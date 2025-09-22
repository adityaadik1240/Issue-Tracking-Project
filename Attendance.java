package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Attendance {
	
	

	WebDriver driver;

    @BeforeTest
    public void setUp() {
        
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("http://localhost:5173/");
        System.out.println("The title of the page: " + driver.getTitle());
    }

    @Test
    public void report() throws InterruptedException {
      
        driver.findElement(By.id("username")).sendKeys("aditya");
        
       
        driver.findElement(By.id("password")).sendKeys("Test@123");
        
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();
        
        
        driver.findElement(By.xpath("/html/body/div/nav/div[1]/a[7]")).click();
        
        
        driver.findElement(By.xpath("/html/body/div/nav/div[1]/a[8]")).click();
       
        
        
       // WebElement search = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/input"));     //Search Functionality
        
       // search.sendKeys("Aditya");
      
        
       WebElement month = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/select"));
       
       Select mon = new Select(month);
        
   
        
        
    }

   @AfterTest
    public void tearDown() {
     
     /*   if (driver != null) {
            driver.quit();  */
        }
    }
