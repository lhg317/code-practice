package com.goldgov.codepractice.exercise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldgov.codepractice.exercise.dao.ExerciseDao;
import com.goldgov.codepractice.exercise.service.Exercise;
import com.goldgov.codepractice.exercise.service.ExerciseQuery;
import com.goldgov.codepractice.exercise.service.ExerciseService;

@Service
public class ExerciseServiceImpl implements ExerciseService{

	@Autowired
	private ExerciseDao exerciseDao;
	
	public void addExercise(Exercise exercise) {
		exerciseDao.addExercise(exercise);
	}

	public void updateExercise(Exercise exercise) {
		exerciseDao.updateExercise(exercise);
	}

	public void deleteExercises(Integer[] ids) {
		exerciseDao.deleteExercises(ids);
	}

	public Exercise findExerciseByID(Integer id) {
		return exerciseDao.findExerciseByID(id);
	}

	public List<Exercise> findExercises(ExerciseQuery query) {
		return exerciseDao.findExercises(query);
	}

}
