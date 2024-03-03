package OrabgeHRM.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test
public class Immigration extends Login {
	
	@AfterMethod
	public void Addimmegration() {
		
		WebDriver driver = Login.driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement myInfo = driver.findElement(By.xpath("//span[text()='My Info']"));
		myInfo.click();
		System.out.println("User is on My info page");

		WebElement immigrationlink = driver.findElement(By.xpath(" (//a[normalize-space()='Immigration'])[1]"));
		immigrationlink .click();
		System.out.println("User is on Immigration Details page");
		
		WebElement addbutton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addbutton.click();
		System.out.println("Add button clicked");

		WebElement number = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		number.click();
		number.sendKeys("P15674");
		System.out.println("Number added");
		
		WebElement issuedate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		issuedate.click();
		issuedate.sendKeys("2023-02-02");
		System.out.println("Issue date selected");
		
		WebElement expirydate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		expirydate.click();
		expirydate.sendKeys("2027-01-31");
		System.out.println("Expiry date selected");
		

		WebElement eligiblestatus = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("Eligible");
		System.out.println("Eligible status Added");
		
		WebElement revdate = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]"));
		revdate.click();
		revdate.sendKeys("2023-08-03");
		System.out.println("Review date Selected");
		
		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("Approved");
		System.out.println("Comment is added");
		
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Passport immigration detail sucessfully aaded");     
    
	}
}


