package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class ModuleCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String datatid;

    protected String datatidMin;

    protected String datatidMax;

    protected List<String> datatidList;

    protected String modulename;

    protected String modulenameMin;

    protected String modulenameMax;

    protected List<String> modulenameList;

    protected String moduleurl;

    protected String moduleurlMin;

    protected String moduleurlMax;

    protected List<String> moduleurlList;

    protected String modulepid;

    protected String modulepidMin;

    protected String modulepidMax;

    protected List<String> modulepidList;

    private static final long serialVersionUID = 1L;

    public ModuleCriteria() {
         
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

    public void setDatatid(String datatid) {
        this.datatid = datatid == null ? null : datatid.trim();
    }

    public String getDatatid() {
        return datatid;
    }

    public void setDatatidMin(String datatidMin) {
        this.datatidMin = datatidMin == null ? null : datatidMin.trim();
    }

    public String getDatatidMin() {
        return datatidMin;
    }

    public void setDatatidMax(String datatidMax) {
        this.datatidMax = datatidMax == null ? null : datatidMax.trim();
    }

    public String getDatatidMax() {
        return datatidMax;
    }

    public void setDatatidList(List<String> datatidList) {
        this.datatidList = datatidList;
    }

    public List<String> getDatatidList() {
        return datatidList;
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