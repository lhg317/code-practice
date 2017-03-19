package com.goldgov.codepractice.exercise.service;

import java.util.Date;

public class Exercise {

	private Integer exerciseID;
	private String title;
	private String statement;
	private String definitionClass;
	private String definitionMethod;
	private String definitionParams;
	private String definitionReturn;
	private String constraints;//约束
	private String example;
	private Integer category;
	private Integer difficulty;
	private Integer timeLimit;
	private Date publishDate;
	private Integer scorePoint;
	private String note;
	
	public Integer getExerciseID() {
		return exerciseID;
	}
	public void setExerciseID(Integer exerciseID) {
		this.exerciseID = exerciseID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getDefinitionClass() {
		return definitionClass;
	}
	public void setDefinitionClass(String definitionClass) {
		this.definitionClass = definitionClass;
	}
	public String getDefinitionMethod() {
		return definitionMethod;
	}
	public void setDefinitionMethod(String definitionMethod) {
		this.definitionMethod = definitionMethod;
	}
	public String getDefinitionParams() {
		return definitionParams;
	}
	public void setDefinitionParams(String definitionParams) {
		this.definitionParams = definitionParams;
	}
	public String getDefinitionReturn() {
		return definitionReturn;
	}
	public void setDefinitionReturn(String definitionReturn) {
		this.definitionReturn = definitionReturn;
	}
	public String getConstraints() {
		return constraints;
	}
	public void setConstraints(String constraints) {
		this.constraints = constraints;
	}
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Integer getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}
	public Integer getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(Integer timeLimit) {
		this.timeLimit = timeLimit;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(Integer scorePoint) {
		this.scorePoint = scorePoint;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
