package doctor_tests;

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
import utils.DoctorLogin;
import utils.Library;

public class Test_Doctor_is_able_to_change_patient_journey_status extends DoctorLogin{
	
	@Test(priority = 1)
	public void Test_Doctor_Booking_Consultation_Appointment() throws InterruptedException, AWTException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Thread.sleep(1000);
		Appointment.getCalendarView().click();
		Thread.sleep(5000);
		Calendar_Page Calendar=PageFactory.initElements(driver, Calendar_Page.class);
		Calendar.getSearchBar().click();
		Calendar.getSearchBarAfterExpanding().click();
		Robot robot=new Robot();
		String text = "Dr. Pranit";
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=' Dr. Pranit']")).click();
		//Calendar.getSearchedDoctorCheckbox().click();
		Thread.sleep(3000);
		Calendar.getViewScheduleButton().click();
		Thread.sleep(1000);
		Calendar.getSlot11Am().click();
		Thread.sleep(2000);
		Calendar.getPatientName().click();
		Thread.sleep(1000);
		Calendar.getPatientName().sendKeys("Pranit Dhole");
		Thread.sleep(2000);
		Calendar.getConcern().click();
		Thread.sleep(1000);		
		String text2 = "Dandruff";
		StringSelection stringSelection2 = new StringSelection(text);
		Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
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
	
	/*
	@Test(priority = 2)
	public void Test_Doctor_is_able_to_change_patient_journey_status_to_checkin() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Appointments_Page Appointments=PageFactory.initElements(driver, Appointments_Page.class);
		Appointments.getTripleDots().click();
		Library.Custom_Click(Appointments.getCheckinStatus());
		Thread.sleep(2000);
		System.out.println("Status changed");
		
	}
	
	@Test(priority = 3)
	public void Test_Doctor_is_able_to_change_patient_journey_status_to_Engaged() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Appointments_Page Appointments=PageFactory.initElements(driver, Appointments_Page.class);
		Appointments.getTripleDots().click();
		Library.Custom_Click(Appointments.getEngagedStatus());
		Thread.sleep(2000);
		System.out.println("Status changed");

		
	}
	
	@Test(priority = 4)
	public void Test_Doctor_is_able_to_change_patient_journey_status_to_Checkout() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Appointments_Page Appointments=PageFactory.initElements(driver, Appointments_Page.class);
		Appointments.getTripleDots().click();
		Library.Custom_Click(Appointments.getCheckOutStatus());
		Thread.sleep(2000);
		System.out.println("Status changed");
		
	}
	
	@Test(priority = 5)
	public void Test_Doctor_is_able_to_change_patient_journey_status_to_Confirmed() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Appointments_Page Appointments=PageFactory.initElements(driver, Appointments_Page.class);
		Appointments.getTripleDots().click();
		Library.Custom_Click(Appointments.getConfirmed());
		Thread.sleep(2000);
		System.out.println("Status changed");

	}*/
	
}
