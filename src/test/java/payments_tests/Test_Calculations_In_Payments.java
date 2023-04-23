package payments_tests;

import static org.testng.Assert.assertEquals;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;

import org.testng.Assert;


import utils.BaseClass;

public class Test_Calculations_In_Payments extends BaseClass {
	
	@Test(groups= {"SuperDoctor"},dataProvider="ProductTestData")
	public void Test_Total_Amount_BasedOn_UnitQuantity_CostPerUnit(String Name, String Type, String PaymentFor) throws InterruptedException{
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
		CreditNoteType();
		Thread.sleep(1000);
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
	}
	
		
	
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
	@DataProvider(name="ProductTestData")
	public Object[][]ProductTestData(){

		return new Object[][] {
			{"Abhilash","New Credit Note","Product"},
			//{"Vijay K","New Credit Note","Product"},
		};
}
}
