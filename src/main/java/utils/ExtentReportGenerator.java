package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		String path ="E:\\CLINICEO_AutomationProject\\automation-test-cases\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("CLINICEO Automation Testing");
		reporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("CLINICEO", "Automation Testing");
		extent.setSystemInfo("O.S.", "Windows");
		extent.setSystemInfo("Tool", "Selenium Web Driver");
		extent.setSystemInfo("Tester", "Pranit Dhole");
		return extent;
		
	}
}
