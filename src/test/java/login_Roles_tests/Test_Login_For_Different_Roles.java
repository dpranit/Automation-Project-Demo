package login_Roles_tests;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Login_For_Different_Roles {

	@Test(groups= {"SuperDoctor"})
	public void Test_SuperDoctor_is_able_to_Login_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//Headless browser code can be added here
		WebDriver driver=new ChromeDriver(co);
		driver.get("http://64.227.188.11/clinic/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ID=driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		ID.sendKeys("dpranit07@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Aa123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		SoftAssert softassert= new SoftAssert();
		String DashBoard= driver.getCurrentUrl();
		String URL = driver.getCurrentUrl();
		System.out.println("Super Doctor Loggedin Successfully !");
		driver.close();
	}
	
	@Test(groups= {"FrontDesk"})
	public void Test_FrontDesk_is_able_to_Login_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//Headless browser code can be added here
		WebDriver driver=new ChromeDriver(co);		driver.get("http://64.227.188.11/clinic/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ID=driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		ID.sendKeys("wakin45034@dakcans.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Aa123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		SoftAssert softassert= new SoftAssert();
		String DashBoard= driver.getCurrentUrl();
		String URL = driver.getCurrentUrl();
		System.out.println("Front Desk Loggedin Successfully !");
		driver.close();
	}
	
	@Test(groups= {"Doctor"})
	public void Test_Doctor_is_able_to_Login_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//Headless browser code can be added here
		WebDriver driver=new ChromeDriver(co);		driver.get("http://64.227.188.11/clinic/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ID=driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		ID.sendKeys("jeceni6533@pamaweb.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Aa123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		SoftAssert softassert= new SoftAssert();
		String DashBoard= driver.getCurrentUrl();
		String URL = driver.getCurrentUrl();
		System.out.println("Doctor Loggedin Successfully !");
		driver.close();
	}
	
	@Test(groups= {"Counsultant"})
	public void Test_Consultatnt_is_able_to_Login_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//Headless browser code can be added here
		WebDriver driver=new ChromeDriver(co);		driver.get("http://64.227.188.11/clinic/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ID=driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		ID.sendKeys("vahesop275@dakcans.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Aa123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		SoftAssert softassert= new SoftAssert();
		String DashBoard= driver.getCurrentUrl();
		String URL = driver.getCurrentUrl();
		System.out.println("Consultatnt Loggedin Successfully !");
		driver.close();
	}
	
	@Test(groups= {"Thearpist"})
	public void Test_Therpist_is_able_to_Login_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//Headless browser code can be added here
		WebDriver driver=new ChromeDriver(co);		driver.get("http://64.227.188.11/clinic/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ID=driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		ID.sendKeys("hegox35656@dakcans.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Aa123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		SoftAssert softassert= new SoftAssert();
		String DashBoard= driver.getCurrentUrl();
		String URL = driver.getCurrentUrl();
		System.out.println("Therapist Loggedin Successfully !");
		driver.close();
	}
	
	@Test(groups= {"SuperAdmin"})
	public void Test_SuperAdmin_is_able_to_Login_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//Headless browser code can be added here
		WebDriver driver=new ChromeDriver(co);		driver.get("http://64.227.188.11/clinic/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ID=driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		ID.sendKeys("maleh23712@roxoas.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Aa123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		SoftAssert softassert= new SoftAssert();
		String DashBoard= driver.getCurrentUrl();
		String URL = driver.getCurrentUrl();
		System.out.println("Therapist Loggedin Successfully !");
		driver.close();
	}
	
	@Test(groups= {"Manager"})
	public void Test_Manager_is_able_to_Login_Application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//Headless browser code can be added here
		WebDriver driver=new ChromeDriver(co);		driver.get("http://64.227.188.11/clinic/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ID=driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		ID.sendKeys("xoceken310@duetube.com");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("Aa123456789");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		SoftAssert softassert= new SoftAssert();
		String DashBoard= driver.getCurrentUrl();
		String URL = driver.getCurrentUrl();
		System.out.println("Therapist Loggedin Successfully !");
		driver.close();
	}
	
	
	
}