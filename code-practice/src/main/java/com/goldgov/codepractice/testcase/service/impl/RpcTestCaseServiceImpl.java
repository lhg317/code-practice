package com.goldgov.codepractice.testcase.service.impl;

import java.util.List;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;

import com.goldgov.codepractice.testcase.api.ProxyTestCase;
import com.goldgov.codepractice.testcase.api.RpcTestCase;
import com.goldgov.codepractice.testcase.api.TestCaseConverter;
import com.goldgov.codepractice.testcase.service.TestCase;
import com.goldgov.codepractice.testcase.service.TestCaseService;
import com.goldgov.origin.core.discovery.rpc.ResultSetUtils;
import com.goldgov.origin.core.discovery.rpc.RpcService;

@RpcService
public class RpcTestCaseServiceImpl implements com.goldgov.codepractice.testcase.api.RpcTestCaseService.Iface{

	@Autowired
	private TestCaseService testCaseService;
	
	@Autowired
	private TestCaseConverter converter;
	
	@Override
	public void addTestCases(int exerciseID, List<RpcTestCase> testCase) throws TException {
		List<TestCase> testCaseList = ResultSetUtils.convertFormRpc(testCase, converter);
		testCaseService.addTestCases(exerciseID, testCaseList);
	}

	@Override
	public void deleteTestCases(List<Integer> ids) throws TException {
		testCaseService.deleteTestCases(ids.toArray(new Integer[0]));
	}

	@Override
	public void updateTestCase(int exerciseID, RpcTestCase testCase) throws TException {
		testCaseService.updateTestCase(exerciseID, new ProxyTestCase(testCase));
	}

	@Override
	public List<RpcTestCase> findTestCases(int exerciseID) throws TException {
		List<TestCase> rpclist = testCaseService.findTestCases(exerciseID);
		return ResultSetUtils.convertToRpc(rpclist, converter);
	}

}
