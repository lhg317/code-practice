package com.goldgov.codepractice.exampaper.service.impl;

import java.util.List;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;

import com.goldgov.codepractice.api.ExamPaperConverter;
import com.goldgov.codepractice.api.ProxyExamPaper;
import com.goldgov.codepractice.api.ProxyExamPaperQuery;
import com.goldgov.codepractice.api.RpcExamPaper;
import com.goldgov.codepractice.api.RpcExamPaperQuery;
import com.goldgov.codepractice.api.RpcExamPaperService;
import com.goldgov.codepractice.exampaper.service.ExamPaper;
import com.goldgov.codepractice.exampaper.service.ExamPaperService;
import com.goldgov.codepractice.exampaper.service.ExamPaperShow;
import com.goldgov.origin.core.discovery.rpc.ResultSetUtils;
import com.goldgov.origin.core.discovery.rpc.RpcService;

@RpcService
public class RpcExamPaperServiceImpl implements RpcExamPaperService.Iface{

	@Autowired
	private ExamPaperService examPaperService;
	
	@Autowired
	private ExamPaperConverter converter;
	
	@Override
	public void addExamPaper(RpcExamPaper examPaper) throws TException {
		examPaperService.addExamPaper(new ProxyExamPaper(examPaper));
	}

	@Override
	public void deleteExamPapers(List<Integer> ids) throws TException {
		examPaperService.deleteExamPapers(ids.toArray(new Integer[0]));
	}

	@Override
	public void updateExamPaper(RpcExamPaper examPaper) throws TException {
		examPaperService.updateExamPaper(new ProxyExamPaper(examPaper));
	}

	@Override
	public RpcExamPaper findExamPaper(int exerciseID, String examineeID) throws TException {
		ExamPaperShow examPaper = examPaperService.findExamPaper(exerciseID,examineeID);
		//FIXME TODO
		return null;//new ProxyExamPaper(examPaper).toRpcObject();
	}

	@Override
	public RpcExamPaperQuery findExamPapers(RpcExamPaperQuery query) throws TException {
		List<ExamPaper> examPapers = examPaperService.findExamPapers(new ProxyExamPaperQuery(query));
		List<RpcExamPaper> resultList = ResultSetUtils.convertToRpc(examPapers, converter);
		query.setResultList(resultList);
		return query;
	}

}
