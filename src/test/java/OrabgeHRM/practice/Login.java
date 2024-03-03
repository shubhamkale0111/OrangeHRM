package OrabgeHRM.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

public class Login {

	public static WebDriver driver;
	@Test
	public void log(){
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.click();
	username.sendKeys("Admin");
	
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.click();
	password.sendKeys("admin123");
	
	WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	submit.click();
	System.out.println("Login Successful");
	
	
       
        
    }
  
    
    }
