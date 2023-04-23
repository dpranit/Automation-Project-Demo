package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoard_Modules {
	@FindBy (how=How.XPATH, using="//div[text()=' Appointments ']")
	private WebElement Appointments;
	
	@FindBy(how=How.XPATH, using="/html/body/app-root/sbpro-dashboard/sbpro-layout-dashboard/span/div/div[1]/sb-side-nav/nav/div[1]/div[2]/div[1]")
	private WebElement Patients;
	
	@FindBy(how=How.XPATH, using="//div[text()=' Cost Calculator ']")
	private WebElement CostCalculator;
	
	
	@FindBy(how=How.XPATH, using="//div[text()=' Feedback ']")
	private WebElement Feedback;
	
	@FindBy(how=How.XPATH,using="(//div[@class='menu-heading ng-tns-c176-7'])[3]")
	private WebElement Clinic;
	
	@FindBy(how=How.XPATH, using="//div[text()=' Patient Education ']")
	private WebElement PatientEducation;
	
	@FindBy (how=How.XPATH, using="(//div[text()=' Patients '])[2]")
	private WebElement PatientsModule;
	
	@FindBy (how=How.XPATH, using="//div[text()=' Payments ']")
	private WebElement Payments;
	
	@FindBy (how=How.XPATH, using="//div[text()=' Procedures ']")
	private WebElement Procedures;
	
	
	public WebElement getPatients() {
		return Patients;
	}

	public WebElement getCostCalculator() {
		return CostCalculator;
	}

	public WebElement getFeedback() {
		return Feedback;
	}

	public WebElement getPatientEducation() {
		return PatientEducation;
	}

	public WebElement getClinic() {
		return Clinic;
	}

	public WebElement getPayments() {
		return Payments;
	}

	public WebElement getProcedures() {
		return Procedures;
	}

	public WebElement getAppointments() {
		return Appointments;
	}

	public WebElement getPatientsModule() {
		return PatientsModule;
	}

	public void setPatientsModule(WebElement patientsModule) {
		PatientsModule = patientsModule;
	}


}
