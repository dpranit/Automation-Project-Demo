package patients_tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import pageObject.Patients_Page;
import utils.BaseClass;

import java.awt.*;
public class Test_NewPatients_Registration extends BaseClass {
	
	@Test(groups= {"SuperDoctor"},dataProvider="TestData")
	public void Test_RegisterNew_Patient_With_Unique_PhoneNumber(String Name) throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Patients.getPatientsModule().click();
		Thread.sleep(2000);
		Patients_Page PatientPg=PageFactory.initElements(driver, Patients_Page.class);
		PatientPg.getNewPatientButton().click();
		Thread.sleep(2000);

		WebElement PatientName =driver.findElement(By.xpath("//input[@class='form__input ng-untouched ng-pristine ng-invalid ng-star-inserted']"));
		PatientName.sendKeys(Name);
		GenderMale();
		Thread.sleep(1000);
		PhoneNumberRepeate();
		Thread.sleep(2000);
		WebElement Next=driver.findElement(By.xpath("//button[text()=' Next ']"));
		Next.click();
		Thread.sleep(2000);
		System.out.println("Unique Phone Number registration test pass");
		}
	
	
	@Test(groups= {"SuperDoctor"},dataProvider="TestData")
	public void Test_Patient_Image_Upload(String Name) throws InterruptedException, Exception {
		Robot robot=new Robot();
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Patients.getPatientsModule().click();
		Thread.sleep(2000);
		Patients_Page PatientPg=PageFactory.initElements(driver, Patients_Page.class);
		PatientPg.getNewPatientButton().click();
		Thread.sleep(2000);
		WebElement PatientName =driver.findElement(By.xpath("//input[@class='form__input ng-untouched ng-pristine ng-invalid ng-star-inserted']"));
		PatientName.sendKeys(Name);
		GenderMale();
		Thread.sleep(1000);
		PhoneNumberRepeate();
		Thread.sleep(2000);
		WebElement Upload=driver.findElement(By.xpath("//img[@src='/assets/icons/add-img.svg']"));
		Upload.click();
		robot.setAutoDelay(2000);
		StringSelection stringSelection=new StringSelection("E:\\IE Softtek\\dummy.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		System.out.println("Patients Image Added Successfully");
		
		
		
	}
	
	public void GenderMale() {
		driver.findElement(By.xpath("//input[@class='form__input ng-untouched ng-pristine ng-invalid']")).click();
		driver.findElement(By.xpath("//span[text()='male']")).click();
	}
	public void PhoneNumberRepeate() {
		WebElement Phone= driver.findElement(By.xpath("//input[@type='tel']"));
		Phone.click();
		Phone.sendKeys("2564895120");
	}
	
	public void PhoneNumber2() {
		
	}
	
	@DataProvider(name="TestData")
	public Object[][]credentials(){

		return new Object[][] {
			{"Sumit Kale"}
		};
	}
}
