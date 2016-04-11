package com.antox;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.antox.entity.ConstArea;
import com.antox.service.IAreaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class TestMybatis {
    
	  private static Logger logger = Logger.getLogger(TestMybatis.class);
	  
	  @Autowired
	  private IAreaService userService;
	  
	  @Before
	  public void before() {
		  
	  }
	  
	  @Test
	  public void Test1() {
		  List<ConstArea> list = userService.queryAllArea();
		  System.out.println(list.size());
		  logger.debug(list.size());
	  }
}
