package com.goldgov.codepractice.exercise.web;

import java.util.Arrays;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.goldgov.codepractice.exercise.api.RpcExercise;
import com.goldgov.codepractice.exercise.api.RpcExerciseQuery;
import com.goldgov.codepractice.exercise.api.RpcExerciseService;
import com.goldgov.origin.core.web.annotation.ModuleResource;
import com.goldgov.origin.core.web.token.WebToken;
import com.goldgov.origin.core.web.token.WebToken.TokenHandleType;

@Controller
@RequestMapping("/exercise")
@ModuleResource(name="Exercise",code="exercise")
public class RpcExerciseController {

	private final String PAGES_BASE_PATH =  this.getClass().getPackage().getName().replace(".", "/")+"/pages/";
	
	@Autowired
	@Qualifier("rpcExerciseService.Client")
	private RpcExerciseService.Iface exerciseService;
	
	@RequestMapping("/preAdd")
	@WebToken(handle=TokenHandleType.GENERATE)
	public String preAdd(){
		return PAGES_BASE_PATH + "form";
	}
	
	@RequestMapping("/add")
	@WebToken(handle=TokenHandleType.VERIFY)
	public String addExercise(RpcExercise exercise) throws TException{
		exerciseService.addExercise(exercise);
		return "forward:/exercise/findList";
	}
	
	@RequestMapping("/update")
	@WebToken(handle=TokenHandleType.VERIFY)
	public String updateExercise(RpcExercise exercise) throws TException{
		exerciseService.updateExercise(exercise);
		return "forward:/exercise/findList";
	}
	
	@RequestMapping("/delete")
	public String deleteExercises(@RequestParam("ids")Integer[] ids) throws TException{
		exerciseService.deleteExercises(Arrays.asList(ids));
		return "forward:/exercise/findList";
	}
	
	@RequestMapping("/find")
	@WebToken(handle=TokenHandleType.GENERATE)
	public String findExerciseByID(@RequestParam("id") Integer id, Model model) throws TException{
		RpcExercise exercise = exerciseService.findExerciseByID(id);
		model.addAttribute("exercise", exercise);
		return PAGES_BASE_PATH + "form";
	}
	
	@RequestMapping("/findList")
	public String findExercises(RpcExerciseQuery query,Model model) throws TException{
		query = exerciseService.findExercises(query);
		model.addAttribute("query", query);
		return PAGES_BASE_PATH + "list";
	}
}
