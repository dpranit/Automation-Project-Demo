package costCalculator_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import utils.BaseClass;

public class Test_CalculateCost extends BaseClass{
	@Test(groups= {"SuperDoctor"},dataProvider="Details")
	public void Test_Calculate_Cost_For_Procedure(String Patient, String Procedure, String discoprice) throws InterruptedException {
		
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Thread.sleep(1000);
		Patients.getPatients().click();
		Patients.getCostCalculator().click();
		WebElement calcostbtn=driver.findElement(By.xpath("//button[text()=' Calculate Cost ']"));
		calcostbtn.click();
		WebElement PatientName=driver.findElement(By.xpath("//input[@placeholder='Type Patient Name']"));
		PatientName.click();
		PatientName.sendKeys(Patient);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		WebElement descript =driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/mnp-create-quotation/div/div[2]/mnp-calculator/form/div[1]/div/div[1]/div[2]/mnp-input/textarea"));
		descript.sendKeys("Procedure Description");
		WebElement persitting=driver.findElement(By.xpath("//input[@type='number']"));
		WebElement Procedure1= driver.findElement(By.xpath("//div[text()='Procedure 1']"));
		Procedure1.click();
		WebElement procedurename=driver.findElement(By.xpath("//input[@placeholder='Type Procedure Name']"));
		procedurename.sendKeys(Procedure);
		driver.findElement(By.xpath("//span[@class='d-flex justify-content-between ng-star-inserted']")).click();
		WebElement Discoslider= driver.findElement(By.xpath("//span[@class='slider round']"));
		Discoslider.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		WebElement Discotype= driver.findElement(By.xpath("/html/body/app-root/mnp-patients/sbpro-layout-dashboard/span/div/div[2]/main/mnp-create-quotation/div/div[2]/mnp-calculator/form/div[1]/div/div[2]/div[1]/sbpro-card-collapsable/div/div[2]/div/div[4]/div[1]/mnp-input/div/input"));
		Discotype.click();
		WebElement typeRupee=driver.findElement(By.xpath("(//li[@class='ng-star-inserted'])[1]"));
		typeRupee.click();
		WebElement discou=driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/mnp-create-quotation/div/div[2]/mnp-calculator/form/div[1]/div/div[2]/div[1]/sbpro-card-collapsable/div/div[2]/div/div[4]/div[2]/mnp-input/input"));
		discou.sendKeys(Keys.BACK_SPACE);
		discou.sendKeys(discoprice);
		WebElement costcalbtn= driver.findElement(By.xpath("//button[text()=' Calculate Cost ']"));
		costcalbtn.click();
		driver.findElement(By.xpath("//button[text()=' View Quotation ']")).click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		driver.findElement(By.xpath("(//button[@class='button-filled-primary'])[2]")).click();
		System.out.println("Cost Calculated");
	}
	
	@Test
	public void Test_SuperDoctor_View_Quotation() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Thread.sleep(1000);
		Patients.getPatients().click();
		Patients.getCostCalculator().click();
		WebElement ViewQuotation= driver.findElement(By.xpath("//div[text()='View ']"));
		ViewQuotation.click();
		
	}
	
	@DataProvider(name="Details")
	public Object[][]Patients(){

		return new Object[][] {
			{"Smaran","Dermal Fillers","500"},
			{"Vijay K","Pico Toning","1000"},
			//{"Smaran"}
		};
	}
		
}