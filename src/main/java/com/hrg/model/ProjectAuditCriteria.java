package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class ProjectAuditCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected Integer id;

    protected Integer idMin;

    protected Integer idMax;

    protected List<Integer> idList;

    protected String projectid;

    protected String projectidMin;

    protected String projectidMax;

    protected List<String> projectidList;

    protected String auditorid;

    protected String auditoridMin;

    protected String auditoridMax;

    protected List<String> auditoridList;

    protected String auditstate;

    protected String auditstateMin;

    protected String auditstateMax;

    protected List<String> auditstateList;

    protected Integer orderid;

    protected Integer orderidMin;

    protected Integer orderidMax;

    protected List<Integer> orderidList;

    protected String remark;

    protected String remarkMin;

    protected String remarkMax;

    protected List<String> remarkList;

    private static final long serialVersionUID = 1L;

    public ProjectAuditCriteria() {
         
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

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setIdMin(Integer idMin) {
        this.idMin = idMin;
    }

    public Integer getIdMin() {
        return idMin;
    }

    public void setIdMax(Integer idMax) {
        this.idMax = idMax;
    }

    public Integer getIdMax() {
        return idMax;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public List<Integer> getIdList() {
        return idList;
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

    public void setAuditorid(String auditorid) {
        this.auditorid = auditorid == null ? null : auditorid.trim();
    }

    public String getAuditorid() {
        return auditorid;
    }

    public void setAuditoridMin(String auditoridMin) {
        this.auditoridMin = auditoridMin == null ? null : auditoridMin.trim();
    }

    public String getAuditoridMin() {
        return auditoridMin;
    }

    public void setAuditoridMax(String auditoridMax) {
        this.auditoridMax = auditoridMax == null ? null : auditoridMax.trim();
    }

    public String getAuditoridMax() {
        return auditoridMax;
    }

    public void setAuditoridList(List<String> auditoridList) {
        this.auditoridList = auditoridList;
    }

    public List<String> getAuditoridList() {
        return auditoridList;
    }

    public void setAuditstate(String auditstate) {
        this.auditstate = auditstate == null ? null : auditstate.trim();
    }

    public String getAuditstate() {
        return auditstate;
    }

    public void setAuditstateMin(String auditstateMin) {
        this.auditstateMin = auditstateMin == null ? null : auditstateMin.trim();
    }

    public String getAuditstateMin() {
        return auditstateMin;
    }

    public void setAuditstateMax(String auditstateMax) {
        this.auditstateMax = auditstateMax == null ? null : auditstateMax.trim();
    }

    public String getAuditstateMax() {
        return auditstateMax;
    }

    public void setAuditstateList(List<String> auditstateList) {
        this.auditstateList = auditstateList;
    }

    public List<String> getAuditstateList() {
        return auditstateList;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderidMin(Integer orderidMin) {
        this.orderidMin = orderidMin;
    }

    public Integer getOrderidMin() {
        return orderidMin;
    }

    public void setOrderidMax(Integer orderidMax) {
        this.orderidMax = orderidMax;
    }

    public Integer getOrderidMax() {
        return orderidMax;
    }

    public void setOrderidList(List<Integer> orderidList) {
        this.orderidList = orderidList;
    }

    public List<Integer> getOrderidList() {
        return orderidList;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemarkMin(String remarkMin) {
        this.remarkMin = remarkMin == null ? null : remarkMin.trim();
    }

    public String getRemarkMin() {
        return remarkMin;
    }

    public void setRemarkMax(String remarkMax) {
        this.remarkMax = remarkMax == null ? null : remarkMax.trim();
    }

    public String getRemarkMax() {
        return remarkMax;
    }

    public void setRemarkList(List<String> remarkList) {
        this.remarkList = remarkList;
    }

    public List<String> getRemarkList() {
        return remarkList;
    }
}