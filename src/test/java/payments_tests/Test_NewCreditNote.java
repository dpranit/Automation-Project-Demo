package payments_tests;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import pageObject.Payments_Pg;
import utils.BaseClass;

public class Test_NewCreditNote extends BaseClass{
	
	@Test(groups= {"SuperDoctor"},dataProvider="ProductTestData")
	public void Test_Create_CreditNote_For_Product(String Name, String Type, String PaymentFor, String Quantitity, String Cost) throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getPayments().click();
		Thread.sleep(2000);
		WebElement CreditNotebtn= driver.findElement(By.xpath("//div[text()=' Credit Notes ']"));
		CreditNotebtn.click();
		Thread.sleep(2000);
		WebElement NewCreditNote= driver.findElement(By.xpath("//button[text()=' Create Credit Note ']"));
		NewCreditNote.click();
		WebElement Patient= driver.findElement(By.xpath("//input[@placeholder='Type Patient Name']"));
		Thread.sleep(1000);
		Patient.click();
		Patient.sendKeys(Name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='d-flex justify-content-between ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='custom_cal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='form__input ng-untouched ng-pristine ng-valid'])[2]")).click();
		Thread.sleep(1000);
		CreditNoteType1();
		WebElement PayForr=driver.findElement(By.xpath("//select[@id='product']"));
		Select Payfor = new Select(PayForr);
		Payfor.selectByVisibleText(PaymentFor);
		Thread.sleep(2000);
		SelectProduct();
		Quantity(Quantitity);
		Thread.sleep(2000);
		CostperUnit(Cost);
		driver.findElement(By.xpath("//button[text()=' Generate Credit Note ']")).click();
		System.out.println("CreditNote Created Successfully");
		driver.findElement(By.xpath("//button[text()=' Looks Fine ']")).click();
	}
	
	
	
	@Test(dataProvider="ProcedureTestData")
	public void Test_Create_CreditNote_For_Procedure(String Name, String Type, String PaymentForProce, String Quantitity, String Cost) throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getPayments().click();
		Thread.sleep(2000);
		WebElement CreditNotebtn= driver.findElement(By.xpath("//div[text()=' Credit Notes ']"));
		CreditNotebtn.click();
		Thread.sleep(2000);
		WebElement NewCreditNote= driver.findElement(By.xpath("//button[text()=' Create Credit Note ']"));
		NewCreditNote.click();
		WebElement Patient= driver.findElement(By.xpath("//input[@placeholder='Type Patient Name']"));
		Thread.sleep(1000);
		Patient.click();
		Patient.sendKeys(Name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='d-flex justify-content-between ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='custom_cal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='form__input ng-untouched ng-pristine ng-valid'])[2]")).click();
		Thread.sleep(1000);
		CreditNoteType1();
		Thread.sleep(1000);
		WebElement PayForr=driver.findElement(By.xpath("//select[@id='product']"));
		Select Payforprocedure = new Select(PayForr);
		Payforprocedure.selectByVisibleText(PaymentForProce);
		SelectProcedure();
		Quantity(Quantitity);
		Thread.sleep(2000);
	//	CostperUnit(Cost);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Generate Credit Note ']")).click();
		System.out.println("CreditNote Created Successfully");
		driver.findElement(By.xpath("//button[text()=' Looks Fine ']")).click();
	}
	
	
	
	
	public void SelectProduct() {
		WebElement Prod=driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/mnp-credit-note-form/div/div[2]/form/div[1]/div[6]/fieldset/div[1]/div/div[2]/div[3]/mnp-input/div/input"));
		Prod.click();
		WebElement list =driver.findElement(By.xpath("/html/body/app-root/mnp-patients/sbpro-layout-dashboard/span/div/div[2]/main/mnp-credit-note-form/div/div[2]/form/div[1]/div[6]/fieldset/div[1]/div/div[2]/div[3]/mnp-input/div/div/li[2]/span"));
		list.click();
	}
	
	public void SelectProcedure() {
		WebElement Procedure =driver.findElement(By.xpath("/html/body/app-root/mnp-patients/sbpro-layout-dashboard/span/div/div[2]/main/mnp-credit-note-form/div/div[2]/form/div[1]/div[6]/fieldset/div[1]/div/div[2]/div[3]/mnp-input/div/input"));
		Procedure.click();
		WebElement list =driver.findElement(By.xpath("/html/body/app-root/mnp-patients/sbpro-layout-dashboard/span/div/div[2]/main/mnp-credit-note-form/div/div[2]/form/div[1]/div[6]/fieldset/div[1]/div/div[2]/div[3]/mnp-input/div/div/li[1]/span"));
		list.click();
		
	}
	
	public void CreditNoteType1() {
		WebElement CreditType= driver.findElement(By.xpath("//span[text()='New Credit Note']"));
		CreditType.click();
	}
	
	public void CreditNoteType2() {
		WebElement CreditType= driver.findElement(By.xpath("//span[text()='Credit Note from Invoice']"));
		CreditType.click();
	}
	
	public void Quantity(String Quantitity) throws InterruptedException {
		WebElement Qnty= driver.findElement(By.xpath("//input[@type='number']"));
		Qnty.click();
		Qnty.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		Qnty.sendKeys(Quantitity);
		
	}
	public void CostperUnit(String Cost) {
		WebElement CostUnit=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		CostUnit.sendKeys(Cost);
	}
	
	@DataProvider(name="ProductTestData")
	public Object[][]ProductTestData(){

		return new Object[][] {
			{"Abhilash","New Credit Note","Product","10", "150"},
			{"Vijay K","New Credit Note","Product","20", "120"},
		};
	}
	
	@DataProvider(name="ProcedureTestData")
	public Object[][]ProcedureTestData(){

		return new Object[][] {
			{"Abhilash","New Credit Note","Procedure","2", "1500"},
			{"Vijay K","New Credit Note","Procedure","1", "3000"},
		};
	}
	
	@Test()
	public void Test_CreditNote_Filters_Open() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getPayments().click();
		WebElement CreditNotebtn= driver.findElement(By.xpath("//div[text()=' Credit Notes ']"));
		CreditNotebtn.click();

		//driver.findElement(By.xpath("//div[text()=' Filters ']")).click();
		driver.findElement(By.xpath("//div[@class='table-header-column-title']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Status']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='open']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Apply ']")).click();
		}
	
	@Test()
	public void Test_CreditNote_Filters_Close() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getPayments().click();
		WebElement CreditNotebtn= driver.findElement(By.xpath("//div[text()=' Credit Notes ']"));
		CreditNotebtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='table-header-column-title']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Status']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='closed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Apply ']")).click();
	}
}