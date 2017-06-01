package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class WorkerRoleCriteria implements Serializable {
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

    protected String preroleid;

    protected String preroleidMin;

    protected String preroleidMax;

    protected List<String> preroleidList;

    protected String parentroleid;

    protected String parentroleidMin;

    protected String parentroleidMax;

    protected List<String> parentroleidList;

    protected String rolename;

    protected String rolenameMin;

    protected String rolenameMax;

    protected List<String> rolenameList;

    private static final long serialVersionUID = 1L;

    public WorkerRoleCriteria() {
         
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

    public void setPreroleid(String preroleid) {
        this.preroleid = preroleid == null ? null : preroleid.trim();
    }

    public String getPreroleid() {
        return preroleid;
    }

    public void setPreroleidMin(String preroleidMin) {
        this.preroleidMin = preroleidMin == null ? null : preroleidMin.trim();
    }

    public String getPreroleidMin() {
        return preroleidMin;
    }

    public void setPreroleidMax(String preroleidMax) {
        this.preroleidMax = preroleidMax == null ? null : preroleidMax.trim();
    }

    public String getPreroleidMax() {
        return preroleidMax;
    }

    public void setPreroleidList(List<String> preroleidList) {
        this.preroleidList = preroleidList;
    }

    public List<String> getPreroleidList() {
        return preroleidList;
    }

    public void setParentroleid(String parentroleid) {
        this.parentroleid = parentroleid == null ? null : parentroleid.trim();
    }

    public String getParentroleid() {
        return parentroleid;
    }

    public void setParentroleidMin(String parentroleidMin) {
        this.parentroleidMin = parentroleidMin == null ? null : parentroleidMin.trim();
    }

    public String getParentroleidMin() {
        return parentroleidMin;
    }

    public void setParentroleidMax(String parentroleidMax) {
        this.parentroleidMax = parentroleidMax == null ? null : parentroleidMax.trim();
    }

    public String getParentroleidMax() {
        return parentroleidMax;
    }

    public void setParentroleidList(List<String> parentroleidList) {
        this.parentroleidList = parentroleidList;
    }

    public List<String> getParentroleidList() {
        return parentroleidList;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolenameMin(String rolenameMin) {
        this.rolenameMin = rolenameMin == null ? null : rolenameMin.trim();
    }

    public String getRolenameMin() {
        return rolenameMin;
    }

    public void setRolenameMax(String rolenameMax) {
        this.rolenameMax = rolenameMax == null ? null : rolenameMax.trim();
    }

    public String getRolenameMax() {
        return rolenameMax;
    }

    public void setRolenameList(List<String> rolenameList) {
        this.rolenameList = rolenameList;
    }

    public List<String> getRolenameList() {
        return rolenameList;
    }
}