package Resources;

 

import java.io.IOException;

 

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

 

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

 

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

 

public class Listeners extends Base implements ITestListener {
    ExtentTest test;
    ExtentReports extent = ExtentReporterNG.getReportObject();
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

 

    public void onTestStart(ITestResult result) {
// TODO Auto-generated method stub
        test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
        FunctionalComponents.getExtentTest(extentTest);
    }

 

    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        extentTest.get().log(Status.PASS, "Test Passed");
    }

 


    public void onTestFailure(ITestResult result) {
        extentTest.get().fail(result.getThrowable());

 

    }

 

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
    }

 

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }

 

    public void onTestFailedWithTimeout(ITestResult result) {
        // TODO Auto-generated method stub
    }

 

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
    }

 

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        extent.flush();
    }

 

}