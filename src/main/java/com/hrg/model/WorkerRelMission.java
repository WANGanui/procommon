package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_worker_rel_mission
 */
public class WorkerRelMission implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 员工编号
     */
    public static final String WORKERDATAID = "workerdataid";

    /**
     * 员工编号
     */
    private String workerdataid;

    /**
     * 员工姓名
     */
    public static final String WORKERNAME = "workername";

    /**
     * 员工姓名
     */
    private String workername;

    /**
     * 任务编号
     */
    public static final String MISSIONDATAID = "missiondataid";

    /**
     * 任务编号
     */
    private String missiondataid;

    /**
     * 任务名称
     */
    public static final String MISSIONNAME = "missionname";

    /**
     * 任务名称
     */
    private String missionname;

    /**
     * 完成质量
     */
    public static final String QUALITY = "quality";

    /**
     * 完成质量
     */
    private String quality;

    /**
     * 进度
     */
    public static final String SCHEDULE = "schedule";

    /**
     * 进度
     */
    private String schedule;

    /**
     * 得分
     */
    public static final String POINT = "point";

    /**
     * 得分
     */
    private Integer point;

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
     * @return workerdataid
     *         员工编号
     */
    public String getWorkerdataid() {
        return workerdataid;
    }

    /**
     * @param workerdataid
     *         员工编号
     */
    public void setWorkerdataid(String workerdataid) {
        this.workerdataid = workerdataid == null ? null : workerdataid.trim();
    }

    /**
     * @return workername
     *         员工姓名
     */
    public String getWorkername() {
        return workername;
    }

    /**
     * @param workername
     *         员工姓名
     */
    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    /**
     * @return missiondataid
     *         任务编号
     */
    public String getMissiondataid() {
        return missiondataid;
    }

    /**
     * @param missiondataid
     *         任务编号
     */
    public void setMissiondataid(String missiondataid) {
        this.missiondataid = missiondataid == null ? null : missiondataid.trim();
    }

    /**
     * @return missionname
     *         任务名称
     */
    public String getMissionname() {
        return missionname;
    }

    /**
     * @param missionname
     *         任务名称
     */
    public void setMissionname(String missionname) {
        this.missionname = missionname == null ? null : missionname.trim();
    }

    /**
     * @return quality
     *         完成质量
     */
    public String getQuality() {
        return quality;
    }

    /**
     * @param quality
     *         完成质量
     */
    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    /**
     * @return schedule
     *         进度
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule
     *         进度
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule == null ? null : schedule.trim();
    }

    /**
     * @return point
     *         得分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * @param point
     *         得分
     */
    public void setPoint(Integer point) {
        this.point = point;
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