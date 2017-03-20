package com.goldgov.codepractice.testcase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldgov.codepractice.testcase.dao.TestCaseDao;
import com.goldgov.codepractice.testcase.service.TestCase;
import com.goldgov.codepractice.testcase.service.TestCaseService;

@Service
public class TestCaseServiceImpl implements TestCaseService{

	@Autowired
	private TestCaseDao testCaseDao;
	
	@Override
	public void addTestCases(Integer exerciseID, List<TestCase> testCases) {
		testCaseDao.addTestCases(exerciseID, testCases);
	}

	@Override
	public void updateTestCase(Integer exerciseID, TestCase testCase) {
		testCaseDao.updateTestCase(exerciseID, testCase);
	}

	@Override
	public void deleteTestCase(Integer[] ids) {
		testCaseDao.deleteTestCase(ids);
	}

	@Override
	public List<TestCase> findTestCases(Integer exerciseID) {
		return testCaseDao.findTestCases(exerciseID);
	}

}
