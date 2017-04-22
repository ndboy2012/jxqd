package com.antox.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.antox.annotation.MyAnnotation;
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
      
	  private Logger logger = Logger.getLogger(AreaController.class);
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
	  public AjaxJson requestAreaInfo(String type) {
		   AjaxJson j = new AjaxJson();
		    /*ConstArea ca = areaService.queryAreaByName("合肥市");
			j.setSuccess(true);
			j.setMsg("hello");
			System.out.println(type);*/
		    logger.info("requestAreaInfo");
		    j.setResult(areaService.queryAllArea());
			return j;
	  }
}
