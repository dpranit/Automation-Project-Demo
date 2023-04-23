package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Consultations_Page {
	
	@FindBy(how=How.XPATH, using="//div[text()=' Consultations ']")
	private WebElement Consultations;
	
	@FindBy(how=How.XPATH, using="//button[@class='button-container']")
	private WebElement NewConsultation ;
	

	@FindBy(how=How.XPATH, using="//a[text()='Completed']")
	private WebElement CompletedTab ;

	@FindBy(how=How.XPATH, using="//a[text()='All']")
	private WebElement AllTab ;

	@FindBy(how=How.XPATH, using="//div[@class='table-header-column-title icon']")
	private WebElement FilterButton ;
	

	@FindBy(how=How.XPATH, using="//input[@placeholder='Status']")
	private WebElement ConsultationStatus ;
	

	@FindBy(how=How.XPATH, using="//span[text()='all']")
	private WebElement ConsultationStatusAll ;
	
	@FindBy(how=How.XPATH, using="//span[text()='scheduled']")
	private WebElement ConsultationStatusScheduled ;
	
	@FindBy(how=How.XPATH, using="//span[text()='draft']")
	private WebElement ConsultationStatusDraft ;
	
	@FindBy(how=How.XPATH, using="//span[text()='cancelled']")
	private WebElement ConsultationStatusCancelled ;
	
	@FindBy(how=How.XPATH, using="//button[text()=' Apply ']")
	private WebElement ApplyFilter ;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Patient Status']")
	private WebElement PatientStatus;
	
	@FindBy(how=How.XPATH, using="//span[text()='all']")
	private WebElement PatientStatusAll ;
	
	@FindBy(how=How.XPATH, using="//span[text()='engaged']")
	private WebElement PatientStatusEngaged;
	
	@FindBy(how=How.XPATH, using="//span[text()='check in']")
	private WebElement PatientStatusCheckIn ;
	
	@FindBy(how=How.XPATH, using="//span[text()='check out']")
	private WebElement PatientStatusCheckOut;
	
	@FindBy(how=How.XPATH, using="//span[text()='no show']")
	private WebElement PatientStatusNoShow;
	
	@FindBy (how=How.XPATH, using="//input[@placeholder='Search Patient, Doctor, etc']")
	private WebElement SearchBar;
	
	@FindBy (how=How.XPATH, using="//label[text()='Show All']")
	private WebElement ShowAllCategeoryInSearch ;
	
	@FindBy (how=How.XPATH, using="//label[text()='Patient']")
	private WebElement PatientCategeoryInSearch ;
	
	@FindBy (how=How.XPATH, using="//label[text()='Doctor']")
	private WebElement DoctorCategeoryInSearch;
	
	@FindBy (how=How.XPATH, using="//input[@placeholder='Type Patient Name']")
	private WebElement PatientName;
	
	@FindBy (how=How.XPATH, using="//button[text()=' Generate Prescription ']")
	private WebElement GeneratePrescription;
	
	public WebElement getPatientName() {
		return PatientName;
	}




	public WebElement getGeneratePrescription() {
		return GeneratePrescription;
	}
	
	@FindBy (how=How.XPATH,using="//button[text()=' Save as Draft ']")
	private WebElement SaveAsDraft;

	
	

	public WebElement getSaveAsDraft() {
		return SaveAsDraft;
	}


	public WebElement getLooksFine() {
		return LooksFine;
	}


	public WebElement getEndConsultation() {
		return EndConsultation;
	}


	@FindBy(how=How.XPATH, using="//button[text()=' Looks Fine ']")
	private WebElement LooksFine;
	
	@FindBy(how=How.XPATH, using="//button[text()=' End Consultation ']")
	private WebElement EndConsultation; 
	
	
	
	
	public WebElement getConsultations() {
		return Consultations;
	}

	
	public WebElement getNewConsultation() {
		return NewConsultation;
	}


	public WebElement getCompletedTab() {
		return CompletedTab;
	}

	
	public WebElement getAllTab() {
		return AllTab;
	}


	public WebElement getFilterButton() {
		return FilterButton;
	}

	

	public WebElement getConsultationStatus() {
		return ConsultationStatus;
	}

	

	public WebElement getConsultationStatusAll() {
		return ConsultationStatusAll;
	}

	
	public WebElement getConsultationStatusScheduled() {
		return ConsultationStatusScheduled;
	}

	
	public WebElement getConsultationStatusDraft() {
		return ConsultationStatusDraft;
	}

	

	public WebElement getConsultationStatusCancelled() {
		return ConsultationStatusCancelled;
	}

	

	public WebElement getApplyFilter() {
		return ApplyFilter;
	}


	public WebElement getPatientStatus() {
		return PatientStatus;
	}


	

	public WebElement getPatientStatusAll() {
		return PatientStatusAll;
	}


	

	public WebElement getPatientStatusEngaged() {
		return PatientStatusEngaged;
	}


	public WebElement getPatientStatusCheckIn() {
		return PatientStatusCheckIn;
	}

	
	public WebElement getPatientStatusCheckOut() {
		return PatientStatusCheckOut;
	}

	
	public WebElement getPatientStatusNoShow() {
		return PatientStatusNoShow;
	}


	public WebElement getSearchBar() {
		return SearchBar;
	}


	public WebElement getShowAllCategeoryInSearch() {
		return ShowAllCategeoryInSearch;
	}


	public WebElement getPatientCategeoryInSearch() {
		return PatientCategeoryInSearch;
	}



	public WebElement getDoctorCategeoryInSearch() {
		return DoctorCategeoryInSearch;
	}



	
}
