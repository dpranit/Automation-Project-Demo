package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Payments_Pg {
	
	@FindBy(how=How.XPATH,using="//div[text()=' Payments ']")
	private WebElement payments;
	
	@FindBy(how=How.XPATH,using="//div[text()=' Credit Notes ']")
	private WebElement CreditNotes;
	
	@FindBy(how=How.XPATH, using="//label[text()='Payment Method']")
	private WebElement PaymentMethod;
	
	@FindBy(how=How.XPATH, using="[class='filters-field ng-star-inserted']")
	private WebElement FilterButton;
	
	@FindBy (how=How.XPATH, using="//span[@class='cal-toggle']")
	private WebElement Calender; 
		
	
	//@FindBy (how=How.XPATH, using=" ")
	//private WebElement
	
	
	
	public WebElement getPayments() {
		return payments;
	}

	public WebElement getCreditNotes() {
		return CreditNotes;
	}

	public WebElement getPaymentMethod() {
		return PaymentMethod;
	}

	public WebElement getFilterButton() {
		return FilterButton;
	}

	public WebElement getCalender() {
		return Calender;
	}

}