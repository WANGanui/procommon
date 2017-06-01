package com.hrg.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProjectCriteria implements Serializable {
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

    protected Date starttime;

    protected Date starttimeMin;

    protected Date starttimeMax;

    protected Date endtime;

    protected Date endtimeMin;

    protected Date endtimeMax;

    protected Integer days;

    protected Integer daysMin;

    protected Integer daysMax;

    protected List<Integer> daysList;

    protected Integer month;

    protected Integer monthMin;

    protected Integer monthMax;

    protected List<Integer> monthList;

    protected String leader;

    protected String leaderMin;

    protected String leaderMax;

    protected List<String> leaderList;

    protected String contect;

    protected String contectMin;

    protected String contectMax;

    protected List<String> contectList;

    protected String state;

    protected String stateMin;

    protected String stateMax;

    protected List<String> stateList;

    protected Date finishtime;

    protected Date finishtimeMin;

    protected Date finishtimeMax;

    protected String remark;

    protected String remarkMin;

    protected String remarkMax;

    protected List<String> remarkList;

    protected String creator;

    protected String creatorMin;

    protected String creatorMax;

    protected List<String> creatorList;

    protected Date createtime;

    protected Date createtimeMin;

    protected Date createtimeMax;

    protected String modify;

    protected String modifyMin;

    protected String modifyMax;

    protected List<String> modifyList;

    protected Date modifytime;

    protected Date modifytimeMin;

    protected Date modifytimeMax;

    protected String creatordataid;

    protected String creatordataidMin;

    protected String creatordataidMax;

    protected List<String> creatordataidList;

    protected String modifydataid;

    protected String modifydataidMin;

    protected String modifydataidMax;

    protected List<String> modifydataidList;

    private static final long serialVersionUID = 1L;

    public ProjectCriteria() {
         
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

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getDays() {
        return days;
    }

    public void setDaysMin(Integer daysMin) {
        this.daysMin = daysMin;
    }

    public Integer getDaysMin() {
        return daysMin;
    }

    public void setDaysMax(Integer daysMax) {
        this.daysMax = daysMax;
    }

    public Integer getDaysMax() {
        return daysMax;
    }

    public void setDaysList(List<Integer> daysList) {
        this.daysList = daysList;
    }

    public List<Integer> getDaysList() {
        return daysList;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonthMin(Integer monthMin) {
        this.monthMin = monthMin;
    }

    public Integer getMonthMin() {
        return monthMin;
    }

    public void setMonthMax(Integer monthMax) {
        this.monthMax = monthMax;
    }

    public Integer getMonthMax() {
        return monthMax;
    }

    public void setMonthList(List<Integer> monthList) {
        this.monthList = monthList;
    }

    public List<Integer> getMonthList() {
        return monthList;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeaderMin(String leaderMin) {
        this.leaderMin = leaderMin == null ? null : leaderMin.trim();
    }

    public String getLeaderMin() {
        return leaderMin;
    }

    public void setLeaderMax(String leaderMax) {
        this.leaderMax = leaderMax == null ? null : leaderMax.trim();
    }

    public String getLeaderMax() {
        return leaderMax;
    }

    public void setLeaderList(List<String> leaderList) {
        this.leaderList = leaderList;
    }

    public List<String> getLeaderList() {
        return leaderList;
    }

    public void setContect(String contect) {
        this.contect = contect == null ? null : contect.trim();
    }

    public String getContect() {
        return contect;
    }

    public void setContectMin(String contectMin) {
        this.contectMin = contectMin == null ? null : contectMin.trim();
    }

    public String getContectMin() {
        return contectMin;
    }

    public void setContectMax(String contectMax) {
        this.contectMax = contectMax == null ? null : contectMax.trim();
    }

    public String getContectMax() {
        return contectMax;
    }

    public void setContectList(List<String> contectList) {
        this.contectList = contectList;
    }

    public List<String> getContectList() {
        return contectList;
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

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreatorMin(String creatorMin) {
        this.creatorMin = creatorMin == null ? null : creatorMin.trim();
    }

    public String getCreatorMin() {
        return creatorMin;
    }

    public void setCreatorMax(String creatorMax) {
        this.creatorMax = creatorMax == null ? null : creatorMax.trim();
    }

    public String getCreatorMax() {
        return creatorMax;
    }

    public void setCreatorList(List<String> creatorList) {
        this.creatorList = creatorList;
    }

    public List<String> getCreatorList() {
        return creatorList;
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

    public void setModify(String modify) {
        this.modify = modify == null ? null : modify.trim();
    }

    public String getModify() {
        return modify;
    }

    public void setModifyMin(String modifyMin) {
        this.modifyMin = modifyMin == null ? null : modifyMin.trim();
    }

    public String getModifyMin() {
        return modifyMin;
    }

    public void setModifyMax(String modifyMax) {
        this.modifyMax = modifyMax == null ? null : modifyMax.trim();
    }

    public String getModifyMax() {
        return modifyMax;
    }

    public void setModifyList(List<String> modifyList) {
        this.modifyList = modifyList;
    }

    public List<String> getModifyList() {
        return modifyList;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytimeMin(Date modifytimeMin) {
        this.modifytimeMin = modifytimeMin;
    }

    public Date getModifytimeMin() {
        return modifytimeMin;
    }

    public void setModifytimeMax(Date modifytimeMax) {
        this.modifytimeMax = modifytimeMax;
    }

    public Date getModifytimeMax() {
        return modifytimeMax;
    }

    public void setCreatordataid(String creatordataid) {
        this.creatordataid = creatordataid == null ? null : creatordataid.trim();
    }

    public String getCreatordataid() {
        return creatordataid;
    }

    public void setCreatordataidMin(String creatordataidMin) {
        this.creatordataidMin = creatordataidMin == null ? null : creatordataidMin.trim();
    }

    public String getCreatordataidMin() {
        return creatordataidMin;
    }

    public void setCreatordataidMax(String creatordataidMax) {
        this.creatordataidMax = creatordataidMax == null ? null : creatordataidMax.trim();
    }

    public String getCreatordataidMax() {
        return creatordataidMax;
    }

    public void setCreatordataidList(List<String> creatordataidList) {
        this.creatordataidList = creatordataidList;
    }

    public List<String> getCreatordataidList() {
        return creatordataidList;
    }

    public void setModifydataid(String modifydataid) {
        this.modifydataid = modifydataid == null ? null : modifydataid.trim();
    }

    public String getModifydataid() {
        return modifydataid;
    }

    public void setModifydataidMin(String modifydataidMin) {
        this.modifydataidMin = modifydataidMin == null ? null : modifydataidMin.trim();
    }

    public String getModifydataidMin() {
        return modifydataidMin;
    }

    public void setModifydataidMax(String modifydataidMax) {
        this.modifydataidMax = modifydataidMax == null ? null : modifydataidMax.trim();
    }

    public String getModifydataidMax() {
        return modifydataidMax;
    }

    public void setModifydataidList(List<String> modifydataidList) {
        this.modifydataidList = modifydataidList;
    }

    public List<String> getModifydataidList() {
        return modifydataidList;
    }
}