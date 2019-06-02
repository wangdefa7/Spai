package com.mappers;

import java.util.List;
import com.domain.Incident;

public interface IncidentMapper {
				//插入一个事件
			public int insert (Incident incident);
			//查询某个用户的所有事件
			public List<Incident> listIncident(Incident id);
			//查询所有用户的事件 
			public List<Incident> listAll();
			//删除某个事件
			public int delete (int location);
			//更改某个事件
			public int update (Incident incident);
}