package OrabgeHRM.practice;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test
public class DeleteImmigration extends Login {
	
	@AfterMethod
    public void delete()  {
    	WebDriver driver = Login.driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myInfo.click();
		System.out.println("User is on My info page");

		WebElement immigrationlink = driver.findElement(By.xpath(" (//a[normalize-space()='Immigration'])[1]"));
		immigrationlink .click();
		System.out.println("User is on Immigration Details page");

		WebElement deletecell = driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash'][1]"));
    	deletecell.click();
    	System.out.println("Pop-up message appeared");
    	WebElement deleted = driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']"));
    	deleted.click();
    	System.out.println("Sucessfully Deleted");
    	
}
}
