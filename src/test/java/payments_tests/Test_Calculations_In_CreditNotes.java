package payments_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import utils.BaseClass;

public class Test_Calculations_In_CreditNotes extends BaseClass{
	//Failed Test Case- Check Once

	@Test(groups= {"SuperDoctor"},dataProvider="ProcedureTestData1")
	public void Test_TotalAmount_InCreditNote_BasedOn_Quantity_And_CostPerUnit(String Name, String Type, String PaymentForProce, String Quantitity) throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getPayments().click();
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
		Select Payforprocedure = new Select(PayForr);
		Payforprocedure.selectByVisibleText(PaymentForProce);
		SelectProcedure();
		Quantity(Quantitity);
		Thread.sleep(2000);
		WebElement Total= driver.findElement(By.id("totalAmount"));
		Total.click();
		String Totamnt= Total.getAttribute("Value");
		System.out.println("Total amnt above");
	}
	/*
	@Test(dataProvider="ProcedureTestData2")
	public void Test_Refund_From_CreditNote(String Name, String PaymentFor) throws InterruptedException {
		WebElement Paymentsbtn= driver.findElement(By.xpath("//div[text()='Payments']"));
		Paymentsbtn.click();
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
		driver.findElement(By.xpath("//button[@class='custom_cal']")).click();
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")).click();
		driver.findElement(By.xpath("(//input[@class='form__input ng-untouched ng-pristine ng-valid'])[2]")).click();
		CreditNoteType();
		WebElement PayForr=driver.findElement(By.xpath("//select[@id='product']"));
		Select Payfor = new Select(PayForr);
		Payfor.selectByVisibleText(PaymentFor);
		Thread.sleep(2000);
		SelectProduct();
		WebElement Qnty= driver.findElement(By.xpath("//input[@type='number']"));
		Qnty.click();
		Qnty.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		Qnty.sendKeys("2");
		WebElement CostUnit=driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		CostUnit.sendKeys(Keys.BACK_SPACE);
		CostUnit.sendKeys("1500");
		WebElement Total=driver.findElement(By.cssSelector("input#totalAmount"));
		Total.click();
	    String val = Total.getAttribute("value");
	    String expect="3000";
	    Assert.assertEquals(val, expect, "Actual and expected values are matched");
		System.out.println("Total amount is correct as calculated from Quantity and cost per Unit");
	    driver.findElement(By.xpath("//button[text()=' Generate Credit Note ']")).click();
		driver.findElement(By.xpath("//button[text()=' Looks Fine ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='member-options']")).click();
		driver.findElement(By.xpath("//span[text()=' Refund ']")).click();
		WebElement RefundScreen=driver.findElement(By.xpath("//div[@class='modal-content']"));
		if(RefundScreen.isDisplayed()) {
			System.out.println("Refund Screen is displayed");
			WebElement Refundamnt=driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/form/div[2]/div/mnp-input/input"));
			Refundamnt.click();
			Refundamnt.sendKeys(Keys.BACK_SPACE);
			Refundamnt.sendKeys("1000");
			driver.findElement(By.xpath("//input[@placeholder='Select Payment Mode']")).click();
			driver.findElement(By.xpath("//span[text()='Cash']")).click();
			driver.findElement(By.xpath("//button[text()=' Save ']")).click();
			/*WebElement Remainingcredit=driver.findElement(By.xpath("//span[text()='₹2,000']"));
		    Assert.assertEquals(Remainingcredit, "2000", "Actual and expected credit values are matched");
		    WebElement CreditShownInInvoice=driver.findElement(By.xpath("(//div[@class='data'])[3]"));
		    Assert.assertEquals(CreditShownInInvoice, "2000", "expected credit value shown in incoice");
			*/
		
	

	public void CreditNoteType() {
		WebElement CreditType= driver.findElement(By.xpath("//span[text()='New Credit Note']"));
		CreditType.click();
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

@DataProvider(name="ProcedureTestData1")
public Object[][]ProcedureTestData1(){

	return new Object[][] {
		{"Abhilash","New Credit Note", "Procedure","1"},
		{"Vijay K","New Credit Note", "Procedure","1"},

	};
}

	}

