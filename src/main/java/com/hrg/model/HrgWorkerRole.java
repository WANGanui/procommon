package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_worker_role
 */
public class HrgWorkerRole implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 员工id
     */
    public static final String WORKERDATAID = "workerdataid";

    /**
     * 员工id
     */
    private String workerdataid;

    /**
     * 预定义角色id
     */
    public static final String PREROLEID = "preroleid";

    /**
     * 预定义角色id
     */
    private String preroleid;

    /**
     * 父级角色id
     */
    public static final String PARENTROLEID = "parentroleid";

    /**
     * 父级角色id
     */
    private String parentroleid;

    /**
     * 角色名称
     */
    public static final String ROLENAME = "rolename";

    /**
     * 角色名称
     */
    private String rolename;

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
     *         员工id
     */
    public String getWorkerdataid() {
        return workerdataid;
    }

    /**
     * @param workerdataid
     *         员工id
     */
    public void setWorkerdataid(String workerdataid) {
        this.workerdataid = workerdataid == null ? null : workerdataid.trim();
    }

    /**
     * @return preroleid
     *         预定义角色id
     */
    public String getPreroleid() {
        return preroleid;
    }

    /**
     * @param preroleid
     *         预定义角色id
     */
    public void setPreroleid(String preroleid) {
        this.preroleid = preroleid == null ? null : preroleid.trim();
    }

    /**
     * @return parentroleid
     *         父级角色id
     */
    public String getParentroleid() {
        return parentroleid;
    }

    /**
     * @param parentroleid
     *         父级角色id
     */
    public void setParentroleid(String parentroleid) {
        this.parentroleid = parentroleid == null ? null : parentroleid.trim();
    }

    /**
     * @return rolename
     *         角色名称
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * @param rolename
     *         角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }
}