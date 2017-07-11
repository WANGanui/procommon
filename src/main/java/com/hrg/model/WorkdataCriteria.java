package com.hrg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WorkdataCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String projectdataid;

    protected String projectdataidMin;

    protected String projectdataidMax;

    protected List<String> projectdataidList;

    protected String projectname;

    protected String projectnameMin;

    protected String projectnameMax;

    protected List<String> projectnameList;

    protected String missiondataid;

    protected String missiondataidMin;

    protected String missiondataidMax;

    protected List<String> missiondataidList;

    protected String missionname;

    protected String missionnameMin;

    protected String missionnameMax;

    protected List<String> missionnameList;

    protected String workcontext;

    protected String workcontextMin;

    protected String workcontextMax;

    protected List<String> workcontextList;

    protected String workerdataid;

    protected String workerdataidMin;

    protected String workerdataidMax;

    protected List<String> workerdataidList;

    protected String workername;

    protected String workernameMin;

    protected String workernameMax;

    protected List<String> workernameList;

    protected Date time;

    protected Date timeMin;

    protected Date timeMax;

    protected String projectleader;

    protected String projectleaderMin;

    protected String projectleaderMax;

    protected List<String> projectleaderList;

    protected String isread;

    protected String isreadMin;

    protected String isreadMax;

    protected List<String> isreadList;

    private static final long serialVersionUID = 1L;

    public WorkdataCriteria() {
         
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataidMin(String dataidMin) {
        this.dataidMin = dataidMin == null ? null : dataidMin.trim();
    }

    public String getDataidMin() {
        return dataidMin;
    }

    public void setDataidMax(String dataidMax) {
        this.dataidMax = dataidMax == null ? null : dataidMax.trim();
    }

    public String getDataidMax() {
        return dataidMax;
    }

    public void setDataidList(List<String> dataidList) {
        this.dataidList = dataidList;
    }

    public List<String> getDataidList() {
        return dataidList;
    }

    public void setProjectdataid(String projectdataid) {
        this.projectdataid = projectdataid == null ? null : projectdataid.trim();
    }

    public String getProjectdataid() {
        return projectdataid;
    }

    public void setProjectdataidMin(String projectdataidMin) {
        this.projectdataidMin = projectdataidMin == null ? null : projectdataidMin.trim();
    }

    public String getProjectdataidMin() {
        return projectdataidMin;
    }

    public void setProjectdataidMax(String projectdataidMax) {
        this.projectdataidMax = projectdataidMax == null ? null : projectdataidMax.trim();
    }

    public String getProjectdataidMax() {
        return projectdataidMax;
    }

    public void setProjectdataidList(List<String> projectdataidList) {
        this.projectdataidList = projectdataidList;
    }

    public List<String> getProjectdataidList() {
        return projectdataidList;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectnameMin(String projectnameMin) {
        this.projectnameMin = projectnameMin == null ? null : projectnameMin.trim();
    }

    public String getProjectnameMin() {
        return projectnameMin;
    }

    public void setProjectnameMax(String projectnameMax) {
        this.projectnameMax = projectnameMax == null ? null : projectnameMax.trim();
    }

    public String getProjectnameMax() {
        return projectnameMax;
    }

    public void setProjectnameList(List<String> projectnameList) {
        this.projectnameList = projectnameList;
    }

    public List<String> getProjectnameList() {
        return projectnameList;
    }

    public void setMissiondataid(String missiondataid) {
        this.missiondataid = missiondataid == null ? null : missiondataid.trim();
    }

    public String getMissiondataid() {
        return missiondataid;
    }

    public void setMissiondataidMin(String missiondataidMin) {
        this.missiondataidMin = missiondataidMin == null ? null : missiondataidMin.trim();
    }

    public String getMissiondataidMin() {
        return missiondataidMin;
    }

    public void setMissiondataidMax(String missiondataidMax) {
        this.missiondataidMax = missiondataidMax == null ? null : missiondataidMax.trim();
    }

    public String getMissiondataidMax() {
        return missiondataidMax;
    }

    public void setMissiondataidList(List<String> missiondataidList) {
        this.missiondataidList = missiondataidList;
    }

    public List<String> getMissiondataidList() {
        return missiondataidList;
    }

    public void setMissionname(String missionname) {
        this.missionname = missionname == null ? null : missionname.trim();
    }

    public String getMissionname() {
        return missionname;
    }

    public void setMissionnameMin(String missionnameMin) {
        this.missionnameMin = missionnameMin == null ? null : missionnameMin.trim();
    }

    public String getMissionnameMin() {
        return missionnameMin;
    }

    public void setMissionnameMax(String missionnameMax) {
        this.missionnameMax = missionnameMax == null ? null : missionnameMax.trim();
    }

    public String getMissionnameMax() {
        return missionnameMax;
    }

    public void setMissionnameList(List<String> missionnameList) {
        this.missionnameList = missionnameList;
    }

    public List<String> getMissionnameList() {
        return missionnameList;
    }

    public void setWorkcontext(String workcontext) {
        this.workcontext = workcontext == null ? null : workcontext.trim();
    }

    public String getWorkcontext() {
        return workcontext;
    }

    public void setWorkcontextMin(String workcontextMin) {
        this.workcontextMin = workcontextMin == null ? null : workcontextMin.trim();
    }

    public String getWorkcontextMin() {
        return workcontextMin;
    }

    public void setWorkcontextMax(String workcontextMax) {
        this.workcontextMax = workcontextMax == null ? null : workcontextMax.trim();
    }

    public String getWorkcontextMax() {
        return workcontextMax;
    }

    public void setWorkcontextList(List<String> workcontextList) {
        this.workcontextList = workcontextList;
    }

    public List<String> getWorkcontextList() {
        return workcontextList;
    }

    public void setWorkerdataid(String workerdataid) {
        this.workerdataid = workerdataid == null ? null : workerdataid.trim();
    }

    public String getWorkerdataid() {
        return workerdataid;
    }

    public void setWorkerdataidMin(String workerdataidMin) {
        this.workerdataidMin = workerdataidMin == null ? null : workerdataidMin.trim();
    }

    public String getWorkerdataidMin() {
        return workerdataidMin;
    }

    public void setWorkerdataidMax(String workerdataidMax) {
        this.workerdataidMax = workerdataidMax == null ? null : workerdataidMax.trim();
    }

    public String getWorkerdataidMax() {
        return workerdataidMax;
    }

    public void setWorkerdataidList(List<String> workerdataidList) {
        this.workerdataidList = workerdataidList;
    }

    public List<String> getWorkerdataidList() {
        return workerdataidList;
    }

    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkernameMin(String workernameMin) {
        this.workernameMin = workernameMin == null ? null : workernameMin.trim();
    }

    public String getWorkernameMin() {
        return workernameMin;
    }

    public void setWorkernameMax(String workernameMax) {
        this.workernameMax = workernameMax == null ? null : workernameMax.trim();
    }

    public String getWorkernameMax() {
        return workernameMax;
    }

    public void setWorkernameList(List<String> workernameList) {
        this.workernameList = workernameList;
    }

    public List<String> getWorkernameList() {
        return workernameList;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTimeMin(Date timeMin) {
        this.timeMin = timeMin;
    }

    public Date getTimeMin() {
        return timeMin;
    }

    public void setTimeMax(Date timeMax) {
        this.timeMax = timeMax;
    }

    public Date getTimeMax() {
        return timeMax;
    }

    public void setProjectleader(String projectleader) {
        this.projectleader = projectleader == null ? null : projectleader.trim();
    }

    public String getProjectleader() {
        return projectleader;
    }

    public void setProjectleaderMin(String projectleaderMin) {
        this.projectleaderMin = projectleaderMin == null ? null : projectleaderMin.trim();
    }

    public String getProjectleaderMin() {
        return projectleaderMin;
    }

    public void setProjectleaderMax(String projectleaderMax) {
        this.projectleaderMax = projectleaderMax == null ? null : projectleaderMax.trim();
    }

    public String getProjectleaderMax() {
        return projectleaderMax;
    }

    public void setProjectleaderList(List<String> projectleaderList) {
        this.projectleaderList = projectleaderList;
    }

    public List<String> getProjectleaderList() {
        return projectleaderList;
    }

    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
    }

    public String getIsread() {
        return isread;
    }

    public void setIsreadMin(String isreadMin) {
        this.isreadMin = isreadMin == null ? null : isreadMin.trim();
    }

    public String getIsreadMin() {
        return isreadMin;
    }

    public void setIsreadMax(String isreadMax) {
        this.isreadMax = isreadMax == null ? null : isreadMax.trim();
    }

    public String getIsreadMax() {
        return isreadMax;
    }

    public void setIsreadList(List<String> isreadList) {
        this.isreadList = isreadList;
    }

    public List<String> getIsreadList() {
        return isreadList;
    }
}