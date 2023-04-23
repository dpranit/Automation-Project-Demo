package doctor_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Appointments_Page;
import pageObject.Consultations_Page;
import pageObject.DashBoard_Modules;
import utils.DoctorLogin;

public class Test_SearxhFunctionality_in_Doctor_Role extends DoctorLogin{
	@Test 
	public void Test_Search_By_PatientName_in_appointmentsScreen() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Appointment.getSearchBarNew().click();
		Thread.sleep(2000);
		Appointment.getPatientCategeoryInSearch().click();
		Thread.sleep(1000);
		Appointment.getSearchBarNew().click();
		Appointment.getSearchBarNew().sendKeys("Pranit Dhole");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='item ng-star-inserted']")).click();
		System.out.println("Patient Searched");
		
		}
	
	
	
	@Test
	public void Test_Search_By_PatientName_in_ConsultationsScreen() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Consultations.getSearchBar().click();
		Thread.sleep(2000);
		Consultations.getPatientCategeoryInSearch().click();
		Thread.sleep(1000);
		Consultations.getSearchBar().click();
		Consultations.getSearchBar().sendKeys("Akshay");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item ng-star-inserted']")).click();
		System.out.println("Patient Searched");
		
	
	
		
		}
}
