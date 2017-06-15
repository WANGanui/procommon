package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_module_rel_permission
 */
public class ModuleRelPermission implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 模块id
     */
    public static final String MODULEID = "moduleid";

    /**
     * 模块id
     */
    private String moduleid;

    /**
     * 权限id
     */
    public static final String PERMISSIONID = "permissionid";

    /**
     * 权限id
     */
    private String permissionid;

    /**
     * 操作权限
     */
    public static final String OPTIONS = "options";

    /**
     * 操作权限
     */
    private String options;

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
     * @return moduleid
     *         模块id
     */
    public String getModuleid() {
        return moduleid;
    }

    /**
     * @param moduleid
     *         模块id
     */
    public void setModuleid(String moduleid) {
        this.moduleid = moduleid == null ? null : moduleid.trim();
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
}