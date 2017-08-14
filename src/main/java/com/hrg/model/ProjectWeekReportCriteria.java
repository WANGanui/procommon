package com.hrg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProjectWeekReportCriteria implements Serializable {
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

    protected Date date;

    protected Date dateMin;

    protected Date dateMax;

    protected String context;

    protected String contextMin;

    protected String contextMax;

    protected List<String> contextList;

    protected String plan;

    protected String planMin;

    protected String planMax;

    protected List<String> planList;

    protected String target;

    protected String targetMin;

    protected String targetMax;

    protected List<String> targetList;

    protected String projectname;

    protected String projectnameMin;

    protected String projectnameMax;

    protected List<String> projectnameList;

    private static final long serialVersionUID = 1L;

    public ProjectWeekReportCriteria() {
         
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

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDateMin(Date dateMin) {
        this.dateMin = dateMin;
    }

    public Date getDateMin() {
        return dateMin;
    }

    public void setDateMax(Date dateMax) {
        this.dateMax = dateMax;
    }

    public Date getDateMax() {
        return dateMax;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContextMin(String contextMin) {
        this.contextMin = contextMin == null ? null : contextMin.trim();
    }

    public String getContextMin() {
        return contextMin;
    }

    public void setContextMax(String contextMax) {
        this.contextMax = contextMax == null ? null : contextMax.trim();
    }

    public String getContextMax() {
        return contextMax;
    }

    public void setContextList(List<String> contextList) {
        this.contextList = contextList;
    }

    public List<String> getContextList() {
        return contextList;
    }

    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }

    public String getPlan() {
        return plan;
    }

    public void setPlanMin(String planMin) {
        this.planMin = planMin == null ? null : planMin.trim();
    }

    public String getPlanMin() {
        return planMin;
    }

    public void setPlanMax(String planMax) {
        this.planMax = planMax == null ? null : planMax.trim();
    }

    public String getPlanMax() {
        return planMax;
    }

    public void setPlanList(List<String> planList) {
        this.planList = planList;
    }

    public List<String> getPlanList() {
        return planList;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTargetMin(String targetMin) {
        this.targetMin = targetMin == null ? null : targetMin.trim();
    }

    public String getTargetMin() {
        return targetMin;
    }

    public void setTargetMax(String targetMax) {
        this.targetMax = targetMax == null ? null : targetMax.trim();
    }

    public String getTargetMax() {
        return targetMax;
    }

    public void setTargetList(List<String> targetList) {
        this.targetList = targetList;
    }

    public List<String> getTargetList() {
        return targetList;
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