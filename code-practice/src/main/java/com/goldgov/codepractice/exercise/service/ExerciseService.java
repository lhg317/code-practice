package com.goldgov.codepractice.exercise.service;

import java.util.List;

public interface ExerciseService {

	void addExercise(Exercise exercise);
	void updateExercise(Exercise exercise);
	void deleteExercises(Integer[] ids);
	Exercise findExerciseByID(Integer id);
	List<Exercise> findExercises(ExerciseQuery query);
}
