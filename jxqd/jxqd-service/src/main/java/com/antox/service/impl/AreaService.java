package com.antox.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antox.dao.IAreaDao;
import com.antox.entity.ConstArea;
import com.antox.service.IAreaService;

@Service("areaService")
public class AreaService implements IAreaService {
    
	@Autowired
	private IAreaDao areaDao;
	
	@Override
	public List<ConstArea> queryAllArea() {
		return areaDao.queryAllArea();
	}

	@Override
	public ConstArea queryAreaByName(String name) {
		return areaDao.queryAreaByName(name);
	}

}
