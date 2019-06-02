package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.Incident;
import com.service.IncidentService;

@Controller
@RequestMapping("/incident")
public class IncidentController {
	@Autowired
	IncidentService incidentService;
	@RequestMapping("/")
	public String incident(Model model) {
	    List<Incident> list= incidentService.listAll();
	    System.out.println("**\n"+list.toString());
	    model.addAttribute("incidents", list);
		return "system/incident";
	}
	@GetMapping("/pagupdate")
	public String pagupdate(Model model) {
		Incident incident=new Incident();
	    model.addAttribute("incident",incident);
		return "system/incidentupdate";
	}
	
	@GetMapping("/page")
	public String page(Model model) {
		Incident incident=new Incident();
	    model.addAttribute("incident",incident);
		return "system/incidentEdit";
	}
	@PostMapping("/insert")
	public String insert( @ModelAttribute Incident incident) {
		if(incidentService.insert(incident)>0) {
			return "status/succ";
		}else {
			return "status/fail";
		}
	}
	@PostMapping("/update")
	public String update(@ModelAttribute Incident incident) {
		if(incidentService.update(incident)>0) {
			return "status/succ";
		}else {
			return "status/fail";
		}
	}
	

}
