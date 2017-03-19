package com.goldgov.codepractice.testcase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goldgov.codepractice.testcase.service.TestCase;
import com.goldgov.origin.core.dao.Mapper;

@Mapper
public interface TestCaseDao {

	void addTestCases(@Param("exerciseID") Integer exerciseID,@Param("testCases") List<TestCase> testCases);
	void updateTestCase(@Param("exerciseID") Integer exerciseID,@Param("testCase") TestCase testCase);
	void deleteTestCases(Integer[] ids);
	List<TestCase> findTestCases(Integer exerciseID);
}
