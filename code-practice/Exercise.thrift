namespace java com.goldgov.codepractice.exercise.api

struct RpcExercise {
	1: i32 exerciseID;
	2: string title;
	3: string statement;
	4: string definitionClass;
	5: string definitionMethod;
	6: string definitionParams;
	7: string definitionReturn;
	8: string constraints;
	9: string example;
	10: i32 category;
	11: i32 difficulty;
	12: i32 timeLimit;
	13: i64 publishDate;
	14: i32 scorePoint;
	15: string note;
}

struct RpcExerciseQuery {
	1: i32 pageSize = 15;
	2: i32 currentPage;
	3: i64 count;
	4: i32 maxPage;
	5: i32 minPage = 1;
	6: i32 firstResult = 0;
	7: list<RpcExercise> resultList;
}

service RpcExerciseService {
	void addExercise(1:RpcExercise exercise);
	void deleteExercises(1:list<i32> ids);
	void updateExercise(1:RpcExercise exercise);
	RpcExercise findExerciseByID(1:i32 id);
	RpcExerciseQuery findExercises(1:RpcExerciseQuery query);
}

