package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class WorkerRolePermissionCriteria implements Serializable {
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

    protected String moduleurl;

    protected String moduleurlMin;

    protected String moduleurlMax;

    protected List<String> moduleurlList;

    protected String options;

    protected String optionsMin;

    protected String optionsMax;

    protected List<String> optionsList;

    protected String modulename;

    protected String modulenameMin;

    protected String modulenameMax;

    protected List<String> modulenameList;

    protected String modulepid;

    protected String modulepidMin;

    protected String modulepidMax;

    protected List<String> modulepidList;

    private static final long serialVersionUID = 1L;

    public WorkerRolePermissionCriteria() {
         
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

    public void setModuleurl(String moduleurl) {
        this.moduleurl = moduleurl == null ? null : moduleurl.trim();
    }

    public String getModuleurl() {
        return moduleurl;
    }

    public void setModuleurlMin(String moduleurlMin) {
        this.moduleurlMin = moduleurlMin == null ? null : moduleurlMin.trim();
    }

    public String getModuleurlMin() {
        return moduleurlMin;
    }

    public void setModuleurlMax(String moduleurlMax) {
        this.moduleurlMax = moduleurlMax == null ? null : moduleurlMax.trim();
    }

    public String getModuleurlMax() {
        return moduleurlMax;
    }

    public void setModuleurlList(List<String> moduleurlList) {
        this.moduleurlList = moduleurlList;
    }

    public List<String> getModuleurlList() {
        return moduleurlList;
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

    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulenameMin(String modulenameMin) {
        this.modulenameMin = modulenameMin == null ? null : modulenameMin.trim();
    }

    public String getModulenameMin() {
        return modulenameMin;
    }

    public void setModulenameMax(String modulenameMax) {
        this.modulenameMax = modulenameMax == null ? null : modulenameMax.trim();
    }

    public String getModulenameMax() {
        return modulenameMax;
    }

    public void setModulenameList(List<String> modulenameList) {
        this.modulenameList = modulenameList;
    }

    public List<String> getModulenameList() {
        return modulenameList;
    }

    public void setModulepid(String modulepid) {
        this.modulepid = modulepid == null ? null : modulepid.trim();
    }

    public String getModulepid() {
        return modulepid;
    }

    public void setModulepidMin(String modulepidMin) {
        this.modulepidMin = modulepidMin == null ? null : modulepidMin.trim();
    }

    public String getModulepidMin() {
        return modulepidMin;
    }

    public void setModulepidMax(String modulepidMax) {
        this.modulepidMax = modulepidMax == null ? null : modulepidMax.trim();
    }

    public String getModulepidMax() {
        return modulepidMax;
    }

    public void setModulepidList(List<String> modulepidList) {
        this.modulepidList = modulepidList;
    }

    public List<String> getModulepidList() {
        return modulepidList;
    }
}