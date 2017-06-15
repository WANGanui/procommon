package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_permission
 */
public class Permission implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 权限名称
     */
    public static final String PERMISSIONNAME = "permissionname";

    /**
     * 权限名称
     */
    private String permissionname;

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
     * @return permissionname
     *         权限名称
     */
    public String getPermissionname() {
        return permissionname;
    }

    /**
     * @param permissionname
     *         权限名称
     */
    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }
}