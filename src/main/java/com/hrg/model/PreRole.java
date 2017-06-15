package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_pre_role
 */
public class PreRole implements Serializable {
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
    public static final String NAME = "name";

    /**
     * 角色名称
     */
    private String name;

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
     * @return name
     *         角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *         角色名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}