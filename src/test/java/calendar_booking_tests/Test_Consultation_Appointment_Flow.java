package calendar_booking_tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Appointments_Page;
import pageObject.Calendar_Page;
import pageObject.DashBoard_Modules;
import utils.FrontDeskLoginBaseClass;

public class Test_Consultation_Appointment_Flow extends FrontDeskLoginBaseClass{

	@Test
	public void Test_FrontDesk_is_able_to_book_consultation_appointment() throws InterruptedException, Exception {
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
		Calendar.getPatientName().click();
		Thread.sleep(1000);
		Calendar.getPatientName().sendKeys("Pranit Dhole");
		Thread.sleep(2000);
		Calendar.getConcern().click();
		Thread.sleep(1000);		
		
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
		driver.findElement(By.xpath("//div[@class='categories-dropdown ml-0 w-100 ng-star-inserted']")).click();
		Thread.sleep(1000);
		
		
		
		
		Calendar.getAppointmentDetails().click();
		Calendar.getAppointmentDetails().sendKeys("Consultation appointment booked");
		Calendar.getAdditionalNotes().click();
		Thread.sleep(1000);
		Calendar.getAdditionalNotes().sendKeys("Acne concern");
		Thread.sleep(1000);
		Calendar.getBookAppointmentButton().click();
		Thread.sleep(2000);


	}
}
