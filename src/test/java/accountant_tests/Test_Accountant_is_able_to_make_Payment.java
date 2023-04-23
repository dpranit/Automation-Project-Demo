package accountant_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import pageObject.Payments_Pg;
import utils.AccountantLoginBaseClass;

public class Test_Accountant_is_able_to_make_Payment extends AccountantLoginBaseClass{
	
	@Test
	public void Test_Accountant_is_able_to_make_Payment() throws InterruptedException {
		System.out.println("Accountant Loggedin");
	}
	
}
