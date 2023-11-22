package generic_utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementsUtility implements ITestListener {
	public ExtentTest test;
	public ExtentReports report;

	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.INFO, methodName+" Execution Starts");
	}

	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.PASS,methodName+" Execution pass");

	}

	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();

		/*
		 * this is use the code optiomination . we had created object for the javaUtility and getdate Method
		 */
		WebDriver_utility webUtil= new WebDriver_utility();
		
		
		test.log(Status.FAIL,methodName+" Execution is fail");
		test.log(Status.FAIL, result.getThrowable());
		
		
		try {
			String path=webUtil.getScreenShot(methodName+new Java_Utility().getDate());
			test.addScreenCaptureFromPath(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	


	}

	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		test.log(Status.SKIP,methodName+" Execution is skipped");
		test.log(Status.SKIP,result.getThrowable());



	}

	public void onStart(ITestContext context) {
		// basic Configure
		ExtentSparkReporter htmlReporter= new ExtentSparkReporter(".\\ExtendReports\\report" +new Java_Utility().getDate()+".html");
		htmlReporter.getConf().setDocumentTitle("V_Tiger");
		htmlReporter.getConf().setTheme(Theme.DARK);
		htmlReporter.getConf().setReportName("Extend Report");
		
		// generate the report
		report= new ExtentReports();
		report.attachReporter(htmlReporter);
		report.setSystemInfo("broswer", "Chrome");
		report.setSystemInfo("author name", "Bhargav Angirekula");
		report.setSystemInfo("platfrom", "windows");
		report.setSystemInfo("url", "http://localhost:8888/");
		

	}

	public void onFinish(ITestContext context) {
		report.flush();
	
	}

}
