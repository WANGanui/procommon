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

    /**
     * 权限url
     */
    public static final String MODULEURL = "moduleurl";

    /**
     * 权限url
     */
    private String moduleurl;

    /**
     * 操作权限
     */
    public static final String OPTIONS = "options";

    /**
     * 操作权限
     */
    private String options;

    /**
     * 模块名称
     */
    public static final String MODULENAME = "modulename";

    /**
     * 模块名称
     */
    private String modulename;

    /**
     * 模块子id
     */
    public static final String MODULEPID = "modulepid";

    /**
     * 模块子id
     */
    private String modulepid;

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

    /**
     * @return moduleurl
     *         权限url
     */
    public String getModuleurl() {
        return moduleurl;
    }

    /**
     * @param moduleurl
     *         权限url
     */
    public void setModuleurl(String moduleurl) {
        this.moduleurl = moduleurl == null ? null : moduleurl.trim();
    }

    /**
     * @return options
     *         操作权限
     */
    public String getOptions() {
        return options;
    }

    /**
     * @param options
     *         操作权限
     */
    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    /**
     * @return modulename
     *         模块名称
     */
    public String getModulename() {
        return modulename;
    }

    /**
     * @param modulename
     *         模块名称
     */
    public void setModulename(String modulename) {
        this.modulename = modulename == null ? null : modulename.trim();
    }

    /**
     * @return modulepid
     *         模块子id
     */
    public String getModulepid() {
        return modulepid;
    }

    /**
     * @param modulepid
     *         模块子id
     */
    public void setModulepid(String modulepid) {
        this.modulepid = modulepid == null ? null : modulepid.trim();
    }
}