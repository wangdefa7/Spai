package com.domain;

import java.io.Serializable;

public class Location implements Serializable {
    private Integer locationid;

    private String locationname;

    private String locationx;

    private Double longitude;

    private Double latitude;

    private String country;

    private String address;

    private String locationdescribe;
    
    private Integer userId; 

    private static final long serialVersionUID = 1L;

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
    }

    public String getLocationx() {
        return locationx;
    }

    public void setLocationx(String locationx) {
        this.locationx = locationx == null ? null : locationx.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLocationdescribe() {
        return locationdescribe;
    }

    public void setLocationdescribe(String locationdescribe) {
        this.locationdescribe = locationdescribe == null ? null : locationdescribe.trim();
    }

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [locationid=");
		builder.append(locationid);
		builder.append(", locationname=");
		builder.append(locationname);
		builder.append(", locationx=");
		builder.append(locationx);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", country=");
		builder.append(country);
		builder.append(", address=");
		builder.append(address);
		builder.append(", locationdescribe=");
		builder.append(locationdescribe);
		builder.append(", userId=");
		builder.append(userId);
		builder.append("]");
		return builder.toString();
	}

	

	
	
	
	
	/*public String toString() {
		return "Location {locationid:'" + locationid 
				+ "' ,locationname:'" + locationname 
				+ "' ,locationx:'" + locationx
				+ "' ,longitude:'" + longitude 
				+ "' ,latitude:'" + latitude 
				+ "' ,country:'" + country 
				+ "' ,address:'"+ address 
				+ "' ,locationdescribe:'" + locationdescribe 
				+ "' ,UserId:'" + UserId + "'}";
	}*/

	
	
	
	
}