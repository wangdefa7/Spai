package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.User;
import com.service.UserService;
import com.util.Base;
import com.util.TableDataInfo;
import com.util.ToBean;
/*1)如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。

例如：本来应该到success.jsp页面的，则其显示success.
2)如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
 3)如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。*/
@Controller
//@RestController
@RequestMapping("/user")
public class UserController extends Base{

    @Autowired
    private UserService userService;
    @GetMapping()
    public String list() {
    	return "other/test2";
    }
/*
 * 方法上面如果只加@RequestMapping() 则post和get方法是都支持的
 * */
    
    @RequestMapping("/list")
    public String test(Model model) {
       //查询数据库所有用户
        List<User> list = new ArrayList<User>();
        list=userService.listUser();
        System.out.println(list.toString());
        model.addAttribute("users",list);
        return "user/userlist";
    }
    @RequestMapping("/a")
    @ResponseBody
    public String testOK(Model model) {
       //查询数据库所有用户
        return "配置OK";
    }
    @RequestMapping("/a/{s}")
    @ResponseBody
    public String testPass(@PathVariable String s) {
    	System.out.println("***  "+s);
    	return s;
    }
    
    @RequestMapping(value="/insert" ,method = RequestMethod.POST)
    @ResponseBody
    public String insert(@RequestBody  String user) {
    	User user1=ToBean.stringtobean_User(user);
    	System.out.println("%%处理后的user:"+user1);
        return isOK(userService.RegisterUser(user1));
    }
    //用户的登录
    @RequestMapping(value="/login" ,method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody  String user) {
    	User user1=ToBean.stringtobean_User(user);
    	System.out.println("%登录%处理后的user:"+user1);
    	String name=user1.getName();
    	String password=user1.getPassword();
    	List<User> list=userService.listUser();
    	for(User u:list) {
    		if(u.getName().equals(name)&&u.getPassword().equals(password)) {
    			System.out.println("\n登陆成功，用户的id为："+u.getId());
    			return u.getId().toString();
    		}
    	}
        return "fail";
    }
  
    /**
     * 
     * 根据用户的id返回用户的信息
     * */ 
    @RequestMapping(value="/listID",method=RequestMethod.POST)
    @ResponseBody
    public User listID(@RequestBody String id) {
    	System.out.println("收到的ID"+id);
    	List<User> list=userService.listUser();
    	User user=new User();
    	user.setName("无信息");
    	for(User u: list) {
    		if(Integer.parseInt(id)==u.getId()) {
    			return u;
    		}
    	}
    	return user;
    }
    
    /**
     * 
     * 根据用户的id修改用户的信息
     * */                   
    @RequestMapping(value="/updateUser",method=RequestMethod.POST)
    @ResponseBody
    public String updateUser(@RequestBody String user1) {
    	User user=ToBean.stringtobean_User(user1);
    	System.out.println("修改的用户的ID"+user.getId());
    	return isOK(userService.update(user));
    }
    
    
    
}
