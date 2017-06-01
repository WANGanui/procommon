package com.hrg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hrg_mission
 */
public class HrgMission implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 任务名称
     */
    public static final String NAME = "name";

    /**
     * 任务名称
     */
    private String name;

    /**
     * 任务内容
     */
    public static final String CONTEXT = "context";

    /**
     * 任务内容
     */
    private String context;

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
     * 实际结束时间
     */
    public static final String FINISHTIME = "finishtime";

    /**
     * 实际结束时间
     */
    private Date finishtime;

    /**
     * 状态
     */
    public static final String STATE = "state";

    /**
     * 状态
     */
    private String state;

    /**
     * 项目id
     */
    public static final String PRODATAID = "proDataid";

    /**
     * 项目id
     */
    private String proDataid;

    /**
     * 项目名称
     */
    public static final String PRONAME = "proName";

    /**
     * 项目名称
     */
    private String proName;

    /**
     * 备注
     */
    public static final String REMARK = "remark";

    /**
     * 备注
     */
    private String remark;

    /**
     * 完成百分比
     */
    public static final String PERCENTAGE = "percentage";

    /**
     * 完成百分比
     */
    private String percentage;

    /**
     * 任务比重
     */
    public static final String PROPORTION = "proportion";

    /**
     * 任务比重
     */
    private String proportion;

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
     *         任务名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         任务名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return context
     *         任务内容
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context
     *         任务内容
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
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
     * @return proDataid
     *         项目id
     */
    public String getProDataid() {
        return proDataid;
    }

    /**
     * @param proDataid
     *         项目id
     */
    public void setProDataid(String proDataid) {
        this.proDataid = proDataid == null ? null : proDataid.trim();
    }

    /**
     * @return proName
     *         项目名称
     */
    public String getProName() {
        return proName;
    }

    /**
     * @param proName
     *         项目名称
     */
    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
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

    /**
     * @return percentage
     *         完成百分比
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * @param percentage
     *         完成百分比
     */
    public void setPercentage(String percentage) {
        this.percentage = percentage == null ? null : percentage.trim();
    }

    /**
     * @return proportion
     *         任务比重
     */
    public String getProportion() {
        return proportion;
    }

    /**
     * @param proportion
     *         任务比重
     */
    public void setProportion(String proportion) {
        this.proportion = proportion == null ? null : proportion.trim();
    }
}