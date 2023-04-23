package superdoctor_tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import pageObject.SettingEquipments_Page;
import utils.BaseClass;
import utils.Library;

public class Test_SuperDoctor_is_able_to_add_new_Equipment extends BaseClass{
		
	
	@Test
	public void Test_SuperDoctor_is_able_to_add_new_Equipment() {
		
		SettingEquipments_Page Equipments= PageFactory.initElements(driver, SettingEquipments_Page.class);
		Equipments.getClinic().click();
		Equipments.getSettings().click();
		Library.Custom_Click(Equipments.getEquipments());
		Library.Custom_Click(Equipments.getAddEquipment());
		Library.Custom_Click(Equipments.getEquipmentType());
		Library.Custom_Click(Equipments.getEquipmentTypeLaser());
		Library.Custom_Click(Equipments.getAddEquipmentafterfillingdetailsbutton());
		System.out.println("Equipment Added");
}
	
	
	@Test
	public void Test_Mobility_Mobile_Filter_in_Equipments() throws Exception {
		SettingEquipments_Page Equipments= PageFactory.initElements(driver, SettingEquipments_Page.class);
		Equipments.getClinic().click();
		Equipments.getSettings().click();
		Library.Custom_Click(Equipments.getEquipments());
		Thread.sleep(2000);
		Equipments.getEquipmentsFilters().click();
		Equipments.getMobilityType().click();
		Thread.sleep(2000);
		Equipments.getMobile().click();
		Thread.sleep(2000);
		Equipments.getApplyButton().click();
		Thread.sleep(2000);
		System.out.println("Mobile equipements are shown");
	}
	
	@Test
	public void Test_Mobility_Fixed_Filter_in_Equipments() throws Exception {
		SettingEquipments_Page Equipments= PageFactory.initElements(driver, SettingEquipments_Page.class);
		Equipments.getClinic().click();
		Equipments.getSettings().click();
		Library.Custom_Click(Equipments.getEquipments());
		Equipments.getEquipmentsFilters().click();
		Equipments.getMobilityType().click();
		Equipments.getFixed().click();
		Equipments.getApplyButton().click();
		Thread.sleep(2000);
		System.out.println("Fixed equipements are shown");
	}
	
	@Test
	public void Test_Search_in_Equipments() throws InterruptedException {
		SettingEquipments_Page Equipments= PageFactory.initElements(driver, SettingEquipments_Page.class);
		Equipments.getClinic().click();
		Equipments.getSettings().click();
		Library.Custom_Click(Equipments.getEquipments());
		Equipments.getSearch().click();
		Equipments.getSearch().sendKeys("Laser");
		Thread.sleep(2000);
		Equipments.getReset().click();
		Thread.sleep(2000);
		System.out.println("Saerch Functionality in equipment");
	}
	
}
