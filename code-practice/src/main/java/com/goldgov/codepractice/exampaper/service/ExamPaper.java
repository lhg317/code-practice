package com.goldgov.codepractice.exampaper.service;

import com.goldgov.codepractice.exercise.service.Exercise;

public class ExamPaper {

	private Integer examPaperID;
	private String examineeID;
	private String codeContent;
    private Boolean compiledSuccess;
    private Boolean testSuccess;
    private Integer scorePoint;
    
    private Exercise exercise;
    
    public ExamPaper(){
    	exercise = new Exercise();
    }

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

	public Boolean getCompiledSuccess() {
		return compiledSuccess;
	}

	public void setCompiledSuccess(Boolean compiledSuccess) {
		this.compiledSuccess = compiledSuccess;
	}

	public Boolean getTestSuccess() {
		return testSuccess;
	}

	public void setTestSuccess(Boolean testSuccess) {
		this.testSuccess = testSuccess;
	}

	public Integer getScorePoint() {
		return scorePoint;
	}

	public void setScorePoint(Integer scorePoint) {
		this.scorePoint = scorePoint;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
    
	public Integer getExerciseID() {
		return getExercise().getExerciseID();
	}
	public void setExerciseID(Integer exerciseID) {
		getExercise().setExerciseID(exerciseID);
	}
}
