package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_project_audit_del
 */
public class ProjectAuditDel implements Serializable {
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
    public static final String PROJECTID = "projectid";

    /**
     * 项目ID
     */
    private String projectid;

    /**
     * 审核人id
     */
    public static final String AUDITORID = "auditorid";

    /**
     * 审核人id
     */
    private String auditorid;

    /**
     * 审核状态
     */
    public static final String AUDITSTATE = "auditstate";

    /**
     * 审核状态
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
     * @return projectid
     *         项目ID
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     *         项目ID
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
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
     *         审核状态
     */
    public String getAuditstate() {
        return auditstate;
    }

    /**
     * @param auditstate
     *         审核状态
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
}