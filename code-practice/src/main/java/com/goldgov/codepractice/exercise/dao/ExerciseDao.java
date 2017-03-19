package com.goldgov.codepractice.exercise.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goldgov.codepractice.exercise.service.Exercise;
import com.goldgov.codepractice.exercise.service.ExerciseQuery;
import com.goldgov.origin.core.dao.Mapper;

@Mapper
public interface ExerciseDao {

	void addExercise(Exercise exercise);
	void updateExercise(Exercise exercise);
	void deleteExercises(@Param("ids") Integer[] ids);
	Exercise findExerciseByID(@Param("exerciseID") Integer id);
	List<Exercise> findExercises(@Param("query") ExerciseQuery query);
}
