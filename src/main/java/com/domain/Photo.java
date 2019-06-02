package com.domain;

import java.io.Serializable;

public class Photo implements Serializable {
	private Integer photoid;// 照片Id

	private String photoname;// 照片名字

	private String photocontent;// 照片信息

	private String photopath;// 照片存储路径

    private String userid;//用户ID
    
    private Integer locationid;//位置id


    private static final long serialVersionUID = 1L;

    public Integer getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname == null ? null : photoname.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath == null ? null : photopath.trim();
    }

    public String getPhotocontent() {
		return photocontent;
	}

	public void setPhotocontent(String photocontent) {
		this.photocontent = photocontent;
	}
	
	public Integer getLocationid() {
		return locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Photo [photoid=");
		builder.append(photoid);
		builder.append(", photoname=");
		builder.append(photoname);
		builder.append(", photocontent=");
		builder.append(photocontent);
		builder.append(", photopath=");
		builder.append(photopath);
		builder.append(", userid=");
		builder.append(userid);
		builder.append(", locationid=");
		builder.append(locationid);
		builder.append("]");
		return builder.toString();
	}

	
}