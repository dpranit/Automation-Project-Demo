package doctor_tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Appointments_Page;
import pageObject.DashBoard_Modules;
import utils.DoctorLogin;

public class Test_Doctor_is_able_to_access_filters extends DoctorLogin{

		@Test
		public void Test_Doctor_is_able_to_apply_Consultationfilter_in_appointmentsScreen() throws InterruptedException {
			DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
			Patients.getPatients().click();
			Thread.sleep(2000);
			Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
			Appointment.getAppointmentsButton().click();
			Appointment.getAllTab().click();
			Appointment.getFilter().click();
			Appointment.getAppointmenttypeFilter().click();
			Appointment.getConsultationFilter().click();
			Appointment.getApplyButton().click();
			}
		
		@Test
		public void Test_Doctor_is_able_to_apply_Counsellingfilter_in_appointmentsScreen() throws InterruptedException {
			DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
			Patients.getPatients().click();
			Thread.sleep(2000);
			Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
			Appointment.getAppointmentsButton().click();
			Appointment.getAllTab().click();
			Appointment.getFilter().click();
			Appointment.getAppointmenttypeFilter().click();
			Appointment.getCounsellingFilter().click();
			Appointment.getApplyButton().click();
			}
		
		@Test
		public void Test_Doctor_is_able_to_apply_Sessionfilter_in_appointmentsScreen() throws InterruptedException {
			DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
			Patients.getPatients().click();
			Thread.sleep(2000);
			Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
			Appointment.getAppointmentsButton().click();
			Appointment.getAllTab().click();
			Appointment.getFilter().click();
			Appointment.getAppointmenttypeFilter().click();
			Appointment.getSessionFilter().click();
			Appointment.getApplyButton().click();
			}
			
			
		
}
