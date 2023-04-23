package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SettingEquipments_Page {

	@FindBy(how=How.XPATH,using="/html/body/app-root/sbpro-dashboard/sbpro-layout-dashboard/span/div/div[1]/sb-side-nav/nav/div[1]/div[3]/div[1]")
	private WebElement Clinic;
	
	@FindBy(how=How.XPATH,using="//div[text()=' Settings ']")
	private WebElement Settings;
	

	@FindBy(how=How.XPATH,using="//button[text()='Equipment']")
	private WebElement Equipments;
	
	@FindBy(how=How.XPATH,using="//button[text()='+ Add Equipment']")
	private WebElement AddEquipment;
	
	@FindBy(how=How.XPATH,using="//mnp-input[@placeholder='Select type here']")
	private WebElement EquipmentType;
	
	@FindBy(how=How.XPATH,using="//span[text()='Laser']")
	private WebElement EquipmentTypeLaser;
	
	@FindBy(how=How.XPATH,using="//button[text()='Add Equipment']")
	private WebElement AddEquipmentafterfillingdetailsbutton;

	
	@FindBy(how=How.XPATH,using="//div[text()='View more details']")
	private WebElement ViewMoreDetails;
	
	@FindBy(how=How.XPATH,using="//div[@class='five']")
	private WebElement EquipmentsFilters;
	
	
	@FindBy(how=How.XPATH,using="(//mnp-input[@placeholder='Select'])[1]")
	private WebElement MobilityType;
	
	@FindBy(how=How.XPATH,using="//span[text()='mobile']")
	private WebElement Mobile;
	
	@FindBy(how=How.XPATH, using="//span[text()='fixed']")
	private WebElement Fixed;
	
	@FindBy(how=How.XPATH,using="//button[text()=' Apply ']")
	private WebElement ApplyButton;
	

	@FindBy(how=How.XPATH,using="//input[@placeholder='Search Equipment']")
	private WebElement Search;
	
	@FindBy(how=How.XPATH,using="//button[@type='reset']")
	private WebElement Reset;
	
	
	
	
	
	
	
	
	
	public WebElement getClinic() {
		return Clinic;
	}

	
	public WebElement getSettings() {
		return Settings;
	}

	

	public WebElement getEquipments() {
		return Equipments;
	}

	

	public WebElement getAddEquipment() {
		return AddEquipment;
	}

	
	public WebElement getEquipmentType() {
		return EquipmentType;
	}

	

	public WebElement getEquipmentTypeLaser() {
		return EquipmentTypeLaser;
	}

	

	public WebElement getAddEquipmentafterfillingdetailsbutton() {
		return AddEquipmentafterfillingdetailsbutton;
	}


	public WebElement getViewMoreDetails() {
		return ViewMoreDetails;
	}



	public WebElement getMobilityType() {
		return MobilityType;
	}



	public WebElement getMobile() {
		return Mobile;
	}



	public WebElement getFixed() {
		return Fixed;
	}


	
	public WebElement getApplyButton() {
		return ApplyButton;
	}


	public WebElement getEquipmentsFilters() {
		return EquipmentsFilters;
	}


	public WebElement getSearch() {
		return Search;
	}


	public WebElement getReset() {
		return Reset;
	}

}
