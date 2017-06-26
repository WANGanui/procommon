package com.hrg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hrg_mission
 */
public class Mission implements Serializable {
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
     * 任务状态(0已同意1已拒绝2待审核)
     */
    public static final String MISSIONSTATE = "missionstate";

    /**
     * 任务状态(0已同意1已拒绝2待审核)
     */
    private String missionstate;

    /**
     * 项目id
     */
    public static final String PRODATAID = "prodataid";

    /**
     * 项目id
     */
    private String prodataid;

    /**
     * 项目名称
     */
    public static final String PRONAME = "proname";

    /**
     * 项目名称
     */
    private String proname;

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

    /**
     * 创建人
     */
    public static final String CREATOR = "creator";

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人id
     */
    public static final String CREATORDATAID = "creatordataid";

    /**
     * 创建人id
     */
    private String creatordataid;

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
     * 修改人id
     */
    public static final String MODIFYDATAID = "modifydataid";

    /**
     * 修改人id
     */
    private String modifydataid;

    /**
     * 修改时间
     */
    public static final String MODIFYTIME = "modifytime";

    /**
     * 修改时间
     */
    private Date modifytime;

    /**
     * 类型（0.项目任务，1.个人任务）
     */
    public static final String TYPE = "type";

    /**
     * 类型（0.项目任务，1.个人任务）
     */
    private String type;

    /**
     * 责任人ID
     */
    public static final String HEADERID = "headerid";

    /**
     * 责任人ID
     */
    private String headerid;

    /**
     * 责任人名称
     */
    public static final String HEADERNAME = "headername";

    /**
     * 责任人名称
     */
    private String headername;

    /**
     * 审核人id
     */
    public static final String AUDITORID = "auditorid";

    /**
     * 审核人id
     */
    private String auditorid;

    /**
     * 审核人名称
     */
    public static final String AUDITORNAME = "auditorname";

    /**
     * 审核人名称
     */
    private String auditorname;

    /**
     * 项目阶段（1现场勘查2设备实测3技术方案设计4成本核算）
     */
    public static final String LEVEL = "level";

    /**
     * 项目阶段（1现场勘查2设备实测3技术方案设计4成本核算）
     */
    private String level;

    /**
     * 流程状态(0未开始1进行中2已完成)
     */
    public static final String STATE = "state";

    /**
     * 流程状态(0未开始1进行中2已完成)
     */
    private String state;

    public static final String MEMBER = "member";


    private String member;

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
     * @return missionstate
     *         任务状态(0已同意1已拒绝2待审核)
     */
    public String getMissionstate() {
        return missionstate;
    }

    /**
     * @param missionstate
     *         任务状态(0已同意1已拒绝2待审核)
     */
    public void setMissionstate(String missionstate) {
        this.missionstate = missionstate == null ? null : missionstate.trim();
    }

    /**
     * @return prodataid
     *         项目id
     */
    public String getProdataid() {
        return prodataid;
    }

    /**
     * @param prodataid
     *         项目id
     */
    public void setProdataid(String prodataid) {
        this.prodataid = prodataid == null ? null : prodataid.trim();
    }

    /**
     * @return proname
     *         项目名称
     */
    public String getProname() {
        return proname;
    }

    /**
     * @param proname
     *         项目名称
     */
    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
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
     * @return type
     *         类型（0.项目任务，1.个人任务）
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *         类型（0.项目任务，1.个人任务）
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return headerid
     *         责任人ID
     */
    public String getHeaderid() {
        return headerid;
    }

    /**
     * @param headerid
     *         责任人ID
     */
    public void setHeaderid(String headerid) {
        this.headerid = headerid == null ? null : headerid.trim();
    }

    /**
     * @return headername
     *         责任人名称
     */
    public String getHeadername() {
        return headername;
    }

    /**
     * @param headername
     *         责任人名称
     */
    public void setHeadername(String headername) {
        this.headername = headername == null ? null : headername.trim();
    }

    /**
     * @return auditorid
     *         审核人id
     */
    public String getAuditorid() {
        return auditorid;
    }

    /**
     * @param auditorid
     *         审核人id
     */
    public void setAuditorid(String auditorid) {
        this.auditorid = auditorid == null ? null : auditorid.trim();
    }

    /**
     * @return auditorname
     *         审核人名称
     */
    public String getAuditorname() {
        return auditorname;
    }

    /**
     * @param auditorname
     *         审核人名称
     */
    public void setAuditorname(String auditorname) {
        this.auditorname = auditorname == null ? null : auditorname.trim();
    }

    /**
     * @return level
     *         项目阶段（1现场勘查2设备实测3技术方案设计4成本核算）
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level
     *         项目阶段（1现场勘查2设备实测3技术方案设计4成本核算）
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * @return state
     *         流程状态(0未开始1进行中2已完成)
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     *         流程状态(0未开始1进行中2已完成)
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }
}