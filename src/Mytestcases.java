import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytestcases {

	String MyWebsite = "https://www.saucedemo.com/";
	WebDriver driver= new ChromeDriver();
	
	
	String UserName = "standard_user";
	String Password = "secret_sauce";

	
@BeforeTest	
public void mySetup() {	
	
	driver.get(MyWebsite);
	
	driver.manage().window().maximize();


	
	
}
	@Test
	public void Login() {
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.id("login-button")).click();
	
		
		
		
		
		
	}
@AfterTest	
	public void AfterMyTest() {
	//driver.close();
	
}
	
	
	
	//Task Done.
	
	
	
	
	
	
	
	
	
	
	
	
	
}
