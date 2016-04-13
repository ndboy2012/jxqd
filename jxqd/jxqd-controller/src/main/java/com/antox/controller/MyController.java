package com.antox.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("my")
public class MyController {
      
	  @RequestMapping()
	  public ModelAndView login(HttpServletRequest request) {
		  ModelAndView mv = new ModelAndView("home/login/login");
		  request.setAttribute("sessionRole", "my");
		  return mv;
	  }
}
