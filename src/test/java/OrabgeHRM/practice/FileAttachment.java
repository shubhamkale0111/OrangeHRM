package OrabgeHRM.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test
public class FileAttachment extends Login {
	
	
    @AfterMethod
    public void FileAttach()  {
    	WebDriver driver = Login.driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myInfo.click();
		System.out.println("User is on My info page");

		WebElement immigrationlink = driver.findElement(By.xpath(" (//a[normalize-space()='Immigration'])[1]"));
		immigrationlink .click();
		System.out.println("User is on Immigration Details page");
		
		WebElement Addattach = driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[2]"));
		Addattach.click();
		System.out.println("Add attachment clicked");
		WebElement Browse = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Browse.sendKeys("C:\\Users\\ADMIN\\Documents\\ggg.txt");
		
		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		comments.click();
		comments.sendKeys("Testing File");
		System.out.println("Comments added");
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Attachment saved sucessfully");
}
}
