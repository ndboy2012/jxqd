package com.antox.service;

import java.util.List;

import com.antox.entity.ConstArea;

public interface IAreaService {
    
	  public List<ConstArea> queryAllArea();
	  
	  public ConstArea queryAreaByName(String name);
}
