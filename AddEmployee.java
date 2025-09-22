package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddEmployee {

		
		 WebDriver driver;

		    @BeforeMethod
		    public void setUp() {
		        driver = new FirefoxDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		        driver.get("http://localhost:5173/");
		    }

		    @Test
		    public void addEmp() throws InterruptedException {
		        System.out.println("The title of the page: " + driver.getTitle());

		        driver.findElement(By.id("username")).sendKeys("aditya");
		        driver.findElement(By.id("password")).sendKeys("Test@123");

		        Thread.sleep(2000);

		        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/button")).click();   //login
		        driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div[1]/a[5]")).click();   //emp
		    }

		    @AfterMethod
		    public void tearDown() throws InterruptedException {
		        if (driver != null) {
		         //   driver.quit();   
		        
		        }
		        driver.findElement(By.id("firstName")).sendKeys("Akash");                  //Personal Identity Details
		        driver.findElement(By.id("lastName")).sendKeys("Shinde");
		        driver.findElement(By.id("email")).sendKeys("aditya223@gmail.com");
		        driver.findElement(By.xpath("//*[@id=\"roles\"]")).sendKeys("Employee");
		        driver.findElement(By.name("username")).sendKeys("aditya2222");
		        driver.findElement(By.id("password")).sendKeys("Test@1234");
		        
		        Thread.sleep(1000);
		        
		        driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div[1]/div/input")).sendKeys("876");                //Permanent Address Details
		        driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div[2]/div/input")).sendKeys("Sai Residency");
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[2]/div[3]/div/input")).sendKeys("Balewadi High Street");
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[2]/div[4]/div/input")).sendKeys("Balewadi");
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[2]/div[5]/div/input")).sendKeys("Maharashtra");
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[2]/div[6]/div/input")).sendKeys("411045");
		        
		        
		        Thread.sleep(1000);
		        
		        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[1]/div/input")).sendKeys("223");             //Current Address Field
		        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[2]/div/input")).sendKeys("Karishma Society");
		        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[3]/div/input")).sendKeys("City Pride Street");
		        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[4]/div/input")).sendKeys("Kothrud");
		        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[5]/div/input")).sendKeys("Maharashtra");
		        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[6]/div/input")).sendKeys("411052");
		        
		      
		        
		        driver.findElement(By.xpath("/html/body/div/div/form/div[4]/div/input")).sendKeys("9878987898");   //Personal Details
		       driver.findElement(By.xpath("/html/body/div/div/form/div[5]/div/input")).sendKeys("456798745645");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[6]/div/input")).sendKeys("FGHJP7798M");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[7]/div/input")).sendKeys("Akurdi Pune");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[8]/div/input")).sendKeys("898767898778");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[9]/div/input")).sendKeys("SBIN00123");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[10]/div/input")).sendKeys("Computer");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[11]/div/input")).sendKeys("Private Sector");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[12]/div/input")).sendKeys("78765678765");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[13]/div/input")).sendKeys("50000");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[14]/div/input")).sendKeys("adityaa@gmail.com");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[15]/div/input")).sendKeys("adityaa@whitetabletech.com");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[16]/div/input")).sendKeys("Pune");
		       
		      // driver.switchTo().frame(0);
               
		       driver.findElement(By.name("personalDetails.dateOfBirth")).sendKeys("2001-09-01");
		       driver.findElement(By.xpath("/html/body/div/div/form/div[18]/div/input")).sendKeys("2022-03-11");
		       
		   
		       
		        driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Icon\\Desktop\\Legal project images\\Advocate 01.jpg");
		      //  driver.findElement(By.xpath("/html/body/div/div/form/div[20]/button")).click();
		        
		     //  Thread.sleep(2000);
		        
		        WebElement submitButton = driver.findElement(By.xpath("C:\\Users\\Icon\\Desktop\\Legal project images\\Advocate.jpg"));
		      
		        for (int i = 0; i < 5; i++) {
		            try {
		                submitButton.click();
		               
		                break; 
		            } catch (Exception e) {
		                Thread.sleep(4000); 
		            }
		        }
		        
		        submitButton.click();
		        
		       
		       
		   
		      
		       
		     
		    }
		}