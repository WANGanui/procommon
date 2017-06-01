package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_worker_role_permission
 */
public class WorkerRolePermission implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 员工角色id
     */
    public static final String ROLEID = "roleid";

    /**
     * 员工角色id
     */
    private String roleid;

    /**
     * 父级角色id
     */
    public static final String PARENTROLEID = "parentroleid";

    /**
     * 父级角色id
     */
    private String parentroleid;

    /**
     * 权限id
     */
    public static final String PERMISSIONID = "permissionid";

    /**
     * 权限id
     */
    private String permissionid;

    /**
     * 权限code
     */
    public static final String PERMISSIONCODE = "permissioncode";

    /**
     * 权限code
     */
    private String permissioncode;

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
     *         员工角色id
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     *         员工角色id
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
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

    /**
     * @return permissioncode
     *         权限code
     */
    public String getPermissioncode() {
        return permissioncode;
    }

    /**
     * @param permissioncode
     *         权限code
     */
    public void setPermissioncode(String permissioncode) {
        this.permissioncode = permissioncode == null ? null : permissioncode.trim();
    }
}