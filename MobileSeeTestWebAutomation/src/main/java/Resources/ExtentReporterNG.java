package Resources;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		LocalDateTime now = LocalDateTime.now();   
		String path = System.getProperty("user.dir")+"/reports/index-"+dtf.format(now)+".html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Mobile SeeTest Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		extent  = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Somnath Baul");
		return extent;
		
	}

}
