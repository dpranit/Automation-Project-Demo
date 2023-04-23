package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PatientEducation_Material_Page {
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Search']")
	private WebElement SearchBar;
	
	@FindBy (how=How.XPATH, using="//input[@placeholder='Status']")
	private WebElement Status;
	
	@FindBy (how=How.XPATH, using="(//li[@class='ng-star-inserted'])[1]")
	private WebElement inactivestatus;
	
	@FindBy (how=How.XPATH, using="(//li[@class='ng-star-inserted'])[2]")
	private WebElement activestatus;
	
	@FindBy (how=How.XPATH, using="//div[text()='Patient Education']")
	private WebElement PatientEducation;

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getStatus() {
		return Status;
	}

	public WebElement getInactivestatus() {
		return inactivestatus;
	}

	public WebElement getActivestatus() {
		return activestatus;
	}

	public WebElement getPatientEducation() {
		return PatientEducation;
	}
}
