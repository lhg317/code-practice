package com.goldgov.codepractice.exampaper.service;

import java.util.List;

public interface ExamPaperService {
	
	void addExamPaper(ExamPaper examPaper);
	void deleteExamPapers(Integer[] ids);
	void updateExamPaper(ExamPaper examPaper);
	ExamPaperShow findExamPaper(Integer exerciseID,String examineeID);
	List<ExamPaper> findExamPapers(ExamPaperQuery query);
}
