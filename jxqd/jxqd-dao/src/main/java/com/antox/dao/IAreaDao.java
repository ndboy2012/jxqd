package com.antox.dao;

import java.util.List;

import com.antox.annotation.MyBatisRepository;
import com.antox.entity.ConstArea;
/**
 *
 */
@MyBatisRepository
public interface IAreaDao {  
     public List<ConstArea> queryAllArea();
    
}
