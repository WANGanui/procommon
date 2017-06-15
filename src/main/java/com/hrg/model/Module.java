package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_module
 */
public class Module implements Serializable {
    /**
     * datatid
     */
    public static final String DATATID = "datatid";

    /**
     * datatid
     */
    private String datatid;

    /**
     * 模块名称
     */
    public static final String MODULENAME = "modulename";

    /**
     * 模块名称
     */
    private String modulename;

    /**
     * 模块地址
     */
    public static final String MODULEURL = "moduleurl";

    /**
     * 模块地址
     */
    private String moduleurl;

    /**
     * 模块子ID
     */
    public static final String MODULEPID = "modulepid";

    /**
     * 模块子ID
     */
    private String modulepid;

    private static final long serialVersionUID = 1L;

    /**
     * @return datatid
     *         datatid
     */
    public String getDatatid() {
        return datatid;
    }

    /**
     * @param datatid
     *         datatid
     */
    public void setDatatid(String datatid) {
        this.datatid = datatid == null ? null : datatid.trim();
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
     * @return moduleurl
     *         模块地址
     */
    public String getModuleurl() {
        return moduleurl;
    }

    /**
     * @param moduleurl
     *         模块地址
     */
    public void setModuleurl(String moduleurl) {
        this.moduleurl = moduleurl == null ? null : moduleurl.trim();
    }

    /**
     * @return modulepid
     *         模块子ID
     */
    public String getModulepid() {
        return modulepid;
    }

    /**
     * @param modulepid
     *         模块子ID
     */
    public void setModulepid(String modulepid) {
        this.modulepid = modulepid == null ? null : modulepid.trim();
    }
}