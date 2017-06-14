package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class PreSysRoleRelPermissionCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String parentroledataid;

    protected String parentroledataidMin;

    protected String parentroledataidMax;

    protected List<String> parentroledataidList;

    protected String roledataid;

    protected String roledataidMin;

    protected String roledataidMax;

    protected List<String> roledataidList;

    protected String rolename;

    protected String rolenameMin;

    protected String rolenameMax;

    protected List<String> rolenameList;

    protected String permissiondataid;

    protected String permissiondataidMin;

    protected String permissiondataidMax;

    protected List<String> permissiondataidList;

    private static final long serialVersionUID = 1L;

    public PreSysRoleRelPermissionCriteria() {
         
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

    public void setRoledataid(String roledataid) {
        this.roledataid = roledataid == null ? null : roledataid.trim();
    }

    public String getRoledataid() {
        return roledataid;
    }

    public void setRoledataidMin(String roledataidMin) {
        this.roledataidMin = roledataidMin == null ? null : roledataidMin.trim();
    }

    public String getRoledataidMin() {
        return roledataidMin;
    }

    public void setRoledataidMax(String roledataidMax) {
        this.roledataidMax = roledataidMax == null ? null : roledataidMax.trim();
    }

    public String getRoledataidMax() {
        return roledataidMax;
    }

    public void setRoledataidList(List<String> roledataidList) {
        this.roledataidList = roledataidList;
    }

    public List<String> getRoledataidList() {
        return roledataidList;
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

    public void setPermissiondataid(String permissiondataid) {
        this.permissiondataid = permissiondataid == null ? null : permissiondataid.trim();
    }

    public String getPermissiondataid() {
        return permissiondataid;
    }

    public void setPermissiondataidMin(String permissiondataidMin) {
        this.permissiondataidMin = permissiondataidMin == null ? null : permissiondataidMin.trim();
    }

    public String getPermissiondataidMin() {
        return permissiondataidMin;
    }

    public void setPermissiondataidMax(String permissiondataidMax) {
        this.permissiondataidMax = permissiondataidMax == null ? null : permissiondataidMax.trim();
    }

    public String getPermissiondataidMax() {
        return permissiondataidMax;
    }

    public void setPermissiondataidList(List<String> permissiondataidList) {
        this.permissiondataidList = permissiondataidList;
    }

    public List<String> getPermissiondataidList() {
        return permissiondataidList;
    }
}