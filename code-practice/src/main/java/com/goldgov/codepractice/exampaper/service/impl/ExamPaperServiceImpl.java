package com.goldgov.codepractice.exampaper.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldgov.codepractice.exampaper.dao.ExamPaperDao;
import com.goldgov.codepractice.exampaper.service.ExamPaper;
import com.goldgov.codepractice.exampaper.service.ExamPaperQuery;
import com.goldgov.codepractice.exampaper.service.ExamPaperService;
import com.goldgov.codepractice.exampaper.service.ExamPaperShow;
import com.goldgov.codepractice.exampaper.service.ExerciseExaminee;
import com.goldgov.codepractice.exercise.service.Exercise;
import com.goldgov.codepractice.exercise.service.ExerciseService;

@Service
public class ExamPaperServiceImpl implements ExamPaperService{

	@Autowired
	private ExamPaperDao examPaperDao;
	
	@Autowired
	private ExerciseService exerciseService;

	@Override
	public void addExamPaper(ExamPaper examPaper) {
		examPaperDao.addExamPaper(examPaper);
		examPaperDao.addExerciseExaminee(new ExerciseExaminee(examPaper.getExamPaperID(),examPaper.getExerciseID()));
	}

	@Override
	public void deleteExamPapers(Integer[] ids) {
		examPaperDao.deleteExamPapers(ids);
	}

	@Override
	public void updateExamPaper(ExamPaper examPaper) {
		examPaperDao.updateExamPaper(examPaper);
	}

	@Override
	public ExamPaperShow findExamPaper(Integer exerciseID,String examineeID) {
		ExamPaper examPaper = examPaperDao.findExamPaper(exerciseID,examineeID);
		Exercise exercise = exerciseService.findExerciseByID(exerciseID);
		ExamPaperShow examPaperShow = new ExamPaperShow();
		examPaperShow.setExamPaper(examPaper);
		examPaperShow.setExercise(exercise);
		return examPaperShow;
	}

	@Override
	public List<ExamPaper> findExamPapers(ExamPaperQuery query) {
		return examPaperDao.findExamPapers(query);
	}

}
