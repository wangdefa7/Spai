package com.service;

import java.util.List;

import com.domain.Location;

public interface LocationService {
	//插入一个位置
	public int insert (Location location);
	//查询某个用户的所有上传位置置
	public List<Location> listUser(Location location);
	//查询所有用户的位置 
	public List<Location> listAll ();
	//删除某个位置
	public int delete (int location);	
	

}
