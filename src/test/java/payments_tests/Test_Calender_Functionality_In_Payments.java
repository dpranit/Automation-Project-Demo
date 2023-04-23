package payments_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.DashBoard_Modules;
import pageObject.Payments_Pg;
import utils.BaseClass;

public class Test_Calender_Functionality_In_Payments extends BaseClass {
		
	@Test(groups= {"SuperDoctor"})
	public void Test_Invoice_Calender_Opening() throws InterruptedException {
		
			System.out.println("Test_Calender_Opening Pass");
		}
	
	/*
	@Test(groups= {"SuperDoctor"})
	public void Test_Invoice_Calender_PrevoiusMonth() throws InterruptedException {
		Test_Invoice_Calender_Opening();
		WebElement PreviousMonth=driver.findElement(By.xpath("//button[@aria-label='Previous month']"));
		PreviousMonth.click();
		System.out.println("Previous_Month_Calender_Opening Pass");
	}

	
	@Test(groups= {"SuperDoctor"})
	public void Test_Invoice_Calender_NextMonth() throws InterruptedException {
		Test_Invoice_Calender_Opening();
		WebElement NextMonth=driver.findElement(By.xpath("//button[@aria-label='Next month']"));
		NextMonth.click();
		System.out.println("Next_Month_Calender_Opening Pass");

	}
	
	@Test(groups= {"SuperDoctor"})
	public void Test_Invoice_Calender_Range() throws InterruptedException{
		Test_Invoice_Calender_Opening();
		WebElement Day10=driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[10]"));
		Day10.click();
		WebElement Day20=driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[20]"));
		Day20.click();
		driver.findElement(By.xpath("//button[text()=' Apply ']")).click();
		WebElement DateRange=driver.findElement(By.xpath("//span[@class='date-holder ng-star-inserted']"));
		DateRange.isDisplayed();
		System.out.println("Date Range Displayed");
	}*/
}
