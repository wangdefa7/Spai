package com.service.serviceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.User;
import com.mappers.UserMapper;
import com.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper usermapper;
	
	public List<User> listUser() {
		return usermapper.ListUser();
	}

	//用户登录
	public int LoginUser(User user) {

		return usermapper.LoginUser(user);
	}

	@Override
	public int RegisterUser(User user) {
		// TODO Auto-generated method stub
		return usermapper.RegisterUser(user);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return usermapper.delete(id);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return usermapper.update(user);
	}
	
}  