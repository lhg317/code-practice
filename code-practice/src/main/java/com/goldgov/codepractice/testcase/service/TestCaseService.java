package com.goldgov.codepractice.testcase.service;

import java.util.List;

public interface TestCaseService {

	void addTestCases(Integer exerciseID,List<TestCase> testCases);
	void updateTestCase(Integer exerciseID,TestCase testCase);
	void deleteTestCases(Integer[] ids);
	List<TestCase> findTestCases(Integer exerciseID);
}
