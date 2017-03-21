package com.goldgov.codepractice.api;

import com.goldgov.codepractice.testcase.service.TestCase;

public class ProxyTestCase extends TestCase{

	private RpcTestCase testCase;
	
	public ProxyTestCase(){
		testCase = new RpcTestCase();
	}
	
	public ProxyTestCase(RpcTestCase testCase){
		this.testCase = testCase;
	}
	
	public ProxyTestCase(TestCase _testCase){
		this();
		if(_testCase == null){
			testCase = null;
			return;
		}
		setTestCaseID(_testCase.getTestCaseID());
		setParamValues(_testCase.getParamValues());
		setReturnValue(_testCase.getReturnValue());
	}
	
	public RpcTestCase toRpcObject(){
		return testCase;
	}
	
	public Integer getTestCaseID() {
		return testCase.getTestCaseID();
	}
	public void setTestCaseID(Integer testCaseID) {
		testCase.setTestCaseID(testCaseID);
	}
	public String getParamValues() {
		return testCase.getParamValues();
	}
	public void setParamValues(String paramValues) {
		testCase.setParamValues(paramValues);
	}
	public String getReturnValue() {
		return testCase.getReturnValue();
	}
	public void setReturnValue(String returnValue) {
		testCase.setReturnValue(returnValue);
	}
}
