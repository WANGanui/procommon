package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class NoticeRelWorkerCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String noticeid;

    protected String noticeidMin;

    protected String noticeidMax;

    protected List<String> noticeidList;

    protected String workerid;

    protected String workeridMin;

    protected String workeridMax;

    protected List<String> workeridList;

    protected String isread;

    protected String isreadMin;

    protected String isreadMax;

    protected List<String> isreadList;

    private static final long serialVersionUID = 1L;

    public NoticeRelWorkerCriteria() {
         
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

    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid == null ? null : noticeid.trim();
    }

    public String getNoticeid() {
        return noticeid;
    }

    public void setNoticeidMin(String noticeidMin) {
        this.noticeidMin = noticeidMin == null ? null : noticeidMin.trim();
    }

    public String getNoticeidMin() {
        return noticeidMin;
    }

    public void setNoticeidMax(String noticeidMax) {
        this.noticeidMax = noticeidMax == null ? null : noticeidMax.trim();
    }

    public String getNoticeidMax() {
        return noticeidMax;
    }

    public void setNoticeidList(List<String> noticeidList) {
        this.noticeidList = noticeidList;
    }

    public List<String> getNoticeidList() {
        return noticeidList;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkeridMin(String workeridMin) {
        this.workeridMin = workeridMin == null ? null : workeridMin.trim();
    }

    public String getWorkeridMin() {
        return workeridMin;
    }

    public void setWorkeridMax(String workeridMax) {
        this.workeridMax = workeridMax == null ? null : workeridMax.trim();
    }

    public String getWorkeridMax() {
        return workeridMax;
    }

    public void setWorkeridList(List<String> workeridList) {
        this.workeridList = workeridList;
    }

    public List<String> getWorkeridList() {
        return workeridList;
    }

    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
    }

    public String getIsread() {
        return isread;
    }

    public void setIsreadMin(String isreadMin) {
        this.isreadMin = isreadMin == null ? null : isreadMin.trim();
    }

    public String getIsreadMin() {
        return isreadMin;
    }

    public void setIsreadMax(String isreadMax) {
        this.isreadMax = isreadMax == null ? null : isreadMax.trim();
    }

    public String getIsreadMax() {
        return isreadMax;
    }

    public void setIsreadList(List<String> isreadList) {
        this.isreadList = isreadList;
    }

    public List<String> getIsreadList() {
        return isreadList;
    }
}