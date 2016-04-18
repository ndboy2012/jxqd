package com.antox.entity;

import java.io.Serializable;
import java.util.List;

public class ZtreeEntity implements Serializable{
   
	private String name;
	 
	private List<ZtreeEntity> children;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ZtreeEntity> getChildren() {
		return children;
	}

	public void setChildren(List<ZtreeEntity> children) {
		this.children = children;
	}
}
