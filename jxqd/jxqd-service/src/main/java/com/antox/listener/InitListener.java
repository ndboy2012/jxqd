package com.antox.listener;

import javax.servlet.ServletContextEvent;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.antox.param.AllAreaList;
import com.antox.service.IAreaService;



public class InitListener implements javax.servlet.ServletContextListener{
	
	private Logger logger = Logger.getLogger(InitListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		logger.debug("****************开始初始化地区信息*************");
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
		IAreaService areaService =  webApplicationContext.getBean(IAreaService.class);
		AllAreaList.zlist = areaService.queryAreaList(0);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
