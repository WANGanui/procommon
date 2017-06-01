package com.hrg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class HrgNoticeCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected Date createtime;

    protected Date createtimeMin;

    protected Date createtimeMax;

    protected String context;

    protected String contextMin;

    protected String contextMax;

    protected List<String> contextList;

    protected String worker;

    protected String workerMin;

    protected String workerMax;

    protected List<String> workerList;

    protected String department;

    protected String departmentMin;

    protected String departmentMax;

    protected List<String> departmentList;

    protected String workerdataid;

    protected String workerdataidMin;

    protected String workerdataidMax;

    protected List<String> workerdataidList;

    protected String departmentdataid;

    protected String departmentdataidMin;

    protected String departmentdataidMax;

    protected List<String> departmentdataidList;

    protected Date time;

    protected Date timeMin;

    protected Date timeMax;

    private static final long serialVersionUID = 1L;

    public HrgNoticeCriteria() {
         
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

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetimeMin(Date createtimeMin) {
        this.createtimeMin = createtimeMin;
    }

    public Date getCreatetimeMin() {
        return createtimeMin;
    }

    public void setCreatetimeMax(Date createtimeMax) {
        this.createtimeMax = createtimeMax;
    }

    public Date getCreatetimeMax() {
        return createtimeMax;
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

    public void setWorker(String worker) {
        this.worker = worker == null ? null : worker.trim();
    }

    public String getWorker() {
        return worker;
    }

    public void setWorkerMin(String workerMin) {
        this.workerMin = workerMin == null ? null : workerMin.trim();
    }

    public String getWorkerMin() {
        return workerMin;
    }

    public void setWorkerMax(String workerMax) {
        this.workerMax = workerMax == null ? null : workerMax.trim();
    }

    public String getWorkerMax() {
        return workerMax;
    }

    public void setWorkerList(List<String> workerList) {
        this.workerList = workerList;
    }

    public List<String> getWorkerList() {
        return workerList;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartmentMin(String departmentMin) {
        this.departmentMin = departmentMin == null ? null : departmentMin.trim();
    }

    public String getDepartmentMin() {
        return departmentMin;
    }

    public void setDepartmentMax(String departmentMax) {
        this.departmentMax = departmentMax == null ? null : departmentMax.trim();
    }

    public String getDepartmentMax() {
        return departmentMax;
    }

    public void setDepartmentList(List<String> departmentList) {
        this.departmentList = departmentList;
    }

    public List<String> getDepartmentList() {
        return departmentList;
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

    public void setDepartmentdataid(String departmentdataid) {
        this.departmentdataid = departmentdataid == null ? null : departmentdataid.trim();
    }

    public String getDepartmentdataid() {
        return departmentdataid;
    }

    public void setDepartmentdataidMin(String departmentdataidMin) {
        this.departmentdataidMin = departmentdataidMin == null ? null : departmentdataidMin.trim();
    }

    public String getDepartmentdataidMin() {
        return departmentdataidMin;
    }

    public void setDepartmentdataidMax(String departmentdataidMax) {
        this.departmentdataidMax = departmentdataidMax == null ? null : departmentdataidMax.trim();
    }

    public String getDepartmentdataidMax() {
        return departmentdataidMax;
    }

    public void setDepartmentdataidList(List<String> departmentdataidList) {
        this.departmentdataidList = departmentdataidList;
    }

    public List<String> getDepartmentdataidList() {
        return departmentdataidList;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTimeMin(Date timeMin) {
        this.timeMin = timeMin;
    }

    public Date getTimeMin() {
        return timeMin;
    }

    public void setTimeMax(Date timeMax) {
        this.timeMax = timeMax;
    }

    public Date getTimeMax() {
        return timeMax;
    }
}