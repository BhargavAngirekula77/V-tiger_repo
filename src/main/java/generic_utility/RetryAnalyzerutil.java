package generic_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerutil implements IRetryAnalyzer {
	int count=0;
	int retryAnalyzer=5;

	public boolean retry(ITestResult result) {
		while (count<retryAnalyzer) {
			count++;
			return true;
			
		}
		
		return false;
	}

}
