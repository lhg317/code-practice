package com.goldgov.codepractice.testcase.web;

import java.util.Arrays;
import java.util.List;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.goldgov.codepractice.api.RpcTestCase;
import com.goldgov.codepractice.api.RpcTestCaseService;
import com.goldgov.origin.core.web.token.WebToken;
import com.goldgov.origin.core.web.token.WebToken.TokenHandleType;

@Controller
@RequestMapping("/testcase")
public class RpcTestCaseController {
	
	private final String PAGES_BASE_PATH =  this.getClass().getPackage().getName().replace(".", "/")+"/pages/";

	@Autowired
	@Qualifier("rpcTestCaseService.Client")
	private RpcTestCaseService.Iface testCaseService;
	
	
	@RequestMapping("/add")
	@WebToken(handle=TokenHandleType.VERIFY)
	public String addTestCase(@RequestParam("exerciseID") Integer exerciseID,RpcTestCase testCases) throws TException{
		testCaseService.addTestCases(exerciseID, Arrays.asList(testCases));
		return "forward:/testcase/findList";
	}
	
	@RequestMapping("/update")
	@WebToken(handle=TokenHandleType.VERIFY)
	public String updateTestCase(@RequestParam("exerciseID") Integer exerciseID,RpcTestCase testCase) throws TException{
		testCaseService.updateTestCase(exerciseID, testCase);
		return "forward:/testcase/findList";
	}
	
	@RequestMapping("/delete")
	public String deleteExercises(@RequestParam("ids")Integer[] ids) throws TException{
		testCaseService.deleteTestCases(Arrays.asList(ids));
		return "forward:/testcase/findList";
	}
	
	@RequestMapping("/findList")
	@WebToken(handle=TokenHandleType.GENERATE)
	public String findExerciseByID(@RequestParam("exerciseID") Integer exerciseID, Model model) throws TException{
		List<RpcTestCase> testCaseList = testCaseService.findTestCases(exerciseID);
		model.addAttribute("testCaseList", testCaseList);
		return PAGES_BASE_PATH + "list";
	}
}
