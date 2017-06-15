package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class PreRolePermissionCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String roleid;

    protected String roleidMin;

    protected String roleidMax;

    protected List<String> roleidList;

    protected String permissionid;

    protected String permissionidMin;

    protected String permissionidMax;

    protected List<String> permissionidList;

    private static final long serialVersionUID = 1L;

    public PreRolePermissionCriteria() {
         
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

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleidMin(String roleidMin) {
        this.roleidMin = roleidMin == null ? null : roleidMin.trim();
    }

    public String getRoleidMin() {
        return roleidMin;
    }

    public void setRoleidMax(String roleidMax) {
        this.roleidMax = roleidMax == null ? null : roleidMax.trim();
    }

    public String getRoleidMax() {
        return roleidMax;
    }

    public void setRoleidList(List<String> roleidList) {
        this.roleidList = roleidList;
    }

    public List<String> getRoleidList() {
        return roleidList;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionidMin(String permissionidMin) {
        this.permissionidMin = permissionidMin == null ? null : permissionidMin.trim();
    }

    public String getPermissionidMin() {
        return permissionidMin;
    }

    public void setPermissionidMax(String permissionidMax) {
        this.permissionidMax = permissionidMax == null ? null : permissionidMax.trim();
    }

    public String getPermissionidMax() {
        return permissionidMax;
    }

    public void setPermissionidList(List<String> permissionidList) {
        this.permissionidList = permissionidList;
    }

    public List<String> getPermissionidList() {
        return permissionidList;
    }
}