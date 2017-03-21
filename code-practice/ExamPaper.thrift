include "Exercise.thrift"

namespace java com.goldgov.codepractice.api

struct RpcExamPaper {
	1: i32 examPaperID;
	2: string examineeID;
	3: string codeContent;
    4: bool compiledSuccess;
    5: bool testSuccess;
    6: i32 scorePoint;
    7: Exercise.RpcExercise exercise;
}

struct RpcExamPaperQuery {
	1: i32 pageSize = 15;
	2: i32 currentPage;
	3: i64 count;
	4: i32 maxPage;
	5: i32 minPage = 1;
	6: i32 firstResult = 0;
	7: list<RpcExamPaper> resultList;
}

service RpcExamPaperService {
	void addExamPaper(1:RpcExamPaper examPaper);
	void deleteExamPapers(1:list<i32> ids);
	void updateExamPaper(1:RpcExamPaper examPaper);
	RpcExamPaper findExamPaper(1:i32 exerciseID,2:string examineeID);
	RpcExamPaperQuery findExamPapers(1:RpcExamPaperQuery query);
}

