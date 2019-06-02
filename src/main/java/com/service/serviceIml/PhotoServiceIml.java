package com.service.serviceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Photo;
import com.mappers.PhotoMapper;
import com.service.PhotoService;
@Service

public class PhotoServiceIml implements PhotoService{
	
	@Autowired
	PhotoMapper photomapper;

	@Override
	public int insert(Photo Photo) {
		// TODO Auto-generated method stub
		return photomapper.insert(Photo);
	}

	@Override
	public List<Photo> listPhotoByid(int id) {
		// TODO Auto-generated method stub
		return photomapper.listPhotoByid(id);
	}

	@Override
	public List<Photo> listAll() {
		// TODO Auto-generated method stub
		return photomapper.listAll();
	}

	@Override
	public int delete(int Photo) {
		// TODO Auto-generated method stub
		return photomapper.delete(Photo);
	}

}
