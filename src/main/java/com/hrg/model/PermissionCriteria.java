package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class PermissionCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String permissionname;

    protected String permissionnameMin;

    protected String permissionnameMax;

    protected List<String> permissionnameList;

    private static final long serialVersionUID = 1L;

    public PermissionCriteria() {
         
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

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionnameMin(String permissionnameMin) {
        this.permissionnameMin = permissionnameMin == null ? null : permissionnameMin.trim();
    }

    public String getPermissionnameMin() {
        return permissionnameMin;
    }

    public void setPermissionnameMax(String permissionnameMax) {
        this.permissionnameMax = permissionnameMax == null ? null : permissionnameMax.trim();
    }

    public String getPermissionnameMax() {
        return permissionnameMax;
    }

    public void setPermissionnameList(List<String> permissionnameList) {
        this.permissionnameList = permissionnameList;
    }

    public List<String> getPermissionnameList() {
        return permissionnameList;
    }
}