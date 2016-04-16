package com.antox.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.antox.entity.ZtreeEntity;
import com.antox.param.AllAreaList;
import com.antox.utils.AjaxJson;

@RequestMapping("ztree")
@Controller
public class ZtreeController {
	
     
	 @RequestMapping()
	 public ModelAndView ztree() {
		 ModelAndView mv = new ModelAndView("ztree/standardData");
		 return mv;
	 }
	 
	 @RequestMapping("node")
	 @ResponseBody
	 public AjaxJson ztreeNode() {
		 AjaxJson j = new AjaxJson();
		 List<ZtreeEntity> list = AllAreaList.zlist;
		 j.setResult(list);
		 return j;
	 }
}
