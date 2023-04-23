package superdoctor_tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Appointments_Page;
import pageObject.DashBoard_Modules;
import utils.BaseClass;
import utils.Library;

public class Test_SuperDoctor_is_able_to_change_patient_journey_status extends BaseClass {
	
	@Test
	public void Test_SuperDoctor_is_able_to_change_patient_journey_status_to_Checkin() throws InterruptedException {
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
	
	@Test
	public void Test_SuperDoctor_is_able_to_change_patient_journey_status_to_Engaged() throws InterruptedException {
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
	
	@Test
	public void Test_SuperDoctor_is_able_to_change_patient_journey_status_to_Checkout() throws InterruptedException {
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
	
	@Test
	public void Test_SuperDoctor_is_able_to_change_patient_journey_status_to_Confirmed() throws InterruptedException {
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

	}
}
