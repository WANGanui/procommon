package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class ProjectRelDepartmentCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String projectid;

    protected String projectidMin;

    protected String projectidMax;

    protected List<String> projectidList;

    protected String departmentid;

    protected String departmentidMin;

    protected String departmentidMax;

    protected List<String> departmentidList;

    protected String percentage;

    protected String percentageMin;

    protected String percentageMax;

    protected List<String> percentageList;

    private static final long serialVersionUID = 1L;

    public ProjectRelDepartmentCriteria() {
         
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

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentidMin(String departmentidMin) {
        this.departmentidMin = departmentidMin == null ? null : departmentidMin.trim();
    }

    public String getDepartmentidMin() {
        return departmentidMin;
    }

    public void setDepartmentidMax(String departmentidMax) {
        this.departmentidMax = departmentidMax == null ? null : departmentidMax.trim();
    }

    public String getDepartmentidMax() {
        return departmentidMax;
    }

    public void setDepartmentidList(List<String> departmentidList) {
        this.departmentidList = departmentidList;
    }

    public List<String> getDepartmentidList() {
        return departmentidList;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage == null ? null : percentage.trim();
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentageMin(String percentageMin) {
        this.percentageMin = percentageMin == null ? null : percentageMin.trim();
    }

    public String getPercentageMin() {
        return percentageMin;
    }

    public void setPercentageMax(String percentageMax) {
        this.percentageMax = percentageMax == null ? null : percentageMax.trim();
    }

    public String getPercentageMax() {
        return percentageMax;
    }

    public void setPercentageList(List<String> percentageList) {
        this.percentageList = percentageList;
    }

    public List<String> getPercentageList() {
        return percentageList;
    }
}