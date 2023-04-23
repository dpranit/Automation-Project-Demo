package payments_tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import utils.BaseClass;
public class Test_CreditNote_from_Invoice extends BaseClass{
	
	@Test(groups= {"SuperDoctor"},dataProvider="TestData")
	public void Test_Create_CreditNote_From_Invoice(String Name) throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getPayments().click();
		WebElement CreditNotebutton= driver.findElement(By.xpath("//div[text()=' Credit Notes ']"));
		CreditNotebutton.click();
		WebElement NewCreditNote= driver.findElement(By.xpath("//button[text()=' Create Credit Note ']"));
		NewCreditNote.click();
		WebElement Patient= driver.findElement(By.xpath("//input[@placeholder='Type Patient Name']"));
		Thread.sleep(1000);
		Patient.click();
		Patient.sendKeys(Name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='d-flex justify-content-between ng-star-inserted']")).click();
		CreditNoteType2();
		driver.findElement(By.xpath("//input[@class='form__input']")).click();
		driver.findElement(By.xpath("/html/body/app-root/mnp-patients/sbpro-layout-dashboard/span/div/div[2]/main/mnp-credit-note-form/div/div[2]/form/div[1]/div[5]/div/div/div/div/li[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//button[@class='button-filled-primary']")).click();
		driver.findElement(By.xpath("//button[text()=' Looks Fine ']")).click();
		System.out.println("Credit Note Generated");
	}
	
	@Test(groups= {"SuperDoctor"},dataProvider="TestData",dependsOnMethods="Test_Create_CreditNote_From_Invoice")
	public void Test_Delete_CreditNote_Invoice(String Name) throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getPayments().click();
		WebElement CreditNotebutton= driver.findElement(By.xpath("//div[text()=' Credit Notes ']"));
		CreditNotebutton.click();
		WebElement NewCreditNote= driver.findElement(By.xpath("//button[text()=' Create Credit Note ']"));
		NewCreditNote.click();
		WebElement Patient= driver.findElement(By.xpath("//input[@placeholder='Type Patient Name']"));
		Thread.sleep(1000);
		Patient.click();
		Patient.sendKeys(Name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='d-flex justify-content-between ng-star-inserted']")).click();
		CreditNoteType2();
		driver.findElement(By.xpath("//input[@class='form__input']")).click();
		driver.findElement(By.xpath("/html/body/app-root/mnp-patients/sbpro-layout-dashboard/span/div/div[2]/main/mnp-credit-note-form/div/div[2]/form/div[1]/div[5]/div/div/div/div/li[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//button[@class='button-filled-primary']")).click();
		driver.findElement(By.xpath("//button[text()=' Looks Fine ']")).click();
		System.out.println(" Credit Note Generated");
		WebElement Options=driver.findElement(By.xpath("//div[@class='member-options']"));
		Options.click();
		Thread.sleep(2000);
		WebElement Delete=driver.findElement(By.xpath("//span[text()=' Delete Credit Note ']"));
		Delete.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Delete ']")).click();
		Thread.sleep(3000);
		System.out.println("Credit Note Deleted Successfully");
		
	}
	
	
	
	public void CreditNoteType2() {
		driver.findElement(By.xpath("(//input[@class='form__input ng-untouched ng-pristine ng-valid'])[2]")).click();
		WebElement CreditType= driver.findElement(By.xpath("//span[text()='Credit Note from Invoice']"));
		CreditType.click();
	}
	
	
	@DataProvider(name="TestData")
	public Object[][]ProcedureTestData(){

		return new Object[][] {
			{"Sakshi D"},
			{"Kalpana"}
		};
	}
}

