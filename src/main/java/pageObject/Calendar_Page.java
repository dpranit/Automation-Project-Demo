package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Calendar_Page {
	
	@FindBy(how=How.XPATH, using="//div[@class='cal-hour ng-star-inserted']")
	private WebElement Slot;
	
	@FindBy(how=How.XPATH, using="(//div[@class='cal-hour ng-star-inserted'])[3]")
	private WebElement Slot11Am;
	
	
	
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Search multiple people, rooms, etc...']")
	private WebElement SearchBar;
	
	@FindBy(how=How.XPATH, using="(//div[@class='search-icon'])[2]")
	private WebElement SearchIconinsearchbar;
	
	@FindBy (how=How.XPATH, using="//div[@class='search-value-holder']")
	private WebElement SearchBarAfterExpanding;
	
	
	@FindBy(how=How.XPATH, using="(//div[@class='selected-value-holder'])[2]")
	private WebElement SelectCategeoryDropDown;
	
	
	@FindBy(how=How.XPATH, using="//span[text()='Doctors']")
	private WebElement DoctorsCategeory ;
	
	
	@FindBy(how=How.XPATH, using="//span[text()='Show all']")
	private WebElement ShowAllCategeory ;
	
	
	@FindBy(how=How.XPATH, using="//span[text()='Therapists']")
	private WebElement TherapistCategeory;
	
	
	@FindBy(how=How.XPATH, using="//span[text()='Consultants']")
	private WebElement ConsultantCategeory;
	
	
	@FindBy(how=How.XPATH, using="//button[text()='Book Session']")
	private WebElement BookSession;
	

	@FindBy(how=How.XPATH, using="//mnp-button[@styled='filled-primary-sharp']")
	private WebElement BookingSessionButton;
	
	

	@FindBy(how= How.XPATH, using="//div[@class='add-appointment-container ng-star-inserted']")
	private WebElement AppointmentContainer;
		
	@FindBy(how=How.XPATH, using="//input[@placeholder='Type Patient Name']")
	private WebElement PatientName;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Type your concern here']")
	private WebElement Concern;
	
	@FindBy(how=How.XPATH, using="//textarea[@placeholder='Appointment Details']")
	private WebElement AppointmentDetails;
	
	@FindBy(how=How.XPATH, using="//textarea[@placeholder='Additional notes']")
	private WebElement AdditionalNotes;
	
	@FindBy(how=How.XPATH, using="//button[text()='Book appointment']")
	private WebElement BookAppointmentButton;
	
	@FindBy(how=How.XPATH, using="(//div[@class='input-field ng-star-inserted'])[2]")
	private WebElement Counselling;
	
	@FindBy(how=How.XPATH, using="//label[text()='Show All']")
	private WebElement CalendarShowAllcategeory;
	
	@FindBy(how=How.ID, using="636c8cb08de6d6b67f436599")
	private WebElement SearchedDoctorCheckbox;
	
	@FindBy(how=How.XPATH, using="//button[text()='Make payment and book']")
	private WebElement Makepaymentandbook;
	
	@FindBy(how=How.XPATH, using="//div[@class='field-one']")
	private WebElement Enteramount;
	

	@FindBy(how=How.XPATH,using="//div[@class='custom_selector_cell calendar-theme ng-star-inserted']")	
	private WebElement PaymentMethod;
	
	@FindBy(how=How.XPATH, using="//button[text()=' Record Payment ']")
	private WebElement RecordPaymentButton;
	
	@FindBy(how=How.XPATH, using="//button[text()=' View Invoice ']")
	private WebElement ViewInvoice;
	
	@FindBy(how=How.XPATH, using="//div[@role='application']")
	private WebElement BookedCounsellingsession;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Cancel appointment ']")
	private WebElement CancelAppointmentbutton;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Yes, cancel it ']")
	private WebElement confirmcalncel;
	
	@FindBy(how=How.XPATH,using="//span[@class='checkmark']")
	private WebElement Removefromcalendar;
	
	@FindBy(how=How.XPATH, using="//button[text()=' Done ']")
	private WebElement CancelfromcalendarDonButton;
	
	@FindBy(how=How.XPATH, using="//button[text()='View Schedule']")
	private WebElement ViewScheduleButton;
	
	@FindBy(how=How.XPATH, using="//button[text()='Book Session']")
	private WebElement BookSessionButton;
	
	@FindBy(how=How.XPATH, using="//label[@for='new']")
	private WebElement BookANewProcedure;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Type to select a procedure']")
	private WebElement SelectProceduretoaddsession;
	
	@FindBy (how=How.XPATH, using="//input[@placeholder='Type staff name']")
	private WebElement ConsultedDoctor;
	

	@FindBy (how=How.XPATH, using="//mnp-input[@placeholder='sessions']")
	private WebElement NoofUnits;
	
	@FindBy (how=How.XPATH, using="//mnp-input[@label='Number of Sessions <strong>*</strong>']")
	private WebElement Noofsessions;
	
	@FindBy(how=How.XPATH,using="//button[text()='Next']")
	private WebElement NextButton;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Schedule ']")
	private WebElement ScheduleSession;
	
	@FindBy(how=How.XPATH,using="(//div[@class='slot ng-star-inserted'])[1]")
	private WebElement Pickslot1;
	
	@FindBy(how=How.XPATH,using="/html/body/app-root/mnp-patients/sbpro-layout-dashboard/span/div/div[2]/main/mnp-all-appointments/div/mnp-appointments-calendar/div/div/div[2]/mnp-day-view-scheduler/div/div[2]/div[2]/cdk-virtual-scroll-viewport/div[1]/div/div/div[2]/div[2]")
	private WebElement Pickslot2;
	
	@FindBy(how=How.XPATH,using="(//div[@class='slot ng-star-inserted'])[13]")
	private WebElement Picksecondslotforsession;
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private WebElement CheckBox;
	
	@FindBy(how=How.XPATH,using="//div[text()=' Dismiss ']")
	private WebElement Dissmiss;
	
	
	
	
	
	
	
	
	public WebElement getSlot() {
		return Slot;
	}

	public WebElement getSearchBar() {
		return SearchBar;
	}



	public WebElement getSelectCategeoryDropDown() {
		return SelectCategeoryDropDown;
	}



	public WebElement getDoctorsCategeory() {
		return DoctorsCategeory;
	}

	public WebElement getShowAllCategeory() {
		return ShowAllCategeory;
	}


	public WebElement getTherapistCategeory() {
		return TherapistCategeory;
	}

	public WebElement getConsultantCategeory() {
		return ConsultantCategeory;
	}


	public WebElement getBookSession() {
		return BookSession;
	}

	public WebElement getAppointmentContainer() {
		return AppointmentContainer;
	}

	public WebElement getPatientName() {
		return PatientName;
	}

	public WebElement getConcern() {
		return Concern;
	}

	public WebElement getAppointmentDetails() {
		return AppointmentDetails;
	}

	public WebElement getAdditionalNotes() {
		return AdditionalNotes;
	}

	public WebElement getBookAppointmentButton() {
		return BookAppointmentButton;
	}

	public WebElement getCounselling() {
		return Counselling;
	}

	public WebElement getCalendarShowAllcategeory() {
		return CalendarShowAllcategeory;
	}


	public WebElement getSearchedDoctorCheckbox() {
		return SearchedDoctorCheckbox;
	}

	public void setSearchedDoctorCheckbox(WebElement searchedDoctorCheckbox) {
		SearchedDoctorCheckbox = searchedDoctorCheckbox;
	}

	public WebElement getSearchIconinsearchbar() {
		return SearchIconinsearchbar;
	}

	public WebElement getSearchBarAfterExpanding() {
		return SearchBarAfterExpanding;
	}

	public WebElement getMakepaymentandbook() {
		return Makepaymentandbook;
	}

	public WebElement getEnteramount() {
		return Enteramount;
	}

	public WebElement getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(WebElement paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public WebElement getRecordPaymentButton() {
		return RecordPaymentButton;
	}

	public WebElement getViewInvoice() {
		return ViewInvoice;
	}

	public WebElement getBookedCounsellingsession() {
		return BookedCounsellingsession;
	}

	public WebElement getCancelAppointmentbutton() {
		return CancelAppointmentbutton;
	}

	public WebElement getConfirmcalncel() {
		return confirmcalncel;
	}

	public WebElement getRemovefromcalendar() {
		return Removefromcalendar;
	}

	public WebElement getCancelfromcalendarDonButton() {
		return CancelfromcalendarDonButton;
	}

	public WebElement getViewScheduleButton() {
		return ViewScheduleButton;
	}

	public WebElement getBookANewProcedure() {
		return BookANewProcedure;
	}

	public WebElement getSelectProceduretoaddsession() {
		return SelectProceduretoaddsession;
	}

	public WebElement getConsultedDoctor() {
		return ConsultedDoctor;
	}

	public WebElement getNoofUnits() {
		return NoofUnits;
	}

	
	public WebElement getNoofsessions() {
		return Noofsessions;
	}

	public WebElement getNextButton() {
		return NextButton;
	}

	public WebElement getPickslot1() {
		return Pickslot1;
	}

	public WebElement getPickslot2() {
		return Pickslot2;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public void setCheckBox(WebElement checkBox) {
		CheckBox = checkBox;
	}

	public WebElement getScheduleSession() {
		return ScheduleSession;
	}

	public WebElement getPicksecondslotforsession() {
		return Picksecondslotforsession;
	}

	public WebElement getBookingSessionButton() {
		return BookingSessionButton;
	}

	public WebElement getSlot11Am() {
		return Slot11Am;
	}

}
