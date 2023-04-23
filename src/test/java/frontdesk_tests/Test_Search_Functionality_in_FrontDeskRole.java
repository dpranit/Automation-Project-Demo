package frontdesk_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Appointments_Page;
import pageObject.Consultations_Page;
import pageObject.DashBoard_Modules;
import utils.FrontDeskLoginBaseClass;

public class Test_Search_Functionality_in_FrontDeskRole extends FrontDeskLoginBaseClass {
	
	@Test 
	public void Test_Search_By_PatientName_in_appointmentsScreen() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Thread.sleep(1000);
		Appointment.getSearchBarNew().click();
		Thread.sleep(2000);
		Appointment.getPatientCategeoryInSearch().click();
		Thread.sleep(1000);
		Appointment.getSearchBarNew().click();
		Thread.sleep(1000);
		Appointment.getSearchBarNew().sendKeys("Pranit Dhole");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='item ng-star-inserted']")).click();
		Thread.sleep(1000);
		System.out.println("Patient Searched");
		
		}
	
	@Test 
	public void Test_Search_By_DoctorNamein_appointmentsScreen() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Appointments_Page Appointment=PageFactory.initElements(driver, Appointments_Page.class);
		Appointment.getAppointmentsButton().click();
		Thread.sleep(1000);
		Appointment.getSearchBarNew().click();
		Thread.sleep(2000);
		Appointment.getDoctorCategeoryInSearch().click();
		Thread.sleep(1000);
		Appointment.getSearchBarNew().click();
		Thread.sleep(1000);
		Appointment.getSearchBarNew().sendKeys("Kalyan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='item ng-star-inserted']")).click();
		Thread.sleep(1000);
		System.out.println("Doctor Searched");
		
		}
	
	@Test
	public void Test_Search_By_PatientName_in_ConsultationsScreen() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(1000);
		Consultations.getSearchBar().click();
		Thread.sleep(2000);
		Consultations.getPatientCategeoryInSearch().click();
		Thread.sleep(1000);
		Consultations.getSearchBar().click();
		Thread.sleep(1000);
		Consultations.getSearchBar().sendKeys("Akshay");
		Thread.sleep(1000);
		try {
		driver.findElement(By.xpath("//div[@class='item ng-star-inserted']")).click();
		Thread.sleep(1000);
		}
		catch(Exception e) {
			WebElement element=driver.findElement(By.xpath("//div[@class='item ng-star-inserted']"));
			element.click();
			Thread.sleep(1000);
		}
		System.out.println("Patient Searched");
		
	}
	
	@Test 
	public void Test_Search_By_DoctorNamein_ConsultationsScreen() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(1000);
		Consultations.getSearchBar().click();
		Thread.sleep(2000);
		Consultations.getDoctorCategeoryInSearch().click();
		Thread.sleep(1000);
		Consultations.getSearchBar().click();
		Thread.sleep(1000);
		Consultations.getSearchBar().sendKeys("Kalyan");
		Thread.sleep(1000);
		
		try {
			driver.findElement(By.xpath("//div[@class='item ng-star-inserted']")).click();
			Thread.sleep(1000);
			}
			catch(Exception e) {
				WebElement element=driver.findElement(By.xpath("//div[@class='item ng-star-inserted']"));
				element.click();
				Thread.sleep(1000);
			}
		System.out.println("Patient Searched");
		
		}
}
