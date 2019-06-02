package com.service.serviceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Location;
import com.mappers.LocationMapper;
import com.service.LocationService;
@Service
public class LocationServiceIml implements LocationService{
	@Autowired
	LocationMapper locationmapper;
	
	@Override
	public int insert(Location location) {
		// TODO Auto-generated method stub
		return locationmapper.insert(location);
	}

	@Override
	public List<Location> listUser(Location location) {
		// TODO Auto-generated method stub
		return locationmapper.listUser(location);
	}

	@Override
	public List<Location> listAll() {
		// TODO Auto-generated method stub
		return locationmapper.listAll();
	}

	@Override
	public int delete(int location) {
		// TODO Auto-generated method stub
		return locationmapper.delete(location);
	}

}
