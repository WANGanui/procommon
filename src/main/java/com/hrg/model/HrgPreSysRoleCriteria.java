package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class HrgPreSysRoleCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String rolename;

    protected String rolenameMin;

    protected String rolenameMax;

    protected List<String> rolenameList;

    protected String parentroledataid;

    protected String parentroledataidMin;

    protected String parentroledataidMax;

    protected List<String> parentroledataidList;

    private static final long serialVersionUID = 1L;

    public HrgPreSysRoleCriteria() {
         
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

    public void setParentroledataid(String parentroledataid) {
        this.parentroledataid = parentroledataid == null ? null : parentroledataid.trim();
    }

    public String getParentroledataid() {
        return parentroledataid;
    }

    public void setParentroledataidMin(String parentroledataidMin) {
        this.parentroledataidMin = parentroledataidMin == null ? null : parentroledataidMin.trim();
    }

    public String getParentroledataidMin() {
        return parentroledataidMin;
    }

    public void setParentroledataidMax(String parentroledataidMax) {
        this.parentroledataidMax = parentroledataidMax == null ? null : parentroledataidMax.trim();
    }

    public String getParentroledataidMax() {
        return parentroledataidMax;
    }

    public void setParentroledataidList(List<String> parentroledataidList) {
        this.parentroledataidList = parentroledataidList;
    }

    public List<String> getParentroledataidList() {
        return parentroledataidList;
    }
}