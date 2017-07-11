package com.hrg.model;

import java.io.Serializable;
import java.util.List;

public class WorkdataChatCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected Integer dataid;

    protected Integer dataidMin;

    protected Integer dataidMax;

    protected List<Integer> dataidList;

    protected String workerid;

    protected String workeridMin;

    protected String workeridMax;

    protected List<String> workeridList;

    protected String chatid;

    protected String chatidMin;

    protected String chatidMax;

    protected List<String> chatidList;

    protected String chatname;

    protected String chatnameMin;

    protected String chatnameMax;

    protected List<String> chatnameList;

    protected String context;

    protected String contextMin;

    protected String contextMax;

    protected List<String> contextList;

    protected String workdataid;

    protected String workdataidMin;

    protected String workdataidMax;

    protected List<String> workdataidList;

    private static final long serialVersionUID = 1L;

    public WorkdataChatCriteria() {
         
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

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Integer getDataid() {
        return dataid;
    }

    public void setDataidMin(Integer dataidMin) {
        this.dataidMin = dataidMin;
    }

    public Integer getDataidMin() {
        return dataidMin;
    }

    public void setDataidMax(Integer dataidMax) {
        this.dataidMax = dataidMax;
    }

    public Integer getDataidMax() {
        return dataidMax;
    }

    public void setDataidList(List<Integer> dataidList) {
        this.dataidList = dataidList;
    }

    public List<Integer> getDataidList() {
        return dataidList;
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

    public void setChatid(String chatid) {
        this.chatid = chatid == null ? null : chatid.trim();
    }

    public String getChatid() {
        return chatid;
    }

    public void setChatidMin(String chatidMin) {
        this.chatidMin = chatidMin == null ? null : chatidMin.trim();
    }

    public String getChatidMin() {
        return chatidMin;
    }

    public void setChatidMax(String chatidMax) {
        this.chatidMax = chatidMax == null ? null : chatidMax.trim();
    }

    public String getChatidMax() {
        return chatidMax;
    }

    public void setChatidList(List<String> chatidList) {
        this.chatidList = chatidList;
    }

    public List<String> getChatidList() {
        return chatidList;
    }

    public void setChatname(String chatname) {
        this.chatname = chatname == null ? null : chatname.trim();
    }

    public String getChatname() {
        return chatname;
    }

    public void setChatnameMin(String chatnameMin) {
        this.chatnameMin = chatnameMin == null ? null : chatnameMin.trim();
    }

    public String getChatnameMin() {
        return chatnameMin;
    }

    public void setChatnameMax(String chatnameMax) {
        this.chatnameMax = chatnameMax == null ? null : chatnameMax.trim();
    }

    public String getChatnameMax() {
        return chatnameMax;
    }

    public void setChatnameList(List<String> chatnameList) {
        this.chatnameList = chatnameList;
    }

    public List<String> getChatnameList() {
        return chatnameList;
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

    public void setWorkdataid(String workdataid) {
        this.workdataid = workdataid == null ? null : workdataid.trim();
    }

    public String getWorkdataid() {
        return workdataid;
    }

    public void setWorkdataidMin(String workdataidMin) {
        this.workdataidMin = workdataidMin == null ? null : workdataidMin.trim();
    }

    public String getWorkdataidMin() {
        return workdataidMin;
    }

    public void setWorkdataidMax(String workdataidMax) {
        this.workdataidMax = workdataidMax == null ? null : workdataidMax.trim();
    }

    public String getWorkdataidMax() {
        return workdataidMax;
    }

    public void setWorkdataidList(List<String> workdataidList) {
        this.workdataidList = workdataidList;
    }

    public List<String> getWorkdataidList() {
        return workdataidList;
    }
}