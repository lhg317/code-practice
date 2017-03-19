package com.goldgov.codepractice.exercise.api;

import org.springframework.stereotype.Component;

import com.goldgov.codepractice.exercise.service.Exercise;
import com.goldgov.origin.core.discovery.rpc.ObjectConverter;

@Component
public class ExerciseConverter implements ObjectConverter<Exercise,RpcExercise>{

	@Override
	public RpcExercise toRpcObject(Exercise obj) {
		return new ProxyExercise(obj).toRpcObject();
	}

	@Override
	public Exercise fromRpcObject(RpcExercise rpcObj) {
		return new ProxyExercise(rpcObj);
	}
}
