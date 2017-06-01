package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class WorkerRelMissionCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String workerdataid;

    protected String workerdataidMin;

    protected String workerdataidMax;

    protected List<String> workerdataidList;

    protected String workername;

    protected String workernameMin;

    protected String workernameMax;

    protected List<String> workernameList;

    protected String missiondataid;

    protected String missiondataidMin;

    protected String missiondataidMax;

    protected List<String> missiondataidList;

    protected String missionname;

    protected String missionnameMin;

    protected String missionnameMax;

    protected List<String> missionnameList;

    protected String quality;

    protected String qualityMin;

    protected String qualityMax;

    protected List<String> qualityList;

    protected String schedule;

    protected String scheduleMin;

    protected String scheduleMax;

    protected List<String> scheduleList;

    protected Integer point;

    protected Integer pointMin;

    protected Integer pointMax;

    protected List<Integer> pointList;

    protected String remark;

    protected String remarkMin;

    protected String remarkMax;

    protected List<String> remarkList;

    private static final long serialVersionUID = 1L;

    public WorkerRelMissionCriteria() {
         
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

    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    public String getQuality() {
        return quality;
    }

    public void setQualityMin(String qualityMin) {
        this.qualityMin = qualityMin == null ? null : qualityMin.trim();
    }

    public String getQualityMin() {
        return qualityMin;
    }

    public void setQualityMax(String qualityMax) {
        this.qualityMax = qualityMax == null ? null : qualityMax.trim();
    }

    public String getQualityMax() {
        return qualityMax;
    }

    public void setQualityList(List<String> qualityList) {
        this.qualityList = qualityList;
    }

    public List<String> getQualityList() {
        return qualityList;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule == null ? null : schedule.trim();
    }

    public String getSchedule() {
        return schedule;
    }

    public void setScheduleMin(String scheduleMin) {
        this.scheduleMin = scheduleMin == null ? null : scheduleMin.trim();
    }

    public String getScheduleMin() {
        return scheduleMin;
    }

    public void setScheduleMax(String scheduleMax) {
        this.scheduleMax = scheduleMax == null ? null : scheduleMax.trim();
    }

    public String getScheduleMax() {
        return scheduleMax;
    }

    public void setScheduleList(List<String> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public List<String> getScheduleList() {
        return scheduleList;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPointMin(Integer pointMin) {
        this.pointMin = pointMin;
    }

    public Integer getPointMin() {
        return pointMin;
    }

    public void setPointMax(Integer pointMax) {
        this.pointMax = pointMax;
    }

    public Integer getPointMax() {
        return pointMax;
    }

    public void setPointList(List<Integer> pointList) {
        this.pointList = pointList;
    }

    public List<Integer> getPointList() {
        return pointList;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemarkMin(String remarkMin) {
        this.remarkMin = remarkMin == null ? null : remarkMin.trim();
    }

    public String getRemarkMin() {
        return remarkMin;
    }

    public void setRemarkMax(String remarkMax) {
        this.remarkMax = remarkMax == null ? null : remarkMax.trim();
    }

    public String getRemarkMax() {
        return remarkMax;
    }

    public void setRemarkList(List<String> remarkList) {
        this.remarkList = remarkList;
    }

    public List<String> getRemarkList() {
        return remarkList;
    }
}