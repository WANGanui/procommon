package com.hrg.model;

import java.io.Serializable;

/**
 * hrg_worker_rel_project
 */
public class HrgWorkerRelProject implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 员工编号
     */
    public static final String WORKERDATAID = "workerdataid";

    /**
     * 员工编号
     */
    private String workerdataid;

    /**
     * 员工名称
     */
    public static final String WORKERNAME = "workername";

    /**
     * 员工名称
     */
    private String workername;

    /**
     * 项目编号
     */
    public static final String PROJECTDATAID = "projectdataid";

    /**
     * 项目编号
     */
    private String projectdataid;

    /**
     * 项目名称
     */
    public static final String PROJECTNAME = "projectname";

    /**
     * 项目名称
     */
    private String projectname;

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
     * @return workerdataid
     *         员工编号
     */
    public String getWorkerdataid() {
        return workerdataid;
    }

    /**
     * @param workerdataid
     *         员工编号
     */
    public void setWorkerdataid(String workerdataid) {
        this.workerdataid = workerdataid == null ? null : workerdataid.trim();
    }

    /**
     * @return workername
     *         员工名称
     */
    public String getWorkername() {
        return workername;
    }

    /**
     * @param workername
     *         员工名称
     */
    public void setWorkername(String workername) {
        this.workername = workername == null ? null : workername.trim();
    }

    /**
     * @return projectdataid
     *         项目编号
     */
    public String getProjectdataid() {
        return projectdataid;
    }

    /**
     * @param projectdataid
     *         项目编号
     */
    public void setProjectdataid(String projectdataid) {
        this.projectdataid = projectdataid == null ? null : projectdataid.trim();
    }

    /**
     * @return projectname
     *         项目名称
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * @param projectname
     *         项目名称
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }
}