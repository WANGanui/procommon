package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_mission_audit
 */
public class MissionAudit implements Serializable {
    /**
     * 自增长id
     */
    public static final String ID = "id";

    /**
     * 自增长id
     */
    private Integer id;

    /**
     * 项目ID
     */
    public static final String MISSIONID = "missionid";

    /**
     * 项目ID
     */
    private String missionid;

    /**
     * 审核人id
     */
    public static final String AUDITORID = "auditorid";

    /**
     * 审核人id
     */
    private String auditorid;

    /**
     * 审核状态(0通过 1拒绝)
     */
    public static final String AUDITSTATE = "auditstate";

    /**
     * 审核状态(0通过 1拒绝)
     */
    private String auditstate;

    /**
     * 排序id
     */
    public static final String ORDERID = "orderid";

    /**
     * 排序id
     */
    private Integer orderid;

    /**
     * 备注
     */
    public static final String REMARK = "remark";

    /**
     * 备注
     */
    private String remark;

    /**
     * 审核人名称
     */
    public static final String AUDITNAME = "auditname";

    /**
     * 审核人名称
     */
    private String auditname;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     *         自增长id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     *         自增长id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return missionid
     *         项目ID
     */
    public String getMissionid() {
        return missionid;
    }

    /**
     * @param missionid
     *         项目ID
     */
    public void setMissionid(String missionid) {
        this.missionid = missionid == null ? null : missionid.trim();
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
     * @return auditstate
     *         审核状态(0通过 1拒绝)
     */
    public String getAuditstate() {
        return auditstate;
    }

    /**
     * @param auditstate
     *         审核状态(0通过 1拒绝)
     */
    public void setAuditstate(String auditstate) {
        this.auditstate = auditstate == null ? null : auditstate.trim();
    }

    /**
     * @return orderid
     *         排序id
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * @param orderid
     *         排序id
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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
     * @return auditname
     *         审核人名称
     */
    public String getAuditname() {
        return auditname;
    }

    /**
     * @param auditname
     *         审核人名称
     */
    public void setAuditname(String auditname) {
        this.auditname = auditname == null ? null : auditname.trim();
    }
}