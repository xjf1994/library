package com.xc.mapper;

import com.xc.entity.User;

public interface IUserMapper {

	User getUser(String username);
	
	int add(User user);
	
	int delete(String username);
	
	int update(User user);
}
