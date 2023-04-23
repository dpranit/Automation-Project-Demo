package calendar_booking_tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Appointments_Page;
import pageObject.Calendar_Page;
import pageObject.DashBoard_Modules;
import utils.FrontDeskLoginBaseClass;

public class Test_Make_Payment_For_Counselling_Session_From_Calendar extends FrontDeskLoginBaseClass{
		
	@Test
	public void Test_FrontDesk_is_able_to_MakePayment_For_Counselling_Session() throws InterruptedException, AWTException {
		/*DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Appointment.getCalendarView().click();
		Thread.sleep(5000);
		Calendar_Page Calendar=PageFactory.initElements(driver, Calendar_Page.class);
		Calendar.getSearchBar().click();
		Thread.sleep(2000);
		Calendar.getSearchIconinsearchbar().click();
		Thread.sleep(1000);
		Calendar.getSearchBarAfterExpanding().click();
		Thread.sleep(2000);
		
		Calendar.getSearchBarAfterExpanding().sendKeys("Superdoc_Pranit");
		Thread.sleep(1000);
		Calendar.getSearchedDoctorCheckbox().click();
		Thread.sleep(1000);
		String inputText = "Superdoc_Pranit";
		WebElement myElement = driver.findElement(By.xpath("//div[@class='search-value-holder']"));
		String js = "arguments[0].setAttribute('value','"+inputText+"')";
		((JavascriptExecutor) driver).executeScript(js, myElement);
		Thread.sleep(2000);*/
		
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Thread.sleep(1000);
		Appointment.getCalendarView().click();
		Thread.sleep(5000);
		Calendar_Page Calendar=PageFactory.initElements(driver, Calendar_Page.class);
		Calendar.getSlot().click();
		Thread.sleep(2000);
		Calendar.getCounselling().click();
		Thread.sleep(1000);
		Calendar.getPatientName().click();
		Calendar.getPatientName().sendKeys("Sumit Kale");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='categories-dropdown ml-0 w-100 ng-star-inserted']")).click();
		Thread.sleep(2000);
		Calendar.getConcern().click();
		
		Robot robot=new Robot();
		String text = "Dandruff";
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		Calendar.getAppointmentDetails().click();
		Thread.sleep(1000);
	
		Calendar.getAppointmentDetails().sendKeys("Consultation appointment booked");
		Thread.sleep(1000);
		Calendar.getAdditionalNotes().click();
		Thread.sleep(1000);
		Calendar.getAdditionalNotes().sendKeys("Acne concern");
		Thread.sleep(1000);
		Calendar.getMakepaymentandbook().click();
		Thread.sleep(2000);
		
		/*
		Calendar.getEnteramount().sendKeys("500");
		Calendar.getPaymentMethod().click();
		Thread.sleep(1000);
		Calendar.getPaymentMethod().sendKeys("Cash");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='categories-dropdown ml-0 w-100 ng-star-inserted']")).click();
		Calendar.getRecordPaymentButton().click();
		Thread.sleep(2000);
		Calendar.getViewInvoice().click();
		Thread.sleep(2000);*/

	}
}
