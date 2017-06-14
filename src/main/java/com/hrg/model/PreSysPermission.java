package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_pre_sys_permission
 */
public class PreSysPermission implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 分组Code
     */
    public static final String GROUPCODE = "groupcode";

    /**
     * 分组Code
     */
    private String groupcode;

    /**
     * 分组Name
     */
    public static final String GROUPNAME = "groupname";

    /**
     * 分组Name
     */
    private String groupname;

    /**
     * 权限Code
     */
    public static final String PERMISSIONCODE = "permissioncode";

    /**
     * 权限Code
     */
    private String permissioncode;

    /**
     * 权限Name
     */
    public static final String PERMISSIONNAME = "permissionname";

    /**
     * 权限Name
     */
    private String permissionname;

    /**
     * 权限URL
     */
    public static final String PERMISSIONURL = "permissionurl";

    /**
     * 权限URL
     */
    private String permissionurl;

    /**
     * 操作权限
     */
    public static final String CONTROPERMISSION = "contropermission";

    /**
     * 操作权限
     */
    private String contropermission;

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
     * @return groupcode
     *         分组Code
     */
    public String getGroupcode() {
        return groupcode;
    }

    /**
     * @param groupcode
     *         分组Code
     */
    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode == null ? null : groupcode.trim();
    }

    /**
     * @return groupname
     *         分组Name
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * @param groupname
     *         分组Name
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
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

    /**
     * @return permissionname
     *         权限Name
     */
    public String getPermissionname() {
        return permissionname;
    }

    /**
     * @param permissionname
     *         权限Name
     */
    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    /**
     * @return permissionurl
     *         权限URL
     */
    public String getPermissionurl() {
        return permissionurl;
    }

    /**
     * @param permissionurl
     *         权限URL
     */
    public void setPermissionurl(String permissionurl) {
        this.permissionurl = permissionurl == null ? null : permissionurl.trim();
    }

    /**
     * @return contropermission
     *         操作权限
     */
    public String getContropermission() {
        return contropermission;
    }

    /**
     * @param contropermission
     *         操作权限
     */
    public void setContropermission(String contropermission) {
        this.contropermission = contropermission == null ? null : contropermission.trim();
    }
}