package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_pre_sys_role_rel_permission
 */
public class PreSysRoleRelPermission implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 父级角色ID
     */
    public static final String PARENTROLEDATAID = "parentroledataid";

    /**
     * 父级角色ID
     */
    private String parentroledataid;

    /**
     * 角色ID
     */
    public static final String ROLEDATAID = "roledataid";

    /**
     * 角色ID
     */
    private String roledataid;

    /**
     * 角色名称
     */
    public static final String ROLENAME = "rolename";

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 权限ID
     */
    public static final String PERMISSIONDATAID = "permissiondataid";

    /**
     * 权限ID
     */
    private String permissiondataid;

    /**
     * 权限Code
     */
    public static final String PERMISSIONCODE = "permissioncode";

    /**
     * 权限Code
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

    /**
     * @return roledataid
     *         角色ID
     */
    public String getRoledataid() {
        return roledataid;
    }

    /**
     * @param roledataid
     *         角色ID
     */
    public void setRoledataid(String roledataid) {
        this.roledataid = roledataid == null ? null : roledataid.trim();
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
     * @return permissiondataid
     *         权限ID
     */
    public String getPermissiondataid() {
        return permissiondataid;
    }

    /**
     * @param permissiondataid
     *         权限ID
     */
    public void setPermissiondataid(String permissiondataid) {
        this.permissiondataid = permissiondataid == null ? null : permissiondataid.trim();
    }

    /**
     * @return permissioncode
     *         权限Code
     */
    public String getPermissioncode() {
        return permissioncode;
    }

    /**
     * @param permissioncode
     *         权限Code
     */
    public void setPermissioncode(String permissioncode) {
        this.permissioncode = permissioncode == null ? null : permissioncode.trim();
    }
}