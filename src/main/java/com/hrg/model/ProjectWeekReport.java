package com.hrg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hrg_project_weekreport
 */
public class ProjectWeekReport implements Serializable {
    /**
     * dataid
     */
    public static final String DATAID = "dataid";

    /**
     * dataid
     */
    private String dataid;

    /**
     * 项目id
     */
    public static final String PROJECTID = "projectid";

    /**
     * 项目id
     */
    private String projectid;

    /**
     * 日期
     */
    public static final String DATE = "date";

    /**
     * 日期
     */
    private Date date;

    /**
     * 本周工作内容
     */
    public static final String CONTEXT = "context";

    /**
     * 本周工作内容
     */
    private String context;

    /**
     * 下周工作计划
     */
    public static final String PLAN = "plan";

    /**
     * 下周工作计划
     */
    private String plan;

    /**
     * 目标
     */
    public static final String TARGET = "target";

    /**
     * 目标
     */
    private String target;

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
     * @return projectid
     *         项目id
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     *         项目id
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    /**
     * @return date
     *         日期
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     *         日期
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return context
     *         本周工作内容
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context
     *         本周工作内容
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * @return plan
     *         下周工作计划
     */
    public String getPlan() {
        return plan;
    }

    /**
     * @param plan
     *         下周工作计划
     */
    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }

    /**
     * @return target
     *         目标
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target
     *         目标
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
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