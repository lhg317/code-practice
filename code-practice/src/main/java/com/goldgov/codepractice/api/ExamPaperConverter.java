package com.goldgov.codepractice.api;

import org.springframework.stereotype.Component;

import com.goldgov.codepractice.exampaper.service.ExamPaper;
import com.goldgov.origin.core.discovery.rpc.ObjectConverter;

@Component
public class ExamPaperConverter implements ObjectConverter<ExamPaper,RpcExamPaper>{

	@Override
	public RpcExamPaper toRpcObject(ExamPaper obj) {
		return new ProxyExamPaper(obj).toRpcObject();
	}

	@Override
	public ExamPaper fromRpcObject(RpcExamPaper rpcObj) {
		return new ProxyExamPaper(rpcObj);
	}

}
