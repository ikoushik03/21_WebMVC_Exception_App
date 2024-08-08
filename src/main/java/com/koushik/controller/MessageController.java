package com.koushik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg()
	{
		
		int i =10/0;
		return "from welcome method";
	}
	
	@GetMapping("/greet")
	@ResponseBody
	public String getGreetMsg()
	{
		
		String str = null;
		str.length();
		return "from greet method";
	}
	
	@GetMapping("/msg")
	@ResponseBody
	public String getMsg()
	{
		return "from msg method";
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ModelAndView handleAE(ArithmeticException ex)
	{
		//String msg = ex.getMessage();
	
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error");
		return mav;
		
	}

}
