package com.goldgov.codepractice.api;

import java.util.List;

import com.goldgov.codepractice.exampaper.service.ExamPaper;
import com.goldgov.codepractice.exampaper.service.ExamPaperQuery;
import com.goldgov.origin.core.discovery.rpc.ResultSetUtils;

public class ProxyExamPaperQuery extends ExamPaperQuery{

	private RpcExamPaperQuery query;
	
	private ExamPaperConverter converter = new ExamPaperConverter();
	
	public ProxyExamPaperQuery(){
		query = new RpcExamPaperQuery();
	}
	
	public ProxyExamPaperQuery(RpcExamPaperQuery query){
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
	public List<ExamPaper> getResultList() {
		List<ExamPaper> resultList = ResultSetUtils.convertFormRpc(query.getResultList(), converter);
		return resultList;
	}

	@Override
	public void setResultList(List<ExamPaper> resultList) {
		List<RpcExamPaper> rpcObjectList = ResultSetUtils.convertToRpc(resultList, converter);
		query.setResultList(rpcObjectList);
	}
	
	public RpcExamPaperQuery toRpcQuery(){
		return query;
	}
}
