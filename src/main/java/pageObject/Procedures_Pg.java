package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Procedures_Pg {
	
	@FindBy (how=How.XPATH, using="/html/body/app-root/mnp-patients/sbpro-layout-dashboard/span/div/div[2]/main/mnp-patient-procedure-form/div/div[2]/mnp-patient-procedure-general-details/form/div[1]/div/div[4]/div/mnp-input/input")
	private WebElement NumberofSessions;

	@FindBy (how=How.XPATH, using="//button[text()='Next ']")
	private WebElement NextButton;
			
	@FindBy (how=How.XPATH, using="(//span[text()='Schedule '])[1]")
	private WebElement Schedulebutton;
	
	@FindBy (how=How.XPATH, using="(//span[text()='Schedule '])[1]")
	private WebElement Schedulebutton2;
	
	@FindBy (how=How.XPATH, using="//button[@class='custom_cal']")
	private WebElement CalenderButton;
	
	@FindBy (how=How.XPATH, using="//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")
	private WebElement selecttodayfromcalender;
	
	@FindBy (how=How.XPATH, using="(//div[@class='d-flex member-options seven'])[1]")
	private WebElement TripleDots;
	
	@FindBy (how=How.XPATH, using="//button[text()='Cancel']")
	private WebElement Cancel;
	
	@FindBy (how=How.XPATH, using="//a[text()=' All Sessions ']")
	private WebElement AllSessionsTab;
	
	@FindBy(how=How.XPATH, using="//div[@class='table-header-column-title seven']")
	private WebElement FilterButton ;
	

	@FindBy(how=How.XPATH, using="//input[@placeholder='Status']")
	private WebElement SessionStatus ;
	
	@FindBy(how=How.XPATH, using="//span[text()='scheduled']")
	private WebElement ScheduledStatus ;
	
	@FindBy(how=How.XPATH, using="//span[text()='draft']")
	private WebElement DraftStatus ;
	
	@FindBy(how=How.XPATH, using="//span[text()='cancelled']")
	private WebElement CancelledStatus ;
	
	@FindBy(how=How.XPATH, using="//button[text()=' Apply ']")
	private WebElement ApplyButton ;
	
	
	
	
	
	
	public WebElement getNumberofSessions() {
		return NumberofSessions;
	}
	
	public WebElement getNextButton() {
		return NextButton;
	}


	public WebElement getSchedulebutton() {
		return Schedulebutton;
	}

	public WebElement getCalenderButton() {
		return CalenderButton;
	}

	public WebElement getSelecttodayfromcalender() {
		return selecttodayfromcalender;
	}

	public WebElement getSchedulebutton2() {
		return Schedulebutton2;
	}

	public WebElement getTripleDots() {
		return TripleDots;
	}

	public WebElement getCancel() {
		return Cancel;
	}

	public WebElement getAllSessionsTab() {
		return AllSessionsTab;
	}

	public void setAllSessionsTab(WebElement allSessionsTab) {
		AllSessionsTab = allSessionsTab;
	}

	public WebElement getFilterButton() {
		return FilterButton;
	}


	public WebElement getScheduledStatus() {
		return ScheduledStatus;
	}

	public WebElement getDraftStatus() {
		return DraftStatus;
	}
	
	public WebElement getCancelledStatus() {
		return CancelledStatus;
	}

	public WebElement getSessionStatus() {
		return SessionStatus;
	}

	public WebElement getApplyButton() {
		return ApplyButton;
	}
}
