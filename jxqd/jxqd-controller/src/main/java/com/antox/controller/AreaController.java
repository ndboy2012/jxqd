package com.antox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.antox.annotation.MyAnnotation;
import com.antox.entity.ConstArea;
import com.antox.service.IAreaService;
import com.antox.utils.AjaxJson;
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
	  
	  @RequestMapping("name")
	  @ResponseBody
	  @MyAnnotation(description="这个是CCC")
	  public AjaxJson requestAreaInfo() {
		    ConstArea ca = areaService.queryAreaByName("合肥市");
			AjaxJson j = new AjaxJson();
			j.setSuccess(true);
			j.setMsg("hello");
			j.setResult(ca);
			return j;
	  }
}
