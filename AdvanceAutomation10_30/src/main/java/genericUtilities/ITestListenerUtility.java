package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
/*
 * 
 */
public class ITestListenerUtility extends BaseClass implements ITestListener {
	ExtentReports report;
	
	public void onStart(ITestContext context) {
	
		ExtentSparkReporter reporter=new ExtentSparkReporter("./report/demoreport.html");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setDocumentTitle("THIS IS A SAMPLE REPORT");
		reporter.config().setReportName("SELENIUM");
		report=new ExtentReports();
		report.attachReporter(reporter);
	}
	public void onTestStart(ITestResult result) {
		logger=report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "The Test"+result.getName()+"is passed");
	}

	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "The Test"+result.getName()+"is failed");
		logger.addScreenCaptureFromPath(screenshot.capturingScreenshot(result.getName()));
	}




	public void onFinish(ITestContext context) {
		report.flush();
	}



}
