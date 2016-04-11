package com.antox.dao;

import java.util.List;

import com.antox.annotation.MyBatisRepository;
import com.antox.entity.ConstArea;
/**
 * @author 66(987927981@qq.com)<br>
 * @date 2016-01-05
 * 
 * @version 2.0
 */
@MyBatisRepository
public interface IAreaDao {  
     public List<ConstArea> queryAllArea();
    
}
