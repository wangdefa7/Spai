package com.util;

import com.domain.Location;
import com.domain.Photo;
import com.domain.User;

import net.sf.json.JSONObject;

public class ToBean {
	//安卓生成的实体类与Java生成的有所不同，安卓以大括号开始和结束
	public static Location stringtobean_Location(String str) {
		String c=str.substring(str.indexOf("["), str.lastIndexOf("]")+1);
		c=c.replace(",", "  \',");
		c=c.replace("[", "{");
		c=c.replace("]", "\'}");
		c=c.replace("=", ":\'");
		//String json = "{locationid:'1001',locationname:'张三',locationx:'nn'}";//规范 的公式
		JSONObject jsonObject=JSONObject.fromObject(c);
		Location strbean=(Location)JSONObject.toBean(jsonObject, Location.class);
		return strbean;
		}
	
	public static User stringtobean_User(String str) {
		String c=str.substring(str.indexOf("["), str.lastIndexOf("]")+1);
		c=c.replace("[", "{");
		c=c.replace("]", "'}");
		c=c.replace("=", ":'");
		c=c.replace(",", "',");
		JSONObject jsonObject=JSONObject.fromObject(c);
		User strbean=(User)JSONObject.toBean(jsonObject, User.class);
		return strbean;
		}
	public static Photo stringtobean_Photo(String str) {
		String c=str.substring(str.indexOf("["), str.lastIndexOf("]")+1);
		c=c.replace("[", "{");
		c=c.replace("]", "'}");
		c=c.replace("=", ":'");
		c=c.replace(",", "',");
		JSONObject jsonObject=JSONObject.fromObject(c);
		Photo strbean=(Photo)JSONObject.toBean(jsonObject, Photo.class);
		return strbean;
		}
	


}
