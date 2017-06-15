package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_pre_role_permission
 */
public class PreRolePermission implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 角色id
     */
    public static final String ROLEID = "roleid";

    /**
     * 角色id
     */
    private String roleid;

    /**
     * 权限id
     */
    public static final String PERMISSIONID = "permissionid";

    /**
     * 权限id
     */
    private String permissionid;

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
     * @return roleid
     *         角色id
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     *         角色id
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * @return permissionid
     *         权限id
     */
    public String getPermissionid() {
        return permissionid;
    }

    /**
     * @param permissionid
     *         权限id
     */
    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }
}