package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class PreSysPermissionCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String groupcode;

    protected String groupcodeMin;

    protected String groupcodeMax;

    protected List<String> groupcodeList;

    protected String groupname;

    protected String groupnameMin;

    protected String groupnameMax;

    protected List<String> groupnameList;

    protected String permissioncode;

    protected String permissioncodeMin;

    protected String permissioncodeMax;

    protected List<String> permissioncodeList;

    protected String permissionname;

    protected String permissionnameMin;

    protected String permissionnameMax;

    protected List<String> permissionnameList;

    protected String permissionurl;

    protected String permissionurlMin;

    protected String permissionurlMax;

    protected List<String> permissionurlList;

    private static final long serialVersionUID = 1L;

    public PreSysPermissionCriteria() {
         
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

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode == null ? null : groupcode.trim();
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcodeMin(String groupcodeMin) {
        this.groupcodeMin = groupcodeMin == null ? null : groupcodeMin.trim();
    }

    public String getGroupcodeMin() {
        return groupcodeMin;
    }

    public void setGroupcodeMax(String groupcodeMax) {
        this.groupcodeMax = groupcodeMax == null ? null : groupcodeMax.trim();
    }

    public String getGroupcodeMax() {
        return groupcodeMax;
    }

    public void setGroupcodeList(List<String> groupcodeList) {
        this.groupcodeList = groupcodeList;
    }

    public List<String> getGroupcodeList() {
        return groupcodeList;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupnameMin(String groupnameMin) {
        this.groupnameMin = groupnameMin == null ? null : groupnameMin.trim();
    }

    public String getGroupnameMin() {
        return groupnameMin;
    }

    public void setGroupnameMax(String groupnameMax) {
        this.groupnameMax = groupnameMax == null ? null : groupnameMax.trim();
    }

    public String getGroupnameMax() {
        return groupnameMax;
    }

    public void setGroupnameList(List<String> groupnameList) {
        this.groupnameList = groupnameList;
    }

    public List<String> getGroupnameList() {
        return groupnameList;
    }

    public void setPermissioncode(String permissioncode) {
        this.permissioncode = permissioncode == null ? null : permissioncode.trim();
    }

    public String getPermissioncode() {
        return permissioncode;
    }

    public void setPermissioncodeMin(String permissioncodeMin) {
        this.permissioncodeMin = permissioncodeMin == null ? null : permissioncodeMin.trim();
    }

    public String getPermissioncodeMin() {
        return permissioncodeMin;
    }

    public void setPermissioncodeMax(String permissioncodeMax) {
        this.permissioncodeMax = permissioncodeMax == null ? null : permissioncodeMax.trim();
    }

    public String getPermissioncodeMax() {
        return permissioncodeMax;
    }

    public void setPermissioncodeList(List<String> permissioncodeList) {
        this.permissioncodeList = permissioncodeList;
    }

    public List<String> getPermissioncodeList() {
        return permissioncodeList;
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

    public void setPermissionurl(String permissionurl) {
        this.permissionurl = permissionurl == null ? null : permissionurl.trim();
    }

    public String getPermissionurl() {
        return permissionurl;
    }

    public void setPermissionurlMin(String permissionurlMin) {
        this.permissionurlMin = permissionurlMin == null ? null : permissionurlMin.trim();
    }

    public String getPermissionurlMin() {
        return permissionurlMin;
    }

    public void setPermissionurlMax(String permissionurlMax) {
        this.permissionurlMax = permissionurlMax == null ? null : permissionurlMax.trim();
    }

    public String getPermissionurlMax() {
        return permissionurlMax;
    }

    public void setPermissionurlList(List<String> permissionurlList) {
        this.permissionurlList = permissionurlList;
    }

    public List<String> getPermissionurlList() {
        return permissionurlList;
    }
}