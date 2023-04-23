package utils;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	 static ExtentTest test;
	 
	 public static void Custom_sendkeys(WebElement element,String Value ) {
		 try {
			 element.sendKeys(Value);
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 public static void Custom_Click(WebElement element) {
		 try {
			 element.click();
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 
}
