package issue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Kanban {
	
	@Test
	
public void KanbanBoard() throws InterruptedException {
		
		
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
		   
		   
           WebElement selectPro = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/select[1]"));
		   
		   Select Pro = new Select(selectPro);                  //selectproject
		   Pro.selectByVisibleText("Nafed");
		   
		   WebElement selectUser = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/select[2]"));
		   
		   Select User = new Select(selectUser);
		   User.selectByVisibleText("sandesh");
		   
		WebElement todoStatus =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/select"));
		
		Select todo = new Select(todoStatus);
		todo.selectByVisibleText("DONE");
		
		
		
		   
		   
		   	   

}
}

