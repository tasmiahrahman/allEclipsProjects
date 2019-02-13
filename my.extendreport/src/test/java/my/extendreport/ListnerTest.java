package my.extendreport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;

public class ListnerTest implements ITestListener
{
 ExtentReports extent;//class from extent,folder create kora
 ExtentReports test;//class: loger kaj korbay,log generate kora
 //extents report
 //extents test
	public void onTestStart(ITestResult result) {
System.out.println(result.getMethod().getMethodName()+"start");	
extent=new ExtentReports("C:\\Users\\tasmiah\\eclipse-workspace\\my.extendreport\\extentreport\\tas.html");

	
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"onsuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"testfailure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
