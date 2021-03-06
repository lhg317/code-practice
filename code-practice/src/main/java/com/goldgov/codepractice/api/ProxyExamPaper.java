package com.goldgov.codepractice.api;

import com.goldgov.codepractice.exampaper.service.ExamPaper;
import com.goldgov.codepractice.exercise.service.Exercise;

public class ProxyExamPaper extends ExamPaper{

	private RpcExamPaper rpcExamPaper;
	
	public ProxyExamPaper(){
		rpcExamPaper = new RpcExamPaper();
	}
	
	public ProxyExamPaper(RpcExamPaper rpcExamPaper){
		this.rpcExamPaper = rpcExamPaper;
	}
	
	public ProxyExamPaper(ExamPaper _examPaper){
		this();
		if(_examPaper == null){
			rpcExamPaper = null;
			return;
		}
		int examPaperID = _examPaper.getExamPaperID() == null ? 0:_examPaper.getExamPaperID();
		setExamPaperID(examPaperID);
		int scorePoint = _examPaper.getScorePoint() == null ? 0:_examPaper.getScorePoint();
		setScorePoint(scorePoint);
		setCodeContent(_examPaper.getCodeContent());
		boolean compiledSuccess = _examPaper.getCompiledSuccess() == null ? false:_examPaper.getCompiledSuccess();
		setCompiledSuccess(compiledSuccess);
		setExamineeID(_examPaper.getExamineeID());
		boolean testSuccess = _examPaper.getTestSuccess() == null ? false:_examPaper.getTestSuccess();
		setTestSuccess(testSuccess);
//		setExercise(_examPaper.getExercise());
	}
	
	
	public RpcExamPaper toRpcObject(){
		return rpcExamPaper;
	}
	
	public Integer getExamPaperID() {
		return rpcExamPaper.getExamPaperID();
	}
	public void setExamPaperID(Integer examPaperID) {
		rpcExamPaper.setExamPaperID(examPaperID);
	}
	public String getExamineeID() {
		return rpcExamPaper.getExamineeID();
	}
	public void setExamineeID(String examineeID) {
		rpcExamPaper.setExamineeID(examineeID);
	}
	public String getCodeContent() {
		return rpcExamPaper.getCodeContent();
	}
	public void setCodeContent(String codeContent) {
		rpcExamPaper.setCodeContent(codeContent);
	}
	public Boolean getCompiledSuccess() {
		return rpcExamPaper.isCompiledSuccess();
	}
	public void setCompiledSuccess(Boolean compiledSuccess) {
		rpcExamPaper.setCompiledSuccess(compiledSuccess);
	}
	public Boolean getTestSuccess() {
		return rpcExamPaper.isTestSuccess();
	}
	public void setTestSuccess(Boolean testSuccess) {
		rpcExamPaper.setTestSuccess(testSuccess);
	}
	public Integer getScorePoint() {
		return rpcExamPaper.getScorePoint();
	}
	public void setScorePoint(Integer scorePoint) {
		rpcExamPaper.setScorePoint(scorePoint);
	}
	public Integer getExerciseID() {
		return rpcExamPaper.getExercise().getExerciseID();
	}
	public void setExerciseID(Integer exerciseID) {
		getExercise().setExerciseID(exerciseID);
	}
	public Exercise getExercise() {
		return new ProxyExercise(rpcExamPaper.getExercise());
	}
	public void setExercise(Exercise exercise) {
		rpcExamPaper.setExercise(new ProxyExercise(exercise).toRpcObject());
	}
}
