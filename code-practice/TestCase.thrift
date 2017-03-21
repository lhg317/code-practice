namespace java com.goldgov.codepractice.api

struct RpcTestCase {
	1: i32 testCaseID;
	2: string paramValues;
	3: string returnValue;
}

struct RpcTestCaseQuery {
	1: i32 pageSize = 15;
	2: i32 currentPage;
	3: i64 count;
	4: i32 maxPage;
	5: i32 minPage = 1;
	6: i32 firstResult = 0;
	7: list<RpcTestCase> resultList;
}

service RpcTestCaseService {
	void addTestCases(1:i32 exerciseID,2:list<RpcTestCase> testCase);
	void deleteTestCases(1:list<i32> ids);
	void updateTestCase(1:i32 exerciseID,2:RpcTestCase testCase);
	list<RpcTestCase> findTestCases(1:i32 exerciseID);
}

