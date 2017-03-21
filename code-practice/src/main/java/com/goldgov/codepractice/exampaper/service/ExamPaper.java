package com.goldgov.codepractice.exampaper.service;

public class ExamPaper {

	private Integer examPaperID;
	private String examineeID;
	private String codeContent;
    private Integer compiledSuccess;
    private Integer testSuccess;
    private Integer scorePoint;
    
    private Integer exerciseID;
    
	public Integer getExamPaperID() {
		return examPaperID;
	}
	public void setExamPaperID(Integer examPaperID) {
		this.examPaperID = examPaperID;
	}
	public String getExamineeID() {
		return examineeID;
	}
	public void setExamineeID(String examineeID) {
		this.examineeID = examineeID;
	}
	public String getCodeContent() {
		return codeContent;
	}
	public void setCodeContent(String codeContent) {
		this.codeContent = codeContent;
	}
	public Integer getCompiledSuccess() {
		return compiledSuccess;
	}
	public void setCompiledSuccess(Integer compiledSuccess) {
		this.compiledSuccess = compiledSuccess;
	}
	public Integer getTestSuccess() {
		return testSuccess;
	}
	public void setTestSuccess(Integer testSuccess) {
		this.testSuccess = testSuccess;
	}
	public Integer getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(Integer scorePoint) {
		this.scorePoint = scorePoint;
	}
	public Integer getExerciseID() {
		return exerciseID;
	}
	public void setExerciseID(Integer exerciseID) {
		this.exerciseID = exerciseID;
	}
    
}
