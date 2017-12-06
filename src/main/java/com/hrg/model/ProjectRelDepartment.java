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
     * ��ĿID
     */
    public static final String PROJECTID = "projectid";

    /**
     * ��ĿID
     */
    private String projectid;

    /**
     * ����id
     */
    public static final String DEPARTMENTID = "departmentid";

    /**
     * ����id
     */
    private String departmentid;

    /**
     * ������ɰٷֱ�
     */
    public static final String PERCENTAGE = "percentage";

    /**
     * ������ɰٷֱ�
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
     *         ��ĿID
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     *         ��ĿID
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    /**
     * @return departmentid
     *         ����id
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * @param departmentid
     *         ����id
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    /**
     * @return percentage
     *         ������ɰٷֱ�
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * @param percentage
     *         ������ɰٷֱ�
     */
    public void setPercentage(String percentage) {
        this.percentage = percentage == null ? null : percentage.trim();
    }
}