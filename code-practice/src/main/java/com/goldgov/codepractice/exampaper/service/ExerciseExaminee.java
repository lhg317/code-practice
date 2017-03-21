package com.goldgov.codepractice.exampaper.service;

public class ExerciseExaminee {

	private Integer exerciseExamineeID;
	private Integer examPaperID;
	private Integer exerciseID;
	
	public ExerciseExaminee(){}
	
	public ExerciseExaminee(Integer examPaperID, Integer exerciseID) {
		this.examPaperID = examPaperID;
		this.exerciseID = exerciseID;
	}
	public Integer getExerciseExamineeID() {
		return exerciseExamineeID;
	}
	public void setExerciseExamineeID(Integer exerciseExamineeID) {
		this.exerciseExamineeID = exerciseExamineeID;
	}
	public Integer getExamPaperID() {
		return examPaperID;
	}
	public void setExamPaperID(Integer examPaperID) {
		this.examPaperID = examPaperID;
	}
	public Integer getExerciseID() {
		return exerciseID;
	}
	public void setExerciseID(Integer exerciseID) {
		this.exerciseID = exerciseID;
	}
}
