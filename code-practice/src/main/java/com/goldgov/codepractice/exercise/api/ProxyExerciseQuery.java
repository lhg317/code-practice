package com.goldgov.codepractice.exercise.api;

import java.util.ArrayList;
import java.util.List;

import com.goldgov.codepractice.exercise.service.Exercise;
import com.goldgov.codepractice.exercise.service.ExerciseQuery;

public class ProxyExerciseQuery extends ExerciseQuery{

	private RpcExerciseQuery query;
	
	public ProxyExerciseQuery(){
		query = new RpcExerciseQuery();
	}
	
	public ProxyExerciseQuery(RpcExerciseQuery query){
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
	public List<Exercise> getResultList() {
		List<RpcExercise> rpcObjectList = query.getResultList();
		List<Exercise> resultList = new ArrayList<>(rpcObjectList.size());
		for (RpcExercise rpcObject : rpcObjectList) {
			resultList.add(new ProxyExercise(rpcObject));
		}
		return resultList;
	}

	@Override
	public void setResultList(List<Exercise> resultList) {
		List<RpcExercise> rpcObjectList = new ArrayList<>(resultList.size());
		for (Exercise user : resultList) {
			rpcObjectList.add(new ProxyExercise(user).toRpcObject());
		}
		query.setResultList(rpcObjectList);
	}
	
	public RpcExerciseQuery toRpcQuery(){
		return query;
	}
}
