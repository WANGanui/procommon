package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_project_audit
 */
public class ProjectAudit implements Serializable {
    /**
     * ������id
     */
    public static final String ID = "id";

    /**
     * ������id
     */
    private Integer id;

    /**
     * ��ĿID
     */
    public static final String PROJECTID = "projectid";

    /**
     * ��ĿID
     */
    private String projectid;

    /**
     * �����id
     */
    public static final String AUDITORID = "auditorid";

    /**
     * �����id
     */
    private String auditorid;

    /**
     * ���״̬
     */
    public static final String AUDITSTATE = "auditstate";

    /**
     * ���״̬
     */
    private String auditstate;

    /**
     * ����id
     */
    public static final String ORDERID = "orderid";

    /**
     * ����id
     */
    private Integer orderid;

    /**
     * ��ע
     */
    public static final String REMARK = "remark";

    /**
     * ��ע
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     *         ������id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     *         ������id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return projectid
     *         ��ĿID
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     *         ��ĿID
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    /**
     * @return auditorid
     *         �����id
     */
    public String getAuditorid() {
        return auditorid;
    }

    /**
     * @param auditorid
     *         �����id
     */
    public void setAuditorid(String auditorid) {
        this.auditorid = auditorid == null ? null : auditorid.trim();
    }

    /**
     * @return auditstate
     *         ���״̬
     */
    public String getAuditstate() {
        return auditstate;
    }

    /**
     * @param auditstate
     *         ���״̬
     */
    public void setAuditstate(String auditstate) {
        this.auditstate = auditstate == null ? null : auditstate.trim();
    }

    /**
     * @return orderid
     *         ����id
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * @param orderid
     *         ����id
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * @return remark
     *         ��ע
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     *         ��ע
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}