package com.service;

import java.util.List;

import com.domain.Photo;

public interface PhotoService {
	   //插入一个图片
		public int insert (Photo Photo);
		//查询某个用户的所有上传图片
		public List<Photo> listPhotoByid(int id);
		//查询所有用户的图片
		public List<Photo> listAll ();
		//删除某个图片
		public int delete (int Photo);
}
