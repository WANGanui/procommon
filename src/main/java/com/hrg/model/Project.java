package com.hrg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hrg_project
 */
public class Project implements Serializable {
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
     * 负责人id
     */
    public static final String LEADERID = "leaderid";

    /**
     * 负责人id
     */
    private String leaderid;

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

    /**
     * 创建人
     */
    public static final String CREATOR = "creator";

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    public static final String CREATETIME = "createtime";

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改人
     */
    public static final String MODIFY = "modify";

    /**
     * 修改人
     */
    private String modify;

    /**
     * 修改时间
     */
    public static final String MODIFYTIME = "modifytime";

    /**
     * 修改时间
     */
    private Date modifytime;

    /**
     * 创建人id
     */
    public static final String CREATORDATAID = "creatordataid";

    /**
     * 创建人id
     */
    private String creatordataid;

    /**
     * 修改人id
     */
    public static final String MODIFYDATAID = "modifydataid";

    /**
     * 修改人id
     */
    private String modifydataid;

    /**
     * 进度
     */
    public static final String PROGRESS = "progress";

    /**
     * 进度
     */
    private String progress;

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
     * @return leaderid
     *         负责人id
     */
    public String getLeaderid() {
        return leaderid;
    }

    /**
     * @param leaderid
     *         负责人id
     */
    public void setLeaderid(String leaderid) {
        this.leaderid = leaderid == null ? null : leaderid.trim();
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

    /**
     * @return creator
     *         创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     *         创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * @return createtime
     *         创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     *         创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return modify
     *         修改人
     */
    public String getModify() {
        return modify;
    }

    /**
     * @param modify
     *         修改人
     */
    public void setModify(String modify) {
        this.modify = modify == null ? null : modify.trim();
    }

    /**
     * @return modifytime
     *         修改时间
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * @param modifytime
     *         修改时间
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * @return creatordataid
     *         创建人id
     */
    public String getCreatordataid() {
        return creatordataid;
    }

    /**
     * @param creatordataid
     *         创建人id
     */
    public void setCreatordataid(String creatordataid) {
        this.creatordataid = creatordataid == null ? null : creatordataid.trim();
    }

    /**
     * @return modifydataid
     *         修改人id
     */
    public String getModifydataid() {
        return modifydataid;
    }

    /**
     * @param modifydataid
     *         修改人id
     */
    public void setModifydataid(String modifydataid) {
        this.modifydataid = modifydataid == null ? null : modifydataid.trim();
    }

    /**
     * @return progress
     *         进度
     */
    public String getProgress() {
        return progress;
    }

    /**
     * @param progress
     *         进度
     */
    public void setProgress(String progress) {
        this.progress = progress == null ? null : progress.trim();
    }
}