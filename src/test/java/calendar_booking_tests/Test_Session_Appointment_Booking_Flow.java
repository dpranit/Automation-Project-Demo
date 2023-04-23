package calendar_booking_tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Appointments_Page;
import pageObject.Calendar_Page;
import pageObject.DashBoard_Modules;
import utils.FrontDeskLoginBaseClass;

public class Test_Session_Appointment_Booking_Flow extends FrontDeskLoginBaseClass {
		
	@Test 
	public void Test_FrontDesk_is_able_to_book_session_for_Superdoctor() throws InterruptedException, AWTException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Appointment.getCalendarView().click();
		Thread.sleep(5000);
		Calendar_Page Calendar=PageFactory.initElements(driver, Calendar_Page.class);
		Calendar.getSearchBar().click();
		Calendar.getSearchBarAfterExpanding().click();
		Robot robot=new Robot();
		
		String text = "Superdoc_Pranit";
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		Calendar.getSearchedDoctorCheckbox().click();
		Thread.sleep(3000);
		Calendar.getViewScheduleButton().click();
		Thread.sleep(1000);
		Calendar.getBookSession().click();
		Calendar.getPatientName().sendKeys("Riitika");
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(2000);
		Calendar.getBookANewProcedure().click();
		Calendar.getSelectProceduretoaddsession().click();
		Thread.sleep(1000);
		Calendar.getSelectProceduretoaddsession().sendKeys("Pico Toning");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(1000);
		Calendar.getConsultedDoctor().click();
		Thread.sleep(1000);
		Calendar.getConsultedDoctor().sendKeys("Superdoc_Pranit");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(1000);
		Calendar.getNextButton().click();
		Thread.sleep(1000);
		Calendar.getScheduleSession().click();
		Thread.sleep(1000);		
		Calendar.getPickslot1().click();
		Thread.sleep(500);
		Thread.sleep(500);
		Calendar.getPicksecondslotforsession().click();
		Thread.sleep(2000);
		try {
			Calendar.getCheckBox().click();
		}
		catch(StaleElementReferenceException e) {
			WebElement checkbox=driver.findElement(By.id("0"));
			checkbox.click();
		}
		Thread.sleep(3000);
		Calendar.getNextButton().click();
		Thread.sleep(2000);
		Calendar.getBookingSessionButton().click();
		Thread.sleep(2000);
		System.out.println("Session Booked for superdoc pranit");
		Thread.sleep(2000);
	}
	
	
	
	@Test 
	public void Test_FrontDesk_is_able_to_book_session_for_Doctor() throws InterruptedException, AWTException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
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
		Thread.sleep(2000);
		Calendar.getViewScheduleButton().click();
		Thread.sleep(1000);
		Calendar.getBookSession().click();
		Thread.sleep(1000);
		Calendar.getPatientName().sendKeys("Riitika");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(2000);
		Calendar.getBookANewProcedure().click();
		Calendar.getSelectProceduretoaddsession().click();
		Thread.sleep(1000);
		Calendar.getSelectProceduretoaddsession().sendKeys("Pico Toning");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(1000);
		Calendar.getConsultedDoctor().click();
		Thread.sleep(1000);
		Calendar.getConsultedDoctor().sendKeys("Superdoc_Pranit");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(1000);
		Calendar.getNextButton().click();
		Thread.sleep(1000);
		Calendar.getScheduleSession().click();
		Thread.sleep(1000);		
		Calendar.getPickslot1().click();
		Thread.sleep(500);
		Thread.sleep(500);
		Calendar.getPicksecondslotforsession().click();
		Thread.sleep(2000);
		try {
			Calendar.getCheckBox().click();
		}
		catch(StaleElementReferenceException e) {
			WebElement checkbox=driver.findElement(By.id("0"));
			checkbox.click();
		}
		Thread.sleep(3000);
		Calendar.getNextButton().click();
		Thread.sleep(2000);
		Calendar.getBookingSessionButton().click();
		Thread.sleep(2000);
		System.out.println("Session Booked for superdoc pranit");
		Thread.sleep(2000);
	}
	
	@Test 
	public void Test_FrontDesk_is_able_to_book_session_for_Therapist() throws InterruptedException, AWTException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Appointment.getCalendarView().click();
		Thread.sleep(5000);
		Calendar_Page Calendar=PageFactory.initElements(driver, Calendar_Page.class);
		Calendar.getSearchBar().click();
		Calendar.getSearchBarAfterExpanding().click();
		Robot robot=new Robot();
		String text = "Therapist_Smaran";
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=' Therapist_Smaran']")).click();
		Thread.sleep(2000);
		Calendar.getViewScheduleButton().click();
		Thread.sleep(1000);
		Calendar.getBookSession().click();
		Thread.sleep(1000);
		Calendar.getPatientName().sendKeys("Sumit Kale");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(2000);
		Calendar.getBookANewProcedure().click();
		Calendar.getSelectProceduretoaddsession().click();
		Thread.sleep(1000);
		Calendar.getSelectProceduretoaddsession().sendKeys("BOTOX Crow's Feet");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(1000);
		Calendar.getConsultedDoctor().click();
		Thread.sleep(1000);
		Calendar.getConsultedDoctor().sendKeys("Superdoc_Pranit");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Thread.sleep(1000);
		Calendar.getNextButton().click();
		Thread.sleep(1000);
		Calendar.getScheduleSession().click();
		Thread.sleep(1000);		
		Calendar.getPickslot1().click();
		Thread.sleep(500);
		Thread.sleep(500);
		Calendar.getPicksecondslotforsession().click();
		Thread.sleep(2000);
		try {
			Calendar.getCheckBox().click();
		}
		catch(StaleElementReferenceException e) {
			WebElement checkbox=driver.findElement(By.id("0"));
			checkbox.click();
		}
		Thread.sleep(3000);
		Calendar.getNextButton().click();
		Thread.sleep(2000);
		Calendar.getBookingSessionButton().click();
		Thread.sleep(2000);
		System.out.println("Session Booked for superdoc pranit");
		Thread.sleep(2000);
	}
}
