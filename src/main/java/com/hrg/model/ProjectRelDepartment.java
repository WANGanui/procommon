package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_project_rel_department
 */
public class ProjectRelDepartment implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 项目ID
     */
    public static final String PROJECTID = "projectid";

    /**
     * 项目ID
     */
    private String projectid;

    /**
     * 部门id
     */
    public static final String DEPARTMENTID = "departmentid";

    /**
     * 部门id
     */
    private String departmentid;

    /**
     * 部门完成百分比
     */
    public static final String PERCENTAGE = "percentage";

    /**
     * 部门完成百分比
     */
    private String percentage;

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
     * @return projectid
     *         项目ID
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     *         项目ID
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    /**
     * @return departmentid
     *         部门id
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * @param departmentid
     *         部门id
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    /**
     * @return percentage
     *         部门完成百分比
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * @param percentage
     *         部门完成百分比
     */
    public void setPercentage(String percentage) {
        this.percentage = percentage == null ? null : percentage.trim();
    }
}