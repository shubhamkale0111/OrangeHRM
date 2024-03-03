package OrabgeHRM.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test
public class JobDetails extends Login{

	 @AfterMethod
	    public void job()  {
	    	WebDriver driver = Login.driver;
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			
			WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
			myInfo.click();
			System.out.println("User is on My info page");
	    
			WebElement jobslink = driver.findElement(By.xpath("//a[normalize-space()='Job']"));
			
			jobslink.click();
			
	       System.out.println("Job View Successfull");
	    
	    

	}
	}
