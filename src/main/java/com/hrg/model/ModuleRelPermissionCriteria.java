package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class ModuleRelPermissionCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String moduleid;

    protected String moduleidMin;

    protected String moduleidMax;

    protected List<String> moduleidList;

    protected String permissionid;

    protected String permissionidMin;

    protected String permissionidMax;

    protected List<String> permissionidList;

    protected String options;

    protected String optionsMin;

    protected String optionsMax;

    protected List<String> optionsList;

    private static final long serialVersionUID = 1L;

    public ModuleRelPermissionCriteria() {
         
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

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid == null ? null : moduleid.trim();
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleidMin(String moduleidMin) {
        this.moduleidMin = moduleidMin == null ? null : moduleidMin.trim();
    }

    public String getModuleidMin() {
        return moduleidMin;
    }

    public void setModuleidMax(String moduleidMax) {
        this.moduleidMax = moduleidMax == null ? null : moduleidMax.trim();
    }

    public String getModuleidMax() {
        return moduleidMax;
    }

    public void setModuleidList(List<String> moduleidList) {
        this.moduleidList = moduleidList;
    }

    public List<String> getModuleidList() {
        return moduleidList;
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

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    public String getOptions() {
        return options;
    }

    public void setOptionsMin(String optionsMin) {
        this.optionsMin = optionsMin == null ? null : optionsMin.trim();
    }

    public String getOptionsMin() {
        return optionsMin;
    }

    public void setOptionsMax(String optionsMax) {
        this.optionsMax = optionsMax == null ? null : optionsMax.trim();
    }

    public String getOptionsMax() {
        return optionsMax;
    }

    public void setOptionsList(List<String> optionsList) {
        this.optionsList = optionsList;
    }

    public List<String> getOptionsList() {
        return optionsList;
    }
}