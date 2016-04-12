package com.antox;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import com.antox.service.IAreaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/spring-context.xml"})
public class TestAreaController {
	
	private Logger logger = Logger.getLogger(TestAreaController.class);
	
	@Autowired
	private IAreaService areaService;
	
	static {
		try {
			Log4jConfigurer.initLogging("classpath:properties/log4j.properties");
		} catch(FileNotFoundException ex) {
			System.err.println(ex.getMessage());
		}
	}

	@Test
	public void testArea() {
		logger.debug("hello");
	    logger.info(areaService.queryAllArea().size());
	}

}
