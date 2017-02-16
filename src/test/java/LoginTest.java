import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
public static WebDriver driver;
@BeforeTest	 
public void setup(){
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
	 }
@Test	 
public void donavigate(){
		 driver.get("http://www.google.com");
			
	     driver.navigate().to("http://www.seleniumhq.org/"); 
	        System.out.println(driver.getCurrentUrl());	
	     System.out.println("Sample Program to PUSH code in to GIT hub");   
	 }
@AfterTest
public void teardown(){
	driver.quit();
	}
}
