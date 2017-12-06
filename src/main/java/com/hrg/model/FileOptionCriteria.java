package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class FileOptionCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String fileid;

    protected String fileidMin;

    protected String fileidMax;

    protected List<String> fileidList;

    protected String isread;

    protected String isreadMin;

    protected String isreadMax;

    protected List<String> isreadList;

    protected String workerid;

    protected String workeridMin;

    protected String workeridMax;

    protected List<String> workeridList;

    protected String workername;

    protected String workernameMin;

    protected String workernameMax;

    protected List<String> workernameList;

    private static final long serialVersionUID = 1L;

    public FileOptionCriteria() {
         
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

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileidMin(String fileidMin) {
        this.fileidMin = fileidMin == null ? null : fileidMin.trim();
    }

    public String getFileidMin() {
        return fileidMin;
    }

    public void setFileidMax(String fileidMax) {
        this.fileidMax = fileidMax == null ? null : fileidMax.trim();
    }

    public String getFileidMax() {
        return fileidMax;
    }

    public void setFileidList(List<String> fileidList) {
        this.fileidList = fileidList;
    }

    public List<String> getFileidList() {
        return fileidList;
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
}