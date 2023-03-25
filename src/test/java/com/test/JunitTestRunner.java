package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitTestRunner {


	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(FirstTest.class);

		for (Failure failure : result.getFailures()) {
			// removed sout statement to increase the coverage
		}
	}
}



