package com.antox.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antox.dao.IAreaDao;
import com.antox.entity.ConstArea;
import com.antox.entity.ZtreeEntity;
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
   
	@Override
	public List<ZtreeEntity> queryAreaList(Integer parentId) {
		List<ConstArea> list = areaDao.queryAreasByParentId(parentId);
		List<ZtreeEntity> zlist = new ArrayList<ZtreeEntity>();
		for(int i=0;i<list.size();i++) {
			ConstArea ca = list.get(i);
			ZtreeEntity ze = new ZtreeEntity();
			ze.setName(ca.getAreaName());
			if(ca.getLevel()!=3) {
			  ze.setChildren(queryAreaList(ca.getId()));
			}
			zlist.add(ze);
		}
		return zlist;
	}
}
