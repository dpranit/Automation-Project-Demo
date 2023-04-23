package superdoctor_tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.SettingEquipments_Page;
import pageObject.SettingsRooms_Page;
import utils.BaseClass;

public class Test_SuperDoctor_is_Able_To_AddNew_Room extends BaseClass{
	
	@Test
	public void Test_SuperDoctor_is_Able_To_AddNew_Room() throws InterruptedException {
		SettingEquipments_Page Equipments= PageFactory.initElements(driver, SettingEquipments_Page.class);
		Equipments.getClinic().click();
		Equipments.getSettings().click();
		Thread.sleep(1000);
		SettingsRooms_Page Rooms = PageFactory.initElements(driver, SettingsRooms_Page.class);
		Rooms.getRooms().click();
		Thread.sleep(1000);
		Rooms.getAddRoombutton().click();
		Thread.sleep(1000);
		Rooms.getAddRoomName().click();
		Thread.sleep(1000);
		Rooms.getAddRoomName().sendKeys("Test Add Room");
		Rooms.getAddProcedure().click();
		Thread.sleep(1000);
		Rooms.getAddProcedure().sendKeys("Pico Toning");
		driver.findElement(By.xpath("//label[@class='checkbox-container label-text']")).click();
		Rooms.getAddRoomAfterFillingDetails().click();
		Thread.sleep(2000);
		System.out.println("Room Added");
		
	}
	
	@Test(dependsOnMethods="Test_SuperDoctor_is_Able_To_AddNew_Room")
	public void Test_Search_Functionality_in_Rooms() throws InterruptedException, Exception {
		SettingEquipments_Page Equipments= PageFactory.initElements(driver, SettingEquipments_Page.class);
		Equipments.getClinic().click();
		Equipments.getSettings().click();
		Thread.sleep(1000);
		SettingsRooms_Page Rooms = PageFactory.initElements(driver, SettingsRooms_Page.class);
		Rooms.getRooms().click();
		Thread.sleep(1000);
		Rooms.getSearchRoom().click();
		Thread.sleep(1000);
		Robot robot=new Robot();
		String text = "Test Add Room";
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		System.out.println("Search Functionality Tested");
	}
}
