package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.User;
import com.service.UserService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	 @Autowired private UserService userService;
	
	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login/login";
	}
	
	//用户的登录
    @PostMapping(value="/loginWeb")
    public String loginWeb(User user) {
    	System.out.println("%%处理后的user:"+user);
    	String name=user.getName();
    	String password=user.getPassword();
    	List<User> list=userService.listUser();
    	for(User u:list) {
    		if(u.getName().equals(name)&&u.getPassword().equals(password)) {
    			System.out.println("\n登陆成功，用户的id为："+u.getId());
    			return "index";
    		}
    	}
        return "error";
    }
    @GetMapping("/index")
	public String index() {
		return "index";
	}
    @GetMapping("/title")
	public String title() {
		return "system/title";
	}
		
}
