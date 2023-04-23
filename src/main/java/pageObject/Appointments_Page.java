package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Appointments_Page {
	
	@FindBy(how=How.XPATH, using="//div[text()=' Appointments ']")
	private WebElement AppointmentsButton;	
	
	@FindBy(how=How.XPATH, using="//button[text()=' New Appointment ']")
	private WebElement NewAppointmentsButton;
	
	@FindBy (how=How.XPATH, using="//a[text()=' All ']")
	private WebElement AllTab;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Appointment Type']")
	private WebElement AppointmenttypeFilter;
	
	@FindBy (how=How.XPATH, using="//span[text()='consultation']")
	private WebElement ConsultationFilter;
	
	@FindBy (how=How.XPATH, using="//span[text()='counselling']")
	private WebElement CounsellingFilter;
	
	@FindBy (how=How.XPATH, using="//span[text()='session']")
	private WebElement SessionFilter;
	
	@FindBy (how=How.XPATH, using="//div[@class='member-options seven']")
	private WebElement TripleDots;
	
	@FindBy (how=How.XPATH, using="//span[text()='Mark as Check in']")
	private WebElement CheckinStatus;
	
	@FindBy (how=How.XPATH, using="//span[text()='Mark as Engaged']")
	private WebElement EngagedStatus;
	
	@FindBy (how=How.XPATH, using="//span[text()='Mark as Check Out']")
	private WebElement CheckOutStatus;
	
	@FindBy (how=How.XPATH, using="//span[text()='Mark as Confirmed']")
	private WebElement Confirmed;
	
	@FindBy (how=How.XPATH, using="//input[@name='search_appointments']")
	private WebElement Searchbarold;	
	
	@FindBy (how=How.XPATH, using="//input[@placeholder='Type patient name']")
	private WebElement PatientName; 
	
	@FindBy (how=How.XPATH,using="(//label[@class='form__label'])[2]")
	private WebElement AppointmentType;
	
	@FindBy (how=How.XPATH, using="//span[text()='Book New Session']")
	private WebElement AppointmentTypeProcedure;
	
	@FindBy (how=How.XPATH, using="//button[text()='Yes']")
	private WebElement CancelYes;
	
	@FindBy (how=How.XPATH, using="//div[@class='filters-field ng-star-inserted']")
	private WebElement Filter; 
	
	@FindBy (how=How.XPATH, using="//button[text()=' Apply ']")
	private WebElement ApplyButton;
	
	@FindBy (how=How.XPATH, using="//input[@placeholder='Search Patient, Doctor, etc']")
	private WebElement SearchBarNew;
	
	@FindBy (how=How.XPATH, using="//label[text()='Show All']")
	private WebElement ShowAllCategeoryInSearch ;
	
	@FindBy (how=How.XPATH, using="//label[text()='Patient']")
	private WebElement PatientCategeoryInSearch ;
	
	@FindBy (how=How.XPATH, using="//label[text()='Doctor']")
	private WebElement DoctorCategeoryInSearch;
	
	@FindBy (how=How.XPATH, using="//div[text()='Calendar View']")
	private WebElement CalendarView;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getAppointmentsButton() {
		return AppointmentsButton;
	}

	public WebElement getNewAppointmentsButton() {
		return NewAppointmentsButton;
	}

	public WebElement getAppointmenttypeFilter() {
		return AppointmenttypeFilter;
	}

	public WebElement getConsultationFilter() {
		return ConsultationFilter;
	}

	public WebElement getCounsellingFilter() {
		return CounsellingFilter;
	}


	public WebElement getSessionFilter() {
		return SessionFilter;
	}

	public WebElement getTripleDots() {
		return TripleDots;
	}

	public WebElement getCheckinStatus() {
		return CheckinStatus;
	}

	public WebElement getEngagedStatus() {
		return EngagedStatus;
	}


	public WebElement getCheckOutStatus() {
		return CheckOutStatus;
	}

	public WebElement getPatientName() {
		return PatientName;
	}


	public WebElement getAppointmentType() {
		return AppointmentType;
	}

	public WebElement getAppointmentTypeProcedure() {
		return AppointmentTypeProcedure;
	}

	public WebElement getCancelYes() {
		return CancelYes;
	}

	public WebElement getFilter() {
		return Filter;
	}

	public WebElement getAllTab() {
		return AllTab;
	}

	public WebElement getApplyButton() {
		return ApplyButton;
	}

	public WebElement getSearchbarold() {
		return Searchbarold;
	}

	
	public WebElement getSearchBarNew() {
		return SearchBarNew;
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

	public WebElement getCalendarView() {
		return CalendarView;
	}

	public WebElement getConfirmed() {
		return Confirmed;
	}

}
