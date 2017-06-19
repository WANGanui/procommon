package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_worker_role
 */
public class WorkerRole implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 员工ID
     */
    public static final String WORKERDATAID = "workerdataid";

    /**
     * 员工ID
     */
    private String workerdataid;

    /**
     * 角色ID
     */
    public static final String ROLEID = "roleid";

    /**
     * 角色ID
     */
    private String roleid;

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
     *         员工ID
     */
    public String getWorkerdataid() {
        return workerdataid;
    }

    /**
     * @param workerdataid
     *         员工ID
     */
    public void setWorkerdataid(String workerdataid) {
        this.workerdataid = workerdataid == null ? null : workerdataid.trim();
    }

    /**
     * @return roleid
     *         角色ID
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     *         角色ID
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }
}