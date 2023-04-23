package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Patients_Page {

	@FindBy(how=How.XPATH, using="//button[@class='button-filled-primary-sharp bold']")
	private WebElement NewPatientButton;	
	
	@FindBy(how=How.XPATH, using="//label[text()='Patient Name ']")
	private WebElement PatientName;

	public WebElement getNewPatientButton() {
		return NewPatientButton;
	}

	public void setNewPatientButton(WebElement newPatientButton) {
		NewPatientButton = newPatientButton;
	}

	public WebElement getPatientName() {
		return PatientName;
	}

	public void setPatientName(WebElement patientName) {
		PatientName = patientName;
	}	
	
	/*
	@FindBy(how=How.XPATH, using="")
	private WebElement ;	
	
	@FindBy(how=How.XPATH, using="")
	private WebElement ;	
	
	@FindBy(how=How.XPATH, using="")
	private WebElement ;	
	*/
}
