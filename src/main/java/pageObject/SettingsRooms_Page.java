package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SettingsRooms_Page {

	@FindBy(how = How.XPATH, using = "//button[text()='Rooms']")
	private WebElement Rooms;

	@FindBy(how=How.XPATH,using="//button[text()='+ Add Room']")
	private WebElement AddRoombutton;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter room name']")
	private WebElement AddRoomName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type Procedure Name']")
	private WebElement AddProcedure;

	@FindBy(how = How.XPATH, using = "(//li[@class='dropdown-item ng-star-inserted'])[1]")
	private WebElement FirstItemfromsearchlist;

	@FindBy(how = How.XPATH, using = "//button[text()='Add Room']")
	private WebElement AddRoomAfterFillingDetails;

	@FindBy(how = How.XPATH, using = "//div[@class='search-field']")
	private WebElement SearchRoom;

	@FindBy(how = How.XPATH, using = "//div[text()='View more details']")
	private WebElement ViewMoreDetailsRooms;

	@FindBy(how = How.XPATH, using = "//button[text()=' Remove room ']")
	private WebElement RemoveRoom;

	@FindBy(how = How.XPATH, using = "//button[text()=' Remove from calendar ']")
	private WebElement RemoveFromCalendar;

	public WebElement getRooms() {
		return Rooms;
	}

	public void setRooms(WebElement rooms) {
		Rooms = rooms;
	}

	public WebElement getAddRoomName() {
		return AddRoomName;
	}

	public void setAddRoomName(WebElement addRoomName) {
		AddRoomName = addRoomName;
	}

	public WebElement getAddProcedure() {
		return AddProcedure;
	}

	public void setAddProcedure(WebElement addProcedure) {
		AddProcedure = addProcedure;
	}

	public WebElement getFirstItemfromsearchlist() {
		return FirstItemfromsearchlist;
	}

	public void setFirstItemfromsearchlist(WebElement firstItemfromsearchlist) {
		FirstItemfromsearchlist = firstItemfromsearchlist;
	}

	public WebElement getAddRoomAfterFillingDetails() {
		return AddRoomAfterFillingDetails;
	}

	public void setAddRoomAfterFillingDetails(WebElement addRoomAfterFillingDetails) {
		AddRoomAfterFillingDetails = addRoomAfterFillingDetails;
	}

	public WebElement getSearchRoom() {
		return SearchRoom;
	}

	public void setSearchRoom(WebElement searchRoom) {
		SearchRoom = searchRoom;
	}

	public WebElement getViewMoreDetailsRooms() {
		return ViewMoreDetailsRooms;
	}

	public void setViewMoreDetailsRooms(WebElement viewMoreDetailsRooms) {
		ViewMoreDetailsRooms = viewMoreDetailsRooms;
	}

	public WebElement getRemoveRoom() {
		return RemoveRoom;
	}

	public void setRemoveRoom(WebElement removeRoom) {
		RemoveRoom = removeRoom;
	}

	public WebElement getRemoveFromCalendar() {
		return RemoveFromCalendar;
	}

	public void setRemoveFromCalendar(WebElement removeFromCalendar) {
		RemoveFromCalendar = removeFromCalendar;
	}

	public WebElement getAddRoombutton() {
		return AddRoombutton;
	}

	public void setAddRoombutton(WebElement addRoombutton) {
		AddRoombutton = addRoombutton;
	}

}
