package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Incident implements Serializable {
    private Integer incidentid;

    private String incidenttitle;

    private String incidentname;

    private String incidentcontent;

    private String incidentflag;

    private Integer locationid;

    private Integer userid;

    private Integer createbyId;

    private Date createdata;

    private static final long serialVersionUID = 1L;

    public Integer getIncidentid() {
        return incidentid;
    }

    public void setIncidentid(Integer incidentid) {
        this.incidentid = incidentid;
    }

    public String getIncidenttitle() {
        return incidenttitle;
    }

    public void setIncidenttitle(String incidenttitle) {
        this.incidenttitle = incidenttitle == null ? null : incidenttitle.trim();
    }

    public String getIncidentname() {
        return incidentname;
    }

    public void setIncidentname(String incidentname) {
        this.incidentname = incidentname == null ? null : incidentname.trim();
    }

    public String getIncidentcontent() {
        return incidentcontent;
    }

    public void setIncidentcontent(String incidentcontent) {
        this.incidentcontent = incidentcontent == null ? null : incidentcontent.trim();
    }

    public String getIncidentflag() {
        return incidentflag;
    }

    public void setIncidentflag(String incidentflag) {
        this.incidentflag = incidentflag == null ? null : incidentflag.trim();
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCreatebyId() {
        return createbyId;
    }

    public void setCreatebyId(Integer createbyId) {
        this.createbyId = createbyId;
    }

    public Date getCreatedata() {
        return createdata;
    }

    public void setCreatedata(Date createdata) {
        this.createdata = createdata;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", incidentid=").append(incidentid);
        sb.append(", incidenttitle=").append(incidenttitle);
        sb.append(", incidentname=").append(incidentname);
        sb.append(", incidentcontent=").append(incidentcontent);
        sb.append(", incidentflag=").append(incidentflag);
        sb.append(", locationid=").append(locationid);
        sb.append(", userid=").append(userid);
        sb.append(", createbyId=").append(createbyId);
        sb.append(", createdata=").append(createdata);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}