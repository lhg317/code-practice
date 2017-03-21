package com.goldgov.codepractice.exampaper.web;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.goldgov.codepractice.api.RpcExamPaper;
import com.goldgov.codepractice.api.RpcExamPaperService;

@Controller
@RequestMapping("/exampaper")
public class RpcExamPaperController {

	private final String PAGES_BASE_PATH =  this.getClass().getPackage().getName().replace(".", "/")+"/pages/";
	
	@Autowired
	@Qualifier("rpcExamPaperService.Client")
	private RpcExamPaperService.Iface examPaperService;
	
	@RequestMapping("/show")
	public String showExamPaper(@RequestParam("exerciseID") Integer exerciseID,Model model) throws TException{
		RpcExamPaper examPaper = examPaperService.findExamPaper(exerciseID,"liuhg");
		model.addAttribute("examPaper", examPaper);
		return PAGES_BASE_PATH + "show";
	}
}
