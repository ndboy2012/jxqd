package com.antox.service;

import com.antox.entity.User;

public interface IMyService {
      
	  /**
	   * 通过loginId来查询出用户的loginId
	   * 因为前端用户用于登入系统的是邮箱号或者是电话号码
	   * @param loginId
	   * @return
	   */
	  public User queryLoginId(String loginId);
	  
}
