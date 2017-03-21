package com.goldgov.codepractice.api;

import java.util.Date;

import com.goldgov.codepractice.exercise.service.Exercise;

public class ProxyExercise extends Exercise{

	private RpcExercise exercise;
	
	public ProxyExercise(){
		exercise = new RpcExercise();
	}
	
	public ProxyExercise(RpcExercise exercise){
		this.exercise = exercise;
	}
	
	public ProxyExercise(Exercise _exercise){
		this();
		if(_exercise == null){
			exercise = null;
			return;
		}
		setExerciseID(_exercise.getExerciseID());
		setTitle(_exercise.getTitle());
		setCategory(_exercise.getCategory());
		setStatement(_exercise.getStatement());
		setDefinitionClass(_exercise.getDefinitionClass());
		setDefinitionMethod(_exercise.getDefinitionMethod());
		setDefinitionParams(_exercise.getDefinitionParams());
		setDefinitionReturn(_exercise.getDefinitionReturn());
		setConstraints(_exercise.getConstraints());
		setExample(_exercise.getExample());
		setDifficulty(_exercise.getDifficulty());
		setTimeLimit(_exercise.getTimeLimit());
		setPublishDate(_exercise.getPublishDate());
		setScorePoint(_exercise.getScorePoint());
		setNote(_exercise.getNote());
	}
	
	
	public RpcExercise toRpcObject(){
		return exercise;
	}
	
	public Integer getExerciseID() {
		return exercise.getExerciseID();
	}
	public void setExerciseID(Integer exerciseID) {
		exercise.setExerciseID(exerciseID);
	}
	public String getTitle() {
		return exercise.getTitle();
	}
	public void setTitle(String title) {
		exercise.setTitle(title);
	}
	public String getStatement() {
		return exercise.getStatement();
	}
	public void setStatement(String statement) {
		exercise.setStatement(statement);
	}
	public String getDefinitionClass() {
		return exercise.getDefinitionClass();
	}
	public void setDefinitionClass(String definitionClass) {
		exercise.setDefinitionClass(definitionClass);
	}
	public String getDefinitionMethod() {
		return exercise.getDefinitionMethod();
	}
	public void setDefinitionMethod(String definitionMethod) {
		exercise.setDefinitionMethod(definitionMethod);
	}
	public String getDefinitionParams() {
		return exercise.getDefinitionParams();
	}
	public void setDefinitionParams(String definitionParams) {
		exercise.setDefinitionParams(definitionParams);
	}
	public String getDefinitionReturn() {
		return exercise.getDefinitionReturn();
	}
	public void setDefinitionReturn(String definitionReturn) {
		exercise.setDefinitionReturn(definitionReturn);
	}
	public String getConstraints() {
		return exercise.getConstraints();
	}
	public void setConstraints(String constraints) {
		exercise.setConstraints(constraints);
	}
	public String getExample() {
		return exercise.getExample();
	}
	public void setExample(String example) {
		exercise.setExample(example);
	}
	public Integer getCategory() {
		return exercise.getCategory();
	}
	public void setCategory(Integer category) {
		exercise.setCategory(category);
	}
	public Integer getDifficulty() {
		return exercise.getDifficulty();
	}
	public void setDifficulty(Integer difficulty) {
		exercise.setDifficulty(difficulty);
	}
	public Integer getTimeLimit() {
		return exercise.getTimeLimit();
	}
	public void setTimeLimit(Integer timeLimit) {
		exercise.setTimeLimit(timeLimit);
	}
	public Date getPublishDate() {
		return new Date(exercise.getPublishDate());
	}
	public void setPublishDate(Date publishDate) {
		exercise.setPublishDate(publishDate.getTime());
	}
	public Integer getScorePoint() {
		return exercise.getScorePoint();
	}
	public void setScorePoint(Integer scorePoint) {
		exercise.setScorePoint(scorePoint);
	}
	public String getNote() {
		return exercise.getNote();
	}
	public void setNote(String note) {
		exercise.setNote(note);
	}
	
}
