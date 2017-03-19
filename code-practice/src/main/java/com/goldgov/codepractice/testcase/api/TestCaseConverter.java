package com.goldgov.codepractice.testcase.api;

import org.springframework.stereotype.Component;

import com.goldgov.codepractice.testcase.service.TestCase;
import com.goldgov.origin.core.discovery.rpc.ObjectConverter;

@Component
public class TestCaseConverter implements ObjectConverter<TestCase,RpcTestCase>{

	@Override
	public RpcTestCase toRpcObject(TestCase obj) {
		return new ProxyTestCase(obj).toRpcObject();
	}

	@Override
	public TestCase fromRpcObject(RpcTestCase rpcObj) {
		return new ProxyTestCase(rpcObj);
	}

}
