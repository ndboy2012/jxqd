package com.antox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.antox.service.IAreaService;
/**
 * 
 * @author yelp
 *
 */
@Controller("area")
@RequestMapping("area")
public class AreaController {
       
	  @Autowired
	  private IAreaService areaService;  
	  
	  @RequestMapping("")
	  public ModelAndView area() {
		  ModelAndView mv = new ModelAndView("test");
		  System.out.println(areaService.queryAllArea().size());
		  
		  return mv;
	  }
}
