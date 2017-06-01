package com.hrg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hrg_project
 */
public class HrgProject implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 项目名称
     */
    public static final String NAME = "name";

    /**
     * 项目名称
     */
    private String name;

    /**
     * 开始时间
     */
    public static final String STARTTIME = "starttime";

    /**
     * 开始时间
     */
    private Date starttime;

    /**
     * 计划结束时间
     */
    public static final String ENDTIME = "endtime";

    /**
     * 计划结束时间
     */
    private Date endtime;

    /**
     * 天数
     */
    public static final String DAYS = "days";

    /**
     * 天数
     */
    private Integer days;

    /**
     * 月数
     */
    public static final String MONTH = "month";

    /**
     * 月数
     */
    private Integer month;

    /**
     * 项目负责人
     */
    public static final String LEADER = "leader";

    /**
     * 项目负责人
     */
    private String leader;

    /**
     * 项目内容
     */
    public static final String CONTECT = "contect";

    /**
     * 项目内容
     */
    private String contect;

    /**
     * 状态
     */
    public static final String STATE = "state";

    /**
     * 状态
     */
    private String state;

    /**
     * 实际结束时间
     */
    public static final String FINISHTIME = "finishtime";

    /**
     * 实际结束时间
     */
    private Date finishtime;

    /**
     * 备注
     */
    public static final String REMARK = "remark";

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * @return dataid
     *         dataid
     */
    public String getDataid() {
        return dataid;
    }

    /**
     * @param dataid
     *         dataid
     */
    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
    }

    /**
     * @return name
     *         项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         项目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return starttime
     *         开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param starttime
     *         开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return endtime
     *         计划结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     *         计划结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return days
     *         天数
     */
    public Integer getDays() {
        return days;
    }

    /**
     * @param days
     *         天数
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * @return month
     *         月数
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * @param month
     *         月数
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * @return leader
     *         项目负责人
     */
    public String getLeader() {
        return leader;
    }

    /**
     * @param leader
     *         项目负责人
     */
    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    /**
     * @return contect
     *         项目内容
     */
    public String getContect() {
        return contect;
    }

    /**
     * @param contect
     *         项目内容
     */
    public void setContect(String contect) {
        this.contect = contect == null ? null : contect.trim();
    }

    /**
     * @return state
     *         状态
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     *         状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * @return finishtime
     *         实际结束时间
     */
    public Date getFinishtime() {
        return finishtime;
    }

    /**
     * @param finishtime
     *         实际结束时间
     */
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    /**
     * @return remark
     *         备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     *         备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}