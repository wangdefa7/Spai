package com.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.domain.Location;

public interface LocationMapper {
	//插入位置 
    int insert(Location record);
    //查询某个用户的所有上传位置
  	public List<Location> listUser(Location location);
  	//查询所有用户的位置 
  	public List<Location> listAll ();
  	//删除某个位置
  	public int delete (int location);
}