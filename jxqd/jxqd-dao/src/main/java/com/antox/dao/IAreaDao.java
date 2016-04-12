package com.antox.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.antox.annotation.MyBatisRepository;
import com.antox.entity.ConstArea;

@MyBatisRepository
public interface IAreaDao {  
	
     public List<ConstArea> queryAllArea();
     
     public ConstArea queryAreaByName(@Param("name")String name);
    
}
