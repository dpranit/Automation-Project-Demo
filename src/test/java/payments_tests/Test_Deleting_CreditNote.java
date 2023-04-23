package payments_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import utils.BaseClass;

public class Test_Deleting_CreditNote extends BaseClass{
	
	@Test(groups= {"SuperDoctor"},dataProvider="ProcedureTestData")
	public void Test_Delete_Recently_Created_CreditNote(String Name, String Type, String PaymentForProce, String Quantitity) throws InterruptedException {
		
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getPayments().click();
		Thread.sleep(2000);
		WebElement CreditNotebtn= driver.findElement(By.xpath("//div[text()=' Credit Notes ']"));
		CreditNotebtn.click();
		WebElement NewCreditNote= driver.findElement(By.xpath("//button[text()=' Create Credit Note ']"));
		NewCreditNote.click();
		WebElement Patient= driver.findElement(By.xpath("//input[@placeholder='Type Patient Name']"));
		Thread.sleep(1000);
		Patient.click();
		Patient.sendKeys(Name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='d-flex justify-content-between ng-star-inserted']")).click();
		driver.findElement(By.xpath("//button[@class='custom_cal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='form__input ng-untouched ng-pristine ng-valid'])[2]")).click();
		Thread.sleep(1000);
		CreditNoteType1();
		Thread.sleep(1000);
		WebElement PayForr=driver.findElement(By.xpath("//select[@id='product']"));
		Thread.sleep(1000);
		Select Payforprocedure = new Select(PayForr);
		Payforprocedure.selectByVisibleText(PaymentForProce);
		SelectProcedure();
		Quantity(Quantitity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Generate Credit Note ']")).click();
		driver.findElement(By.xpath("//button[text()=' Looks Fine ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='member-options']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Delete Credit Note ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Delete ']")).click();
		Thread.sleep(3000);
		System.out.println("CreditNote Deleted Successfully");

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
		{"Abhilash","New Credit Note","Procedure","2"},
		{"Vijay K","New Credit Note","Procedure","1"},
	};
}

}
