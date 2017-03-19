package com.goldgov.codepractice.testcase.api;

import java.util.List;

import com.goldgov.codepractice.testcase.service.TestCase;
import com.goldgov.codepractice.testcase.service.TestCaseQuery;
import com.goldgov.origin.core.discovery.rpc.ResultSetUtils;

public class ProxyTestCaseQuery extends TestCaseQuery{

	private RpcTestCaseQuery query;
	
	private TestCaseConverter converter= new TestCaseConverter();
	
	public ProxyTestCaseQuery(){
		query = new RpcTestCaseQuery();
	}
	
	public ProxyTestCaseQuery(RpcTestCaseQuery query){
		this.query = query;
	}

	@Override
	public int getPageSize() {
		return query.getPageSize();
	}

	@Override
	public void setPageSize(int pageSize) {
		query.setPageSize(pageSize);
	}

	@Override
	public int getCurrentPage() {
		return query.getCurrentPage();
	}

	@Override
	public void setCurrentPage(int currentPage) {
		query.setCurrentPage(currentPage);
	}

	@Override
	public long getCount() {
		return query.getCount();
	}

	@Override
	public void setCount(long count) {
		query.setCount(count);
	}

	@Override
	public int getMaxPage() {
		return query.getMaxPage();
	}

	@Override
	public void setMaxPage(int maxPage) {
		query.setMaxPage(maxPage);
	}

	@Override
	public void setFirstResult(int firstResult) {
		query.setFirstResult(firstResult);
	}

	@Override
	public int getFirstResult() {
		return query.getFirstResult();
	}

	@Override
	public int getMinPage() {
		return query.getMinPage();
	}

	@Override
	public void setMinPage(int minPage) {
		query.setMinPage(minPage);
	}
	
	@Override
	public List<TestCase> getResultList() {
		List<RpcTestCase> rpcObjectList = query.getResultList();
		return ResultSetUtils.convertFormRpc(rpcObjectList, converter);
	}

	@Override
	public void setResultList(List<TestCase> resultList) {
		List<RpcTestCase> rpcObjectList = ResultSetUtils.convertToRpc(resultList, converter);
		query.setResultList(rpcObjectList);
	}
	
	public RpcTestCaseQuery toRpcQuery(){
		return query;
	}
}
