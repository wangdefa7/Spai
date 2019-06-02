package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Location;
import com.service.LocationService;
import com.util.Base;
import com.util.ToBean;

/**
 * 位置信息控制类
 * */
@Controller
@RequestMapping("/location")
public class LocationController extends Base{
	
	@Autowired
	LocationService locationservice;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public String insert(@RequestBody String locationA) {
		System.out.println("收到的位置： :"+locationA.toString());
		Location location=ToBean.stringtobean_Location(locationA);
		if(location.getAddress().equals(null)||location.getAddress().equals("")) {
			location.setAddress("无地址信息 "); 
		}
		if(location.getLocationdescribe().equals(null)||location.getLocationdescribe().equals("")) {
			location.setAddress("无");
		}
		return isOK(locationservice.insert(location));
	}
	
	
	@RequestMapping("/list")
	public String listAll(Model model) {
		System.out.println("listAll\n");
		List<Location> list=locationservice.listAll();
		model.addAttribute("locations", list);
		return "system/location";
	}
	@ResponseBody
	@RequestMapping(value="/listId", method=RequestMethod.POST )
	public List<Location> listID(@RequestBody String id) {
		System.out.println(id);
		List<Location> list=locationservice.listAll();
		List<Location> li=new ArrayList<Location>();
		Location l=new Location();
		l.setLocationname("无信息");
		for(Location ll : list) {
			if(Integer.valueOf(id)==ll.getUserId()) {
				li.add(ll);
			}
		}
		System.out.println("\n根据id获得的用户信息：\n"+li.toString()+"\n");
		return li;
	}
	@RequestMapping("")
    @ResponseBody
    public String testOK() {
       //查询数据库所有用户
        return "配置OK";
    }
	

}
