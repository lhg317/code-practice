package com.goldgov.codepractice.exercise.service.impl;

import java.util.List;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;

import com.goldgov.codepractice.api.ExerciseConverter;
import com.goldgov.codepractice.api.ProxyExercise;
import com.goldgov.codepractice.api.ProxyExerciseQuery;
import com.goldgov.codepractice.api.RpcExercise;
import com.goldgov.codepractice.api.RpcExerciseQuery;
import com.goldgov.codepractice.api.RpcExerciseService;
import com.goldgov.codepractice.exercise.service.Exercise;
import com.goldgov.codepractice.exercise.service.ExerciseService;
import com.goldgov.origin.core.discovery.rpc.ResultSetUtils;
import com.goldgov.origin.core.discovery.rpc.RpcService;

@RpcService
public class RpcExerciseServiceImpl implements RpcExerciseService.Iface{

	@Autowired
	private ExerciseService exerciseService;
	
	@Autowired
	private ExerciseConverter exerciseConverter;
	
	@Override
	public void addExercise(RpcExercise exercise) throws TException {
		exerciseService.addExercise(new ProxyExercise(exercise));
	}

	@Override
	public void deleteExercises(List<Integer> ids) throws TException {
		exerciseService.deleteExercises(ids.toArray(new Integer[0]));
	}

	@Override
	public void updateExercise(RpcExercise exercise) throws TException {
		exerciseService.updateExercise(new ProxyExercise(exercise));
	}

	@Override
	public RpcExercise findExerciseByID(int id) throws TException {
		Exercise exercise = exerciseService.findExerciseByID(id);
		return new ProxyExercise(exercise).toRpcObject();
	}

	@Override
	public RpcExerciseQuery findExercises(RpcExerciseQuery query) throws TException {
		List<Exercise> findExercises = exerciseService.findExercises(new ProxyExerciseQuery(query));
		List<RpcExercise> resultList = ResultSetUtils.convertToRpc(findExercises, exerciseConverter);
		query.setResultList(resultList);
		return query;
	}
	

}
