package com.goldgov.codepractice.exampaper.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goldgov.codepractice.exampaper.service.ExamPaper;
import com.goldgov.codepractice.exampaper.service.ExamPaperQuery;
import com.goldgov.codepractice.exampaper.service.ExerciseExaminee;
import com.goldgov.origin.core.dao.Mapper;

@Mapper
public interface ExamPaperDao {

	void addExamPaper(ExamPaper examPaper);
	void addExerciseExaminee(ExerciseExaminee examPaper);
	void deleteExamPapers(@Param("ids") Integer[] ids);
	void updateExamPaper(ExamPaper examPaper);
	ExamPaper findExamPaper(@Param("exerciseID") Integer exerciseID,@Param("examineeID") String examineeID);
	List<ExamPaper> findExamPapers(@Param("query") ExamPaperQuery query);
}
