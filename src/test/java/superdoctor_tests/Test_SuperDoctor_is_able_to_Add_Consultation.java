package superdoctor_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Consultations_Page;
import pageObject.DashBoard_Modules;
import utils.BaseClass;

public class Test_SuperDoctor_is_able_to_Add_Consultation extends BaseClass{
	@Test
	public void Test_SuperDoctor_is_able_to_add_consultation () throws InterruptedException {
		//Test Doctor is able to start consultation directly from their login
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(2000);
		Consultations.getNewConsultation().click();
		Thread.sleep(2000);
		Consultations.getPatientName().click();
		Consultations.getPatientName().sendKeys("Smaran");
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Consultations.getGeneratePrescription().click();
		Thread.sleep(3000);
		Consultations.getLooksFine().click();
		Thread.sleep(5000);
		Consultations.getEndConsultation().click();
		Thread.sleep(3000);
		System.out.println("Consultation Ended");
		
	}
	
	@Test 
	public void Test_SuperDoctor_is_able_to_add_consultation_and_save_it_AsDraft() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(2000);
		Consultations.getNewConsultation().click();
		Thread.sleep(2000);
		Consultations.getPatientName().click();
		Consultations.getPatientName().sendKeys("Sumit Kale");
		driver.findElement(By.xpath("//li[@class='ng-star-inserted']")).click();
		Consultations.getSaveAsDraft().click();
		Thread.sleep(2000);
		System.out.println("Consultation saved as draft");
	}
	
	
	@Test(dependsOnMethods = { "Test_SuperDoctor_is_able_to_add_consultation_and_save_it_AsDraft" })
	public void Test_SuperDoctor_is_able_to_resume_Drafted_consultation() throws InterruptedException {
		DashBoard_Modules Patients=PageFactory.initElements(driver, DashBoard_Modules.class);
		Patients.getPatients().click();
		Thread.sleep(2000);
		Consultations_Page Consultations=PageFactory.initElements(driver, Consultations_Page.class);
		Consultations.getConsultations().click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Resume']")).click();
		Thread.sleep(2000);
		System.out.println("Consultation resumed");
		
	}
	
	
	
	
}
