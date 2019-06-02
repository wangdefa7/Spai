/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.domain;

/*
 * 普通用户表
 * */
	public class User{
		
	private Integer id;
	private String name;
	private String password; 
	private String IDcard; //身份证
	private String hphoto; //头像
	private String phone;//手机号
	private String createdate;//创建时间
	private String Loginlog;//登录日志
	private String identity;// 用户身份 
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getHphoto() {
		return hphoto;
	}
	public void setHphoto(String hphoto) {
		this.hphoto = hphoto;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getLoginlog() {
		return Loginlog;
	}
	public void setLoginlog(String loginlog) {
		Loginlog = loginlog;
	}
	
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", password=");
		builder.append(password);
		builder.append(", IDcard=");
		builder.append(IDcard);
		builder.append(", hphoto=");
		builder.append(hphoto);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", createdate=");
		builder.append(createdate);
		builder.append(", Loginlog=");
		builder.append(Loginlog);
		builder.append(", identity=");
		builder.append(identity);
		builder.append("]");
		return builder.toString();
	}
	
}