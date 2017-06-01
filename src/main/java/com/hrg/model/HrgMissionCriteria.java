package com.hrg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class HrgMissionCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected Integer limitStart;

    protected Integer pageSize;

    protected String dataid;

    protected String dataidMin;

    protected String dataidMax;

    protected List<String> dataidList;

    protected String name;

    protected String nameMin;

    protected String nameMax;

    protected List<String> nameList;

    protected String context;

    protected String contextMin;

    protected String contextMax;

    protected List<String> contextList;

    protected Date starttime;

    protected Date starttimeMin;

    protected Date starttimeMax;

    protected Date endtime;

    protected Date endtimeMin;

    protected Date endtimeMax;

    protected Date finishtime;

    protected Date finishtimeMin;

    protected Date finishtimeMax;

    protected String state;

    protected String stateMin;

    protected String stateMax;

    protected List<String> stateList;

    protected String proDataid;

    protected String proDataidMin;

    protected String proDataidMax;

    protected List<String> proDataidList;

    protected String proName;

    protected String proNameMin;

    protected String proNameMax;

    protected List<String> proNameList;

    protected String remark;

    protected String remarkMin;

    protected String remarkMax;

    protected List<String> remarkList;

    protected String percentage;

    protected String percentageMin;

    protected String percentageMax;

    protected List<String> percentageList;

    protected String proportion;

    protected String proportionMin;

    protected String proportionMax;

    protected List<String> proportionList;

    private static final long serialVersionUID = 1L;

    public HrgMissionCriteria() {
         
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

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getName() {
        return name;
    }

    public void setNameMin(String nameMin) {
        this.nameMin = nameMin == null ? null : nameMin.trim();
    }

    public String getNameMin() {
        return nameMin;
    }

    public void setNameMax(String nameMax) {
        this.nameMax = nameMax == null ? null : nameMax.trim();
    }

    public String getNameMax() {
        return nameMax;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public List<String> getNameList() {
        return nameList;
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

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttimeMin(Date starttimeMin) {
        this.starttimeMin = starttimeMin;
    }

    public Date getStarttimeMin() {
        return starttimeMin;
    }

    public void setStarttimeMax(Date starttimeMax) {
        this.starttimeMax = starttimeMax;
    }

    public Date getStarttimeMax() {
        return starttimeMax;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtimeMin(Date endtimeMin) {
        this.endtimeMin = endtimeMin;
    }

    public Date getEndtimeMin() {
        return endtimeMin;
    }

    public void setEndtimeMax(Date endtimeMax) {
        this.endtimeMax = endtimeMax;
    }

    public Date getEndtimeMax() {
        return endtimeMax;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtimeMin(Date finishtimeMin) {
        this.finishtimeMin = finishtimeMin;
    }

    public Date getFinishtimeMin() {
        return finishtimeMin;
    }

    public void setFinishtimeMax(Date finishtimeMax) {
        this.finishtimeMax = finishtimeMax;
    }

    public Date getFinishtimeMax() {
        return finishtimeMax;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getState() {
        return state;
    }

    public void setStateMin(String stateMin) {
        this.stateMin = stateMin == null ? null : stateMin.trim();
    }

    public String getStateMin() {
        return stateMin;
    }

    public void setStateMax(String stateMax) {
        this.stateMax = stateMax == null ? null : stateMax.trim();
    }

    public String getStateMax() {
        return stateMax;
    }

    public void setStateList(List<String> stateList) {
        this.stateList = stateList;
    }

    public List<String> getStateList() {
        return stateList;
    }

    public void setProDataid(String proDataid) {
        this.proDataid = proDataid == null ? null : proDataid.trim();
    }

    public String getProDataid() {
        return proDataid;
    }

    public void setProDataidMin(String proDataidMin) {
        this.proDataidMin = proDataidMin == null ? null : proDataidMin.trim();
    }

    public String getProDataidMin() {
        return proDataidMin;
    }

    public void setProDataidMax(String proDataidMax) {
        this.proDataidMax = proDataidMax == null ? null : proDataidMax.trim();
    }

    public String getProDataidMax() {
        return proDataidMax;
    }

    public void setProDataidList(List<String> proDataidList) {
        this.proDataidList = proDataidList;
    }

    public List<String> getProDataidList() {
        return proDataidList;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProNameMin(String proNameMin) {
        this.proNameMin = proNameMin == null ? null : proNameMin.trim();
    }

    public String getProNameMin() {
        return proNameMin;
    }

    public void setProNameMax(String proNameMax) {
        this.proNameMax = proNameMax == null ? null : proNameMax.trim();
    }

    public String getProNameMax() {
        return proNameMax;
    }

    public void setProNameList(List<String> proNameList) {
        this.proNameList = proNameList;
    }

    public List<String> getProNameList() {
        return proNameList;
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

    public void setProportion(String proportion) {
        this.proportion = proportion == null ? null : proportion.trim();
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportionMin(String proportionMin) {
        this.proportionMin = proportionMin == null ? null : proportionMin.trim();
    }

    public String getProportionMin() {
        return proportionMin;
    }

    public void setProportionMax(String proportionMax) {
        this.proportionMax = proportionMax == null ? null : proportionMax.trim();
    }

    public String getProportionMax() {
        return proportionMax;
    }

    public void setProportionList(List<String> proportionList) {
        this.proportionList = proportionList;
    }

    public List<String> getProportionList() {
        return proportionList;
    }
}