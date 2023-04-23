package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.DashBoard_Modules;

public class AccountantLoginBaseClass {
	
	public static WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//Headless browser code can be added here
		driver= new ChromeDriver(co);
		driver.get("http://64.227.188.11/clinic/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement Email= driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		Email.sendKeys("rijikore@brand-app.biz");
		WebElement Pass = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		Pass.sendKeys("Aa123456789");
		WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Login now']"));
		LoginBtn.click();
		}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
