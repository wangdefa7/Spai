package com.service.serviceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Incident;
import com.mappers.IncidentMapper;
import com.service.IncidentService;
@Service
public class IncidentServiceImpl implements IncidentService{
	@Autowired 
	IncidentMapper incidentmapper;
	@Override
	public int insert(Incident incident) {
		// TODO Auto-generated method stub
		return incidentmapper.insert(incident);
	}

	@Override
	public List<Incident> listIncident(Incident incident) {
		// TODO Auto-generated method stub
		return incidentmapper.listIncident(incident);
	}

	@Override
	public List<Incident> listAll() {
		// TODO Auto-generated method stub
		return incidentmapper.listAll();
	}

	@Override
	public int delete(int location) {
		// TODO Auto-generated method stub
		return incidentmapper.delete(location);
	}

	@Override
	public int update(Incident incident) {
		// TODO Auto-generated method stub
		return incidentmapper.update(incident);
	}

}
