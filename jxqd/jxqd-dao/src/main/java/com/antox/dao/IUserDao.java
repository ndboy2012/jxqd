package com.antox.dao;

import org.apache.ibatis.annotations.Param;

import com.antox.annotation.MyBatisRepository;
import com.antox.entity.User;

@MyBatisRepository
public interface IUserDao {
	public User queryUserByLoginId(@Param("loginId") String lgoinId);
}
