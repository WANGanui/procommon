package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_pre_sys_role
 */
public class PreSysRole implements Serializable {
    /**
     * 角色ID
     */
    public static final String DATAID = "dataid";

    /**
     * 角色ID
     */
    private String dataid;

    /**
     * 角色名称
     */
    public static final String ROLENAME = "rolename";

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 父级角色ID
     */
    public static final String PARENTROLEDATAID = "parentroledataid";

    /**
     * 父级角色ID
     */
    private String parentroledataid;

    private static final long serialVersionUID = 1L;

    /**
     * @return dataid
     *         角色ID
     */
    public String getDataid() {
        return dataid;
    }

    /**
     * @param dataid
     *         角色ID
     */
    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
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

    /**
     * @return parentroledataid
     *         父级角色ID
     */
    public String getParentroledataid() {
        return parentroledataid;
    }

    /**
     * @param parentroledataid
     *         父级角色ID
     */
    public void setParentroledataid(String parentroledataid) {
        this.parentroledataid = parentroledataid == null ? null : parentroledataid.trim();
    }
}