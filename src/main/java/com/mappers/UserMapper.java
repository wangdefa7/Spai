package com.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.domain.User;
@Mapper
public interface UserMapper{
	/*
	 *显示全部用户 
	 * */
	public List<User> ListUser();
	/*
	 * 用户登录的验证
	 *  */
	public int LoginUser(User user);
	/*
	 * 用户的注册
	 * */
	public int RegisterUser(User user);
	/*
	 * 用户的删除
	 * */
	public int delete(String id);
	/*
	 * 用户的信息修改
	 * */
	public int update(User user);
}