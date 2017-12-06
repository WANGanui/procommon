package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class MissionFileCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String nameold;

    protected String nameoldMin;

    protected String nameoldMax;

    protected List<String> nameoldList;

    protected String namenew;

    protected String namenewMin;

    protected String namenewMax;

    protected List<String> namenewList;

    protected String path;

    protected String pathMin;

    protected String pathMax;

    protected List<String> pathList;

    protected String missionid;

    protected String missionidMin;

    protected String missionidMax;

    protected List<String> missionidList;

    protected String projectid;

    protected String projectidMin;

    protected String projectidMax;

    protected List<String> projectidList;

    protected Integer orderid;

    protected Integer orderidMin;

    protected Integer orderidMax;

    protected List<Integer> orderidList;

    protected Integer show;

    protected Integer showMin;

    protected Integer showMax;

    protected List<Integer> showList;

    private static final long serialVersionUID = 1L;

    public MissionFileCriteria() {
         
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

    public void setNameold(String nameold) {
        this.nameold = nameold == null ? null : nameold.trim();
    }

    public String getNameold() {
        return nameold;
    }

    public void setNameoldMin(String nameoldMin) {
        this.nameoldMin = nameoldMin == null ? null : nameoldMin.trim();
    }

    public String getNameoldMin() {
        return nameoldMin;
    }

    public void setNameoldMax(String nameoldMax) {
        this.nameoldMax = nameoldMax == null ? null : nameoldMax.trim();
    }

    public String getNameoldMax() {
        return nameoldMax;
    }

    public void setNameoldList(List<String> nameoldList) {
        this.nameoldList = nameoldList;
    }

    public List<String> getNameoldList() {
        return nameoldList;
    }

    public void setNamenew(String namenew) {
        this.namenew = namenew == null ? null : namenew.trim();
    }

    public String getNamenew() {
        return namenew;
    }

    public void setNamenewMin(String namenewMin) {
        this.namenewMin = namenewMin == null ? null : namenewMin.trim();
    }

    public String getNamenewMin() {
        return namenewMin;
    }

    public void setNamenewMax(String namenewMax) {
        this.namenewMax = namenewMax == null ? null : namenewMax.trim();
    }

    public String getNamenewMax() {
        return namenewMax;
    }

    public void setNamenewList(List<String> namenewList) {
        this.namenewList = namenewList;
    }

    public List<String> getNamenewList() {
        return namenewList;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPathMin(String pathMin) {
        this.pathMin = pathMin == null ? null : pathMin.trim();
    }

    public String getPathMin() {
        return pathMin;
    }

    public void setPathMax(String pathMax) {
        this.pathMax = pathMax == null ? null : pathMax.trim();
    }

    public String getPathMax() {
        return pathMax;
    }

    public void setPathList(List<String> pathList) {
        this.pathList = pathList;
    }

    public List<String> getPathList() {
        return pathList;
    }

    public void setMissionid(String missionid) {
        this.missionid = missionid == null ? null : missionid.trim();
    }

    public String getMissionid() {
        return missionid;
    }

    public void setMissionidMin(String missionidMin) {
        this.missionidMin = missionidMin == null ? null : missionidMin.trim();
    }

    public String getMissionidMin() {
        return missionidMin;
    }

    public void setMissionidMax(String missionidMax) {
        this.missionidMax = missionidMax == null ? null : missionidMax.trim();
    }

    public String getMissionidMax() {
        return missionidMax;
    }

    public void setMissionidList(List<String> missionidList) {
        this.missionidList = missionidList;
    }

    public List<String> getMissionidList() {
        return missionidList;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectidMin(String projectidMin) {
        this.projectidMin = projectidMin == null ? null : projectidMin.trim();
    }

    public String getProjectidMin() {
        return projectidMin;
    }

    public void setProjectidMax(String projectidMax) {
        this.projectidMax = projectidMax == null ? null : projectidMax.trim();
    }

    public String getProjectidMax() {
        return projectidMax;
    }

    public void setProjectidList(List<String> projectidList) {
        this.projectidList = projectidList;
    }

    public List<String> getProjectidList() {
        return projectidList;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderidMin(Integer orderidMin) {
        this.orderidMin = orderidMin;
    }

    public Integer getOrderidMin() {
        return orderidMin;
    }

    public void setOrderidMax(Integer orderidMax) {
        this.orderidMax = orderidMax;
    }

    public Integer getOrderidMax() {
        return orderidMax;
    }

    public void setOrderidList(List<Integer> orderidList) {
        this.orderidList = orderidList;
    }

    public List<Integer> getOrderidList() {
        return orderidList;
    }

    public void setShow(Integer show) {
        this.show = show;
    }

    public Integer getShow() {
        return show;
    }

    public void setShowMin(Integer showMin) {
        this.showMin = showMin;
    }

    public Integer getShowMin() {
        return showMin;
    }

    public void setShowMax(Integer showMax) {
        this.showMax = showMax;
    }

    public Integer getShowMax() {
        return showMax;
    }

    public void setShowList(List<Integer> showList) {
        this.showList = showList;
    }

    public List<Integer> getShowList() {
        return showList;
    }
}