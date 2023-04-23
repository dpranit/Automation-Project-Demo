package frontdesk_tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import pageObject.Procedures_Pg;
import utils.FrontDeskLoginBaseClass;

public class Test_FrontDesk_is_able_to_access_filters_in_procedure_screen extends FrontDeskLoginBaseClass {
	
	@Test
	public void Test_FrontDesk_is_able_to_check_ScheduledSessions() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getProcedures().click();
		Thread.sleep(1000);
		Procedures_Pg Procedure=PageFactory.initElements(driver, Procedures_Pg.class);
		Procedure.getAllSessionsTab().click();
		Thread.sleep(1000);
		Procedure.getFilterButton().click();
		Thread.sleep(1000);
		Procedure.getSessionStatus().click();
		Thread.sleep(1000);
		Procedure.getScheduledStatus().click();
		Thread.sleep(1000);
		Procedure.getApplyButton().click();
		Thread.sleep(1000);

		
	}
	
	@Test
	public void Test_FrontDesk_is_able_to_check_DraftedSessions() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getProcedures().click();
		Thread.sleep(1000);
		Procedures_Pg Procedure=PageFactory.initElements(driver, Procedures_Pg.class);
		Procedure.getAllSessionsTab().click();
		Thread.sleep(1000);
		Procedure.getFilterButton().click();
		Thread.sleep(1000);
		Procedure.getSessionStatus().click();
		Thread.sleep(1000);
		Procedure.getDraftStatus().click();
		Thread.sleep(1000);
		Procedure.getApplyButton().click();
		Thread.sleep(1000);

		
	}
	
	@Test
	public void Test_FrontDesk_is_able_to_check_CancelledSessions() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Patients.getProcedures().click();
		Thread.sleep(1000);
		Procedures_Pg Procedure=PageFactory.initElements(driver, Procedures_Pg.class);
		Procedure.getAllSessionsTab().click();
		Thread.sleep(1000);
		Procedure.getFilterButton().click();
		Thread.sleep(1000);
		Procedure.getSessionStatus().click();
		Thread.sleep(1000);
		Procedure.getCancelledStatus().click();
		Thread.sleep(1000);
		Procedure.getApplyButton().click();	
		Thread.sleep(1000);

	}
	
}
