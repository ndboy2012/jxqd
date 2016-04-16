package com.antox.entity;

import java.util.List;

public class ZtreeEntity {
   
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
