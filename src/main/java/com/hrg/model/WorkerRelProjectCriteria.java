package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class WorkerRelProjectCriteria implements Serializable {
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

    protected String workername;

    protected String workernameMin;

    protected String workernameMax;

    protected List<String> workernameList;

    protected String projectdataid;

    protected String projectdataidMin;

    protected String projectdataidMax;

    protected List<String> projectdataidList;

    protected String projectname;

    protected String projectnameMin;

    protected String projectnameMax;

    protected List<String> projectnameList;

    private static final long serialVersionUID = 1L;

    public WorkerRelProjectCriteria() {
         
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

    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkernameMin(String workernameMin) {
        this.workernameMin = workernameMin == null ? null : workernameMin.trim();
    }

    public String getWorkernameMin() {
        return workernameMin;
    }

    public void setWorkernameMax(String workernameMax) {
        this.workernameMax = workernameMax == null ? null : workernameMax.trim();
    }

    public String getWorkernameMax() {
        return workernameMax;
    }

    public void setWorkernameList(List<String> workernameList) {
        this.workernameList = workernameList;
    }

    public List<String> getWorkernameList() {
        return workernameList;
    }

    public void setProjectdataid(String projectdataid) {
        this.projectdataid = projectdataid == null ? null : projectdataid.trim();
    }

    public String getProjectdataid() {
        return projectdataid;
    }

    public void setProjectdataidMin(String projectdataidMin) {
        this.projectdataidMin = projectdataidMin == null ? null : projectdataidMin.trim();
    }

    public String getProjectdataidMin() {
        return projectdataidMin;
    }

    public void setProjectdataidMax(String projectdataidMax) {
        this.projectdataidMax = projectdataidMax == null ? null : projectdataidMax.trim();
    }

    public String getProjectdataidMax() {
        return projectdataidMax;
    }

    public void setProjectdataidList(List<String> projectdataidList) {
        this.projectdataidList = projectdataidList;
    }

    public List<String> getProjectdataidList() {
        return projectdataidList;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectnameMin(String projectnameMin) {
        this.projectnameMin = projectnameMin == null ? null : projectnameMin.trim();
    }

    public String getProjectnameMin() {
        return projectnameMin;
    }

    public void setProjectnameMax(String projectnameMax) {
        this.projectnameMax = projectnameMax == null ? null : projectnameMax.trim();
    }

    public String getProjectnameMax() {
        return projectnameMax;
    }

    public void setProjectnameList(List<String> projectnameList) {
        this.projectnameList = projectnameList;
    }

    public List<String> getProjectnameList() {
        return projectnameList;
    }
}