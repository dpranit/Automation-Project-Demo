package frontdesk_tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Consultations_Page;
import pageObject.DashBoard_Modules;
import utils.FrontDeskLoginBaseClass;

public class Test_FrontDesk_is_able_to_access_filters_in_consultations_screen extends FrontDeskLoginBaseClass {
	
	@Test
	public void Test_FrontDesk_is_able_to_AllFilter() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Consultations.getAllTab().click();
		Thread.sleep(1000);
		Consultations.getFilterButton().click();
		Thread.sleep(1000);
		Consultations.getConsultationStatus().click();
		Thread.sleep(1000);
		Consultations.getConsultationStatusAll().click();
		Thread.sleep(1000);
		Consultations.getApplyFilter().click();
		Thread.sleep(1000);
	}
	
	@Test
	public void Test_FrontDesk_is_able_to_ScheduledFilter() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Consultations.getAllTab().click();
		Thread.sleep(1000);
		Consultations.getFilterButton().click();
		Thread.sleep(1000);
		Consultations.getConsultationStatus().click();
		Thread.sleep(1000);
		Consultations.getConsultationStatusScheduled().click();
		Thread.sleep(1000);
		Consultations.getApplyFilter().click();
		Thread.sleep(1000);

	}
	
	@Test
	public void Test_FrontDesk_is_able_to_DraftFilter() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(1000);
		Consultations.getAllTab().click();
		Thread.sleep(1000);
		Consultations.getFilterButton().click();
		Thread.sleep(2000);
		Consultations.getConsultationStatus().click();
		Thread.sleep(2000);
		Consultations.getConsultationStatusDraft().click();
		Thread.sleep(1000);
		Consultations.getApplyFilter().click();
		Thread.sleep(1000);

	}
	
	@Test
	public void Test_FrontDesk_is_able_to_CancelledFilter() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(1000);
		Consultations.getAllTab().click();
		Thread.sleep(1000);
		Consultations.getFilterButton().click();
		Thread.sleep(1000);
		Consultations.getConsultationStatus().click();
		Thread.sleep(1000);
		Consultations.getConsultationStatusCancelled().click();
		Thread.sleep(1000);
		Consultations.getApplyFilter().click();
		Thread.sleep(1000);

	}
	

	@Test
	public void Test_FrontDesk_is_able_to_Apply_PatientStaus_AllFilter() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(1000);
		Consultations.getAllTab().click();
		Thread.sleep(1000);
		Consultations.getFilterButton().click();
		Thread.sleep(1000);
		Consultations.getPatientStatus().click();
		Thread.sleep(1000);
		Consultations.getPatientStatusAll().click();
		Thread.sleep(1000);
		Consultations.getApplyFilter().click();
	}
	
	@Test
	public void Test_FrontDesk_is_able_to_Apply_PatientStaus_EngagedFilter() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(1000);
		Consultations.getAllTab().click();
		Thread.sleep(1000);
		Consultations.getFilterButton().click();
		Thread.sleep(1000);
		Consultations.getPatientStatus().click();
		Thread.sleep(1000);
		Consultations.getPatientStatusEngaged().click();
		Thread.sleep(1000);
		Consultations.getApplyFilter().click();
	}
	
	@Test
	public void Test_FrontDesk_is_able_to_Apply_PatientStaus_CheckinFilter() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(1000);
		Consultations.getAllTab().click();
		Thread.sleep(1000);
		Consultations.getFilterButton().click();
		Thread.sleep(1000);
		Consultations.getPatientStatus().click();
		Thread.sleep(1000);
		Consultations.getPatientStatusCheckIn().click();
		Thread.sleep(1000);
		Consultations.getApplyFilter().click();
		Thread.sleep(1000);

	}
	
	@Test
	public void Test_FrontDesk_is_able_to_Apply_PatientStaus_CheckOutFilter() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(1000);
		Consultations.getAllTab().click();
		Thread.sleep(1000);
		Consultations.getFilterButton().click();
		Thread.sleep(1000);
		Consultations.getPatientStatus().click();
		Thread.sleep(1000);
		Consultations.getPatientStatusCheckOut().click();
		Thread.sleep(1000);
		Consultations.getApplyFilter().click();
		Thread.sleep(1000);

	}
	
	
	
}
