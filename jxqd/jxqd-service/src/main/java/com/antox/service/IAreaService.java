package com.antox.service;

import java.util.List;

import com.antox.entity.ConstArea;
import com.antox.entity.ZtreeEntity;

public interface IAreaService {
    
	  public List<ConstArea> queryAllArea();
	  
	  public ConstArea queryAreaByName(String name);
	  
	  public  List<ZtreeEntity> queryAreaList(Integer parentId);
}
