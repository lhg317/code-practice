package com.goldgov.codepractice.exampaper.service;

import java.util.List;

public interface ExamPaperService {
	
	void addExamPaper(ExamPaper examPaper);
	void deleteExamPapers(Integer[] ids);
	void updateExamPaper(ExamPaper examPaper);
	ExamPaper findExamPaperByID(Integer id);
	List<ExamPaper> findExamPapers(ExamPaperQuery query);
}
